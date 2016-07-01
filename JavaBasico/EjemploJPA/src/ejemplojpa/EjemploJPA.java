/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplojpa;

import edu.co.sena.ejemplojpa.integracion.entities.Perro;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author hernando
 */
public class EjemploJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EjemploJPAPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Perro p1 = new Perro();
        p1.setId("sfad");
        p1.setNombre("dfasdf");
        p1.setRaza("sdafasd");
        em.persist(p1);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
