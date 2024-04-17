package dev.asjordi.service;

import dev.asjordi.model.Owner;
import dev.asjordi.model.Pet;
import dev.asjordi.repository.IRepository;
import dev.asjordi.repository.OwnerRepository;
import dev.asjordi.repository.PetRepository;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class PetOwnerService implements IService {
    
    private EntityManager em;
    private IRepository<Pet> petRepo;
    private IRepository<Owner> ownerRepo;

    public PetOwnerService(EntityManager em) {
        this.em = em;
        this.petRepo = new PetRepository(em);
        this.ownerRepo = new OwnerRepository(em);
    }

    @Override
    public List<Pet> getAllPets() throws Exception {
        return petRepo.getAll();
    }

    @Override
    public Pet getPetById(Integer id) throws Exception {
        return petRepo.getById(id);
    }

    @Override
    public void addPet(Pet p) throws Exception {
        try {
            em.getTransaction().begin();
            petRepo.add(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deletePet(Integer id) throws Exception {
        try {
            em.getTransaction().begin();
            petRepo.delete(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public List<Owner> getAllOwners() throws Exception {
        return ownerRepo.getAll();
    }

    @Override
    public Owner getOwnerById(Integer id) throws Exception {
        return ownerRepo.getById(id);
    }

    @Override
    public void addOwner(Owner o) throws Exception {
        try {
            em.getTransaction().begin();
            ownerRepo.add(o);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void deleteOwner(Integer id) throws Exception {
        try {
            em.getTransaction().begin();
            ownerRepo.delete(id);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void addPetWithOwner(Pet p, Owner o) throws Exception {
        try {
            em.getTransaction().begin();
            addOwner(o);
            p.setOwner(o);
            addPet(p);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
        }
    }
    
}
