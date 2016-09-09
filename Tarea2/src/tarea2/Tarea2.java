/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

import javax.swing.JOptionPane;

/**
 *
 * @author Usersone
 */
public class Tarea2 {
    int tam=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tamaño del arreglo"));
   Pila p=new Pila(tam);
   String simbolo,resultado = "";
   String []cadena=new String[tam];
   public void Cadena(){
   
    
    }
    public static void main(String[] args) {
     Pila p=new Pila(10);
     p.push("{");
      p.push("}");
       p.push("(");
        p.push("[");
         p.push("]");
          p.push(")");
     System.out.println(p.peek());
    
    }   
}
