package dev.asjordi.repository;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class PetRepository implements IRepository<Pet> {
    
    private Connection conn;
    
    public PetRepository() {}

    public PetRepository(Connection conn) {
        this.conn = conn;
    }
 
    @Override
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Pet> getAll() throws SQLException {
        List<Pet> pets = new ArrayList<>();
        
        try (var stmt = conn.createStatement()) {
            var rs = stmt.executeQuery("SELECT p.*, o.name, o.phone, o.address FROM pets AS p INNER JOIN owners AS o ON p.id_owner = o.id;");
            while (rs.next()) pets.add(createPet(rs));
        }
        
        return pets;
    }

    @Override
    public Pet getById(Integer id) throws SQLException {
        Pet p = null;
        
        try (var ps = conn.prepareStatement("SELECT p.*, o.name, o.phone, o.address FROM pets AS p INNER JOIN owners AS o ON p.id_owner = o.id WHERE p.id = ?;")) {
            ps.setInt(1, id);
            try (var rs = ps.executeQuery()) {
                if (rs.next()) p = createPet(rs);
            }
        }
        
        return p;
    }

    @Override
    public Pet add(Pet p) throws SQLException {
        
        String sql;
        boolean isUpdate = p.getId() != null && p.getId() > 0;
        
        if (isUpdate) sql = "UPDATE pets SET pet_name = ?, dog_breed = ?, color = ?, allergic = ?, special_attention = ?, notes = ?, id_owner = ? WHERE id = ?;";
        else sql = "INSERT INTO pets (pet_name, dog_breed, color, allergic, special_atention, notes, id_owner) values (?, ?, ?, ?, ?, ?, ?);";
        
        try (var ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, p.getPetName());
            ps.setString(2, p.getDogBreed());
            ps.setString(3, p.getColor());
            ps.setBoolean(4, p.getAllergic());
            ps.setBoolean(5, p.getSpecialAttention());
            ps.setString(6, p.getNotes());
            ps.setInt(7, p.getOwner().getId());
            
            if (isUpdate) ps.setInt(8, p.getId());
            
            ps.executeUpdate();
            
            if (p.getId() == null) {
                try (var rs = ps.getGeneratedKeys()) {
                    if (rs.next()) p.setId(rs.getInt(1));
                }
            }
        
        }
        
        return p;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        
        try (var ps = conn.prepareStatement("DELETE FROM pets WHERE id = ?;")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        
    }
    
    private Pet createPet(ResultSet rs) throws SQLException {
        Pet p = new Pet();
        p.setId(rs.getInt("id"));
        p.setPetName(rs.getString("pet_name"));
        p.setDogBreed(rs.getString("dog_breed"));
        p.setColor(rs.getString("color"));
        p.setAllergic(rs.getBoolean("allergic"));
        p.setSpecialAttention(rs.getBoolean("special_attention"));
        p.setNotes(rs.getString("notes"));
        p.setOwner(new Owner(rs.getInt("id_owner"), rs.getString("name"), rs.getString("phone"), rs.getString("address")));
        return p;
    }
    
}
