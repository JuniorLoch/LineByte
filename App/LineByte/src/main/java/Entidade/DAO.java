/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author User
 */
public class DAO {
    //ligacao com o persistence.xml, recebe por parametro o nome da unidade de persistencia que voce colocou no arquivo
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
    EntityManager em =emf.createEntityManager();
    EntityTransaction tx =em.getTransaction();
    
    public void salvar(Object o){
        tx.begin();
        em.persist(o);// inserir
        tx.commit();
    }
    
    public void remover(Object o){
        tx.begin();
        em.remove(o);
        tx.commit();
    }
    
    public void editar(Object o){
        tx.begin();
        em.equals(o);// inserir ou update
        tx.commit();
    }
    
    //existe diferenca no resultado dos dois metodos?
    public List lista(Class c){ 
        return  em.createQuery("select o from "+c.getSimpleName()+ " o ").getResultList();
    }
    
    
    public List listaNative(Class c){ 
        return  em.createNativeQuery("select * from "+c.getSimpleName(),c).getResultList();
    }
}
