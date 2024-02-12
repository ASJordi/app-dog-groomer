package dev.asjordi.service;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public interface IService {
    
    List<Pet> getAllPets() throws SQLException;
    Pet getPetById(Integer id) throws SQLException;
    Pet addPet(Pet p) throws SQLException;
    void deletePet(Integer id) throws SQLException;
    
    List<Owner> getAllOwners() throws SQLException;
    Owner getOwnerById(Integer id) throws SQLException;
    Owner addOwner(Owner o) throws SQLException;
    void deleteOwner(Integer id) throws SQLException;
    
    void addPetWithOwner(Pet p, Owner o) throws SQLException;
    
}
