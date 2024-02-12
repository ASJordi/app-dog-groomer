package dev.asjordi.service;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import dev.asjordi.repository.IRepository;
import dev.asjordi.repository.OwnerRepository;
import dev.asjordi.repository.PetRepository;
import dev.asjordi.util.ConnectionDatabase;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class PetOwnerService implements IService {
    
    private IRepository<Pet> petRepo;
    private IRepository<Owner> ownerRepo;

    public PetOwnerService() {
        this.petRepo = new PetRepository();
        this.ownerRepo = new OwnerRepository();
    }

    @Override
    public List<Pet> getAllPets() throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            petRepo.setConn(conn);
            return petRepo.getAll();
        }
        
    }

    @Override
    public Pet getPetById(Integer id) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            petRepo.setConn(conn);
            return petRepo.getById(id);
        }
        
    }

    @Override
    public Pet addPet(Pet p) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            petRepo.setConn(conn);
            if (conn.getAutoCommit()) conn.setAutoCommit(false);
            
            Pet newPet = null;
            
            try {
                newPet = petRepo.add(p);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            
            return newPet;
        }
        
    }

    @Override
    public void deletePet(Integer id) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            petRepo.setConn(conn);
            if (conn.getAutoCommit()) conn.setAutoCommit(false);
            
            try {
                petRepo.delete(id);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
        }
        
    }

    @Override
    public List<Owner> getAllOwners() throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            ownerRepo.setConn(conn);
            return ownerRepo.getAll();
        }
        
    }

    @Override
    public Owner getOwnerById(Integer id) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            ownerRepo.setConn(conn);
            return ownerRepo.getById(id);
        }
        
    }

    @Override
    public Owner addOwner(Owner o) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            ownerRepo.setConn(conn);
            if (conn.getAutoCommit()) conn.setAutoCommit(false);
            Owner newOwner = null;
            
            try {
                newOwner = ownerRepo.add(o);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            
            return newOwner;
        }
        
    }

    @Override
    public void deleteOwner(Integer id) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            ownerRepo.setConn(conn);
            if (conn.getAutoCommit()) conn.setAutoCommit(false);
            
            try {
                ownerRepo.delete(id);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            
        }
        
    }

    @Override
    public void addPetWithOwner(Pet p, Owner o) throws SQLException {
        
        try (var conn = ConnectionDatabase.getConnection()) {
            petRepo.setConn(conn);
            ownerRepo.setConn(conn);
            
            if (conn.getAutoCommit()) conn.setAutoCommit(false);
            
            try {
                Owner newOwner = ownerRepo.add(o);
                p.setOwner(newOwner);
                petRepo.add(p);
                conn.commit();
            } catch (SQLException e) {
                conn.rollback();
                e.printStackTrace();
            }
            
            
        }
        
    }
    
}
