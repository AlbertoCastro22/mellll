/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Usersone
 */
import java.util.regex.Pattern;
public class Ejemplo { 
    public static void main(String[] args) {
        String expresionRegular = "[[]+{}+()]";
        String cadenaAEvaluar = "{}{}(){}[]((";
        boolean b = Pattern.matches(expresionRegular,cadenaAEvaluar);
        if(b){ System.out.println("La expresion SI representa la cadena a evaluar"); 
        }
        else{
            System.out.println("La expresion NO representa la cadena a evaluar");
        } 
    }
} 

