/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author doduy
 */
public class EntityFactory {
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("LibraryDB");
    
    public static EntityManager getEntityManager()  {
        return FACTORY.createEntityManager();
    }
    
    public static void closeFactory() {
        FACTORY.close();
    }
}
