package tarea2;
/**
 *
 * @author Usersone
 */
public class Pila {
    String[] pila;
    Integer tope,tam;
     private boolean vacia;
     //constructor que le deberemos pasar un dato de tipo entero e inicializa los demas datos...
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
    }//fin del metodo  push
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
    }//fin del metodo pop
    public String peek(){
    String resultado="";
    if(tope>-1){
        resultado=pila[tope];
    }
    else{
        System.out.println("Error de subdesbordamiento...");
    }
    return resultado;
//<<<<<<< HEAD
    }//fin del metodo peek   
    
    
   
            public void isVacia(boolean vacia){
            this.vacia=vacia;
            }//set del boolean que sera mi bandera...
          
            public boolean isVacia(){
                for(int i=0;i<pila.length;i++){
                pila[i]=null;
                        }
               vacia=false;
        return vacia ;
    }
          

    }   
