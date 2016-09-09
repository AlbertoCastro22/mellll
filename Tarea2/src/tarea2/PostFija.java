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
public class PostFija {
     int tam=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el tamaño del arreglo"));
   Pila p=new Pila(tam);
   String simbolo,resultado = "";
   private boolean band;
   String []cadena=new String[tam];
   public void Cadena(){
    }
   public boolean ischecaCaracter(){
        if(simbolo.equals("(")){
            band=true;
        }//cierra  linea 61
        else{
            if(simbolo.equals(")")){
                band=true;
            }//cierra if linea 65
            else{
                if(simbolo.equals("{")){
                band=true;
                }
                //cierra if
                else{
                    if(simbolo.equals("}")){
                         band=true;
                    }      
                 else{
                    if(simbolo.equals("[")){
                band=true;
                }
                    else{
                        if(simbolo.equals("]")){
                    band=true;
                    }
                        else{
                            System.out.println("Caracter no aceptado");
                        }//se cierra el sexto else
                    }//se cierra el quinto else             
                }//se cierra el cuarto else
            }//se cierra el tercer else
}//se cierra el segundo else
        }//se cierra el primer else
         return band;
   }//se cierra el metodo isOperador que sirve para comparar los caracteres
     
     @SuppressWarnings("ResultOfMethodCallIgnored")
   public String ConversionPostFija(String ei){
    while(ei.length()!=0){
        simbolo=ei.substring(1, 1);
        ei.substring(1, ei.length()-1);
        if(simbolo.equals("(")){
           this.ischecaCaracter();
            p.push( simbolo);
        }//fin del if de la linea 19  
        else{
        if(simbolo.equals(")")){
        while(!p.peek().equals("(")){
            resultado= resultado+p.pop();
           }//fin del while de la linea 24
        }//fin del if de la linea 23
        else{
               while(this.ischecaCaracter()){
                   resultado=resultado+p.pop();
               }//fin del while de la linea 34
                  p.push(simbolo);   
                }//fin del else de la linea 29
        }//fin del else de la linea 22  
    }//fin del while de la linea 16 
    while(!p.isVacia()){
    resultado=resultado+p.pop(); 
    }//fin del while de la linea 42
   return resultado;
    }//fin del metodo conversion
}
