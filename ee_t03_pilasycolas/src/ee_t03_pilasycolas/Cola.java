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
public class Cola<T extends Comparable<T>> {
    
    private Lista<T> cola=new Lista<T>();
     /**
     * metodo para insertar al final de la cola
     */
    public void insertar(T dato){
        cola.InsertarFinal(dato);
        
    }
     /**
     *metodo para retirar el primer elemento de la cola
     */
    public T retirar(){
    return cola.EliminaPrimeroDevolviendo();
    }
    /**
     * toString para sobreescribir la clase lista
     */
    public String toString(){
        String s="";
        s+=cola;
        return s;
    }
    
}

