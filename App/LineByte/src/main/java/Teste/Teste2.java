/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Teste2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
        
        JOptionPane.showMessageDialog(null, "O numero digitado foi "+x);
        
    }
}
