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
public class Lista<T extends Comparable<T>> {
    private Nodo<T> inicio;
     /**
     * set y get para el nodo...
     */
    public void setInicio(Nodo<T> inicio){
        this.inicio=inicio;
    }
    public Nodo<T> getInicio(){
    return inicio;
    }
     /**
     *este metodo agregara al inicio de la lista un dato
     */
    public void AgregarInicio(T dato){
        Nodo<T> nuevo=new Nodo<T>(dato);
        nuevo.setSiguiente(inicio);
        inicio=nuevo;
    }
     /**
     * toString para sobreescribir la clase lista
     */
    public String toString(){
   
   Nodo<T> temporal=inicio;
    String s="";
     while(temporal!=null){
       s+=temporal.getDato()+"-->";
       temporal=temporal.getSiguiente();
   }
    return s+""+null;
    }
     /**
     * este metodo inserta un dato al final de la lista
     */
      public void InsertarFinal(T dato){
        //solo servira aqui...
        Nodo<T> temporal;
        temporal=inicio;
        //si la lista esta vacia se generara un NullPointerException
        if(inicio==null){
            this.AgregarInicio(dato);
            
        }
        else{
            while(temporal.getSiguiente()!=null){
                temporal=temporal.getSiguiente();
            }
            temporal.setSiguiente(new Nodo(dato));
        }
    }
      
    /**
     * este metodo elimina un dato del final de la lista pero devuelve el anterior
     */
        public T eliminaFInalDevolviendo(){
         Nodo <T> temporal,anterior =null;
        temporal=inicio;
        if(inicio.getSiguiente()==null){
            inicio=null;
        }
        else{
            while(temporal.getSiguiente()!=null){
                anterior=temporal;
                temporal=temporal.getSiguiente();
               
            }
           
           anterior.setSiguiente(null);
        }
        return temporal.getDato();
        }
        
         /**
     * este metodo elimina un dato del inicio de la lista pero devuelve el siguiente
     */
         public T EliminaPrimeroDevolviendo(){
        Nodo <T>temporal=inicio;
        if(temporal.getSiguiente()!=null){
            inicio=temporal.getSiguiente();
        }
        else{
            inicio=null;
        }
        return temporal.getDato();
    }
         
}