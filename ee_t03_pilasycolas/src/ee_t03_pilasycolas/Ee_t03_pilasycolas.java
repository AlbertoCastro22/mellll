/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;

/**
 *
 * @author Usersone
 */
public class Ee_t03_pilasycolas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Pila<Integer> miPila=new Pila<Integer>();
       Cola<Integer> miCola=new Cola<Integer>();
       miPila.push(10);
      System.out.println( miPila.peek());
      miCola.insertar(40);
      System.out.println(miCola);
    }
    
}
