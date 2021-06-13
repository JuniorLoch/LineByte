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

public class DAO {
    //ligacao com o persistence.xml, recebe por parametro o nome da unidade de persistencia que voce colocou no arquivo
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
    private static EntityManager em =emf.createEntityManager();
    private static EntityTransaction tx =em.getTransaction();
    
    public static Object salvar(Object o){
        
        tx.begin();
        Object teste = em.merge(o);// inserir
        tx.commit();
        return teste;
    }
    
    public static void remover(Object o){
        tx.begin();
        em.remove(o);
        tx.commit();
    }
    
    public static void editar(Object o){
        tx.begin();
        em.merge(o);// inserir ou update
        tx.commit();
    }
    
    //nao tem diferenca nos dois métodos, acho mais facil o native -Gilberto
    
    //JPQL
    public static List lista(Class c){ 
        return  em.createQuery("select o from "+c.getSimpleName()+ " o ").getResultList();
    }
    
    //Sql nativo
    public static List listaNative(Class c){ //como fazer com que a querry pegue o padrao do banco
        return  em.createNativeQuery("select * from tab"+c.getSimpleName(),c).getResultList();
    }
    
    public static void criaView(){ //como fazer com que a querry pegue o padrao do banco
        em.createNativeQuery("create or replace view vw_financeiro as " +
        " select tc.id, tc.datad as período, tc.valor*-1,'compra' as tipo from tabcompra tc " +
        " union all " +
        " select tv.id, tv.datad as período, tv.valor,'venda' as tipo from tabvenda tv " +
        " union all " +
        " select td.id, td.datad as período, td.valor*-1,'despesa' as tipo from tabdespesa td ");
    }
    
    public static List listaView(){ //como fazer com que a querry pegue o padrao do banco
        return  em.createNativeQuery("select * from vw_financeiro").getResultList();
    }
    
    public static List listaNative(Class c,String sql){ //como fazer com que a querry pegue o padrao do banco
        return  em.createNativeQuery("select * from tab"+c.getSimpleName()+" o where 1=1 and "+sql+" ",c).getResultList();
    }
    
    public static List listarItemVenda(){ 
        return  em.createNativeQuery("select * from tabvenda o join tabitem_venda i on i.id_venda=o.id").getResultList();
    }
    
    public static List listarItemCompra(){ 
        return  em.createNativeQuery("select * from tabcompra o join tabitem_compra i on i.id_compra=o.id").getResultList();
    }
    
    public static List listarEstoque(){ 
        return  em.createNativeQuery("select * from tabproduto o join tabestoque i on i.id_produto=o.id").getResultList();
    }
    
    
}
