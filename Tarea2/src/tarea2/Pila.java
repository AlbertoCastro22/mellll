
package tarea2;
/**
 *
 * @author Usersone
 */
public class Pila {
    String[] pila;
    Integer tope,tam;
    public Pila(Integer tamanio){
        tope=-1;
        pila=new String[tamanio];
        tam=tamanio;
    }
    public void push(String dato){
        if(tope<tam-1){
            tope++;
            pila[tope]=dato;
        }
        else{
            System.out.println("Error de desbordamiento...");
        }
    }
    public String pop(){
    String resultado =" ";
    if(tope>-1){
        resultado=pila[tope];
        pila[tope]=null;
        tope--;
    }
    else{
        System.out.println("Error de subdesbordamiento...");
    }
    return resultado;
    }
    public String peek(){
    String resultado="";
    if(tope>-1){
        resultado=pila[tope];
    }
    else{
        System.out.println("Error de subdesbordamiento...");
    }
    return resultado;
    }   
}
