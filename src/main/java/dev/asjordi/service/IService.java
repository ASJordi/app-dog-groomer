package dev.asjordi.service;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public interface IService {
    
    List<Pet> getAllPets() throws Exception;
    Pet getPetById(Integer id) throws Exception;
    void addPet(Pet p) throws Exception;
    void deletePet(Integer id) throws Exception;
    
    List<Owner> getAllOwners() throws Exception;
    Owner getOwnerById(Integer id) throws Exception;
    void addOwner(Owner o) throws Exception;
    void deleteOwner(Integer id) throws Exception;
    
    void addPetWithOwner(Pet p, Owner o) throws Exception;
    
}
