package dev.asjordi.repository;

import dev.asjordi.model.Owner;
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
public class OwnerRepository implements IRepository<Owner> {
    
    private Connection conn;
    
    public OwnerRepository() {}

    public OwnerRepository(Connection conn) {
        this.conn = conn;
    }   

    @Override
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Owner> getAll() throws SQLException {
        List<Owner> list = new ArrayList<>();
        
        try (var stmt = conn.createStatement();
                var rs = stmt.executeQuery("SELECT * FROM owners;")) {
            
            while (rs.next()) list.add(createOwner(rs));
            
        }
        
        return list;
    }

    @Override
    public Owner getById(Integer id) throws SQLException {
        Owner o = new Owner();
        
        try (var ps = conn.prepareStatement("SELECT * FROM owners WHERE id = ?;")) {
            ps.setInt(1, id);
            try (var rs = ps.executeQuery()) {
                if (rs.next()) o = createOwner(rs);
            }
        }
        
        return o;
    }

    @Override
    public Owner add(Owner o) throws SQLException {
        String sql;
        boolean isUpdate = o.getId() != null && o.getId() > 0;
        
        if (isUpdate) sql = "UPDATE owners SET name = ?, phone = ?, address = ? WHERE id = ?;";
        else sql = "INSERT INTO owners (name, phone, address) VALUES (?, ?, ?);";
        
        try (var ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, o.getName());
            ps.setString(2, o.getPhone());
            ps.setString(3, o.getAddress());
            
            if (isUpdate) ps.setInt(4, o.getId());
            
            ps.executeUpdate();
            
            if (o.getId() == null) {
                try (var rs = ps.getGeneratedKeys()) {
                    if (rs.next()) o.setId(rs.getInt(1));
                }
            }
            
        }
        
        return o;
    }

    @Override
    public void delete(Integer id) throws SQLException {
        
        try (var ps = conn.prepareStatement("DELETE FROM owners WHERE id = ?;")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
        
    }
    
    private Owner createOwner(ResultSet rs) throws SQLException {
        Owner o = new Owner();
        
        o.setId(rs.getInt("id"));
        o.setName(rs.getString("name"));
        o.setPhone(rs.getString("phone"));
        o.setAddress(rs.getString("address"));
        
        return o;
    }
    
}
