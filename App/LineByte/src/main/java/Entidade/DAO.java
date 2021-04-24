/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DAO {
    private static Connection connection;
    private static PreparedStatement ps;
    
    public static void conexao(){
        try {
            //como fazer conexao com o banco, (link,usuario,senha) varia de usuario
            DAO.connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/linebyte", "postgres", "123");
            System.out.println("Conexão com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexao");
        }
    }
    
    public static void salvar(Object o){
        //em breve
    }
    
    public static void remover(Object o){
        //em breve
    }
    
    public static void editar(Object o){
        //em breve
    }
}
