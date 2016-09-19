/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee_t03_pilasycolas;
/**
 *Esta clase implementa una Pila con una lista Ligada, la pila esta vacia cuando la lista
 * vacia. Insertamos lementos al final de la lista y retiramos elementos al final de la misma
 */
public class Pila <T extends Comparable <T>>{
    private Lista<T> pila=new Lista<T>();
            private boolean vacia;
 /**
 *set y get del parametro booleano para ver si la lista esta vacia o no
 */
            public void isVacia(boolean vacia){
            this.vacia=vacia;
            }
           public boolean isVacia(){
        return pila.getInicio().getDato() == null;
    }
   /**
 *metodo para insertar un dato al final de la pila
 */
    public T push(T dato){       
        pila.InsertarFinal(dato);
        return dato;     
    }
    /**
    *metodo para eliminar el ultimo elemento de la pila
    */
    public T pop(){  
     pila.eliminaFInalDevolviendo();
        return pila.getInicio().getDato();
    }
    /**
    *metodo para mostrar el ultimo elemento que se inserto a la pila
    */
    public T  peek(){
        Nodo<T> temporal=pila.getInicio();
        while(temporal.getSiguiente()!=null){
           temporal=temporal.getSiguiente();
        }
        return temporal.getDato();
    }   
}