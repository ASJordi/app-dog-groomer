package dev.asjordi.repository;

import dev.asjordi.model.Pet;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class PetRepository implements IRepository<Pet> {
    
    private EntityManager em;

    public PetRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Pet> getAll() throws Exception {
        return em.createQuery("SELECT p FROM Pet p LEFT JOIN FETCH p.owner").getResultList();
    }

    @Override
    public Pet getById(Integer id) throws Exception {
        return em.find(Pet.class, id);
    }

    @Override
    public void add(Pet p) throws Exception {
        if (p.getId() != null && p.getId() > 0) em.merge(p);
        else em.persist(p);
    }

    @Override
    public void delete(Integer id) throws Exception {
        var pet = getById(id);
        if (pet != null) em.remove(pet);
    }

}
