package dev.asjordi.repository;

import dev.asjordi.model.Owner;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class OwnerRepository implements IRepository<Owner> {
    
    private EntityManager em;

    public OwnerRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public List<Owner> getAll() throws Exception {
        return em.createQuery("SELECT o FROM Owner o", Owner.class).getResultList();
    }

    @Override
    public Owner getById(Integer id) throws Exception {
        return em.find(Owner.class, id);
    }

    @Override
    public void add(Owner o) throws Exception {
        if (o.getId() != null && o.getId() > 0) em.merge(o);
        else em.persist(o);
    }

    @Override
    public void delete(Integer id) throws Exception {
        var owner = getById(id);
        if (owner != null) em.remove(owner);
    }

}
