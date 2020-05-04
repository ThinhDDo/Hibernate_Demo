/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entities.Sach;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author doduy
 */
public class Main {
    
    private static final EntityManagerFactory FACTORY = Persistence.createEntityManagerFactory("LibraryDB");
    
    public static void main(String[] args) {
        
        getListOfBook();
        
        FACTORY.close();
    }

    /**
     * Get all books from library
     */
    private static void getListOfBook() {
        
        System.out.println("\n\n\n\n\n");
        
        EntityManager em = FACTORY.createEntityManager();
        
        TypedQuery<Sach> query = em.createQuery("select c from Sach c", Sach.class);
        
        List<Sach> listSach = query.getResultList();
        
        System.out.println("Number of books: " + listSach.size());
        for(Sach s : listSach) {
            System.out.println(s.toString());
        }
        
        em.close();
    }
}
