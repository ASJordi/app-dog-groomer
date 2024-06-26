package dev.asjordi.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Jordi <ejordi.ayala@gmail.com>
 */
public class HibernateUtil {
    
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = buildEntityManagerFactory();
    
    private static EntityManagerFactory buildEntityManagerFactory() {
        return Persistence.createEntityManagerFactory("jpaUnit");
    }
    
    public static EntityManager getEntityManager() {
        return ENTITY_MANAGER_FACTORY.createEntityManager();
    }
}
