/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entities.Sach;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author doduy
 */
public class SachDAO {
    
    public static List<Sach> getAll() {
        EntityManager em = EntityFactory.getEntityManager();
        
        TypedQuery<Sach> query = em.createQuery("select c from Sach c", Sach.class);
        
        List<Sach> listSach = query.getResultList();
        
        em.close();
        return listSach;
    }

    
    public static Sach getBookById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static void deleteSach(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public static void update(Sach sach) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
