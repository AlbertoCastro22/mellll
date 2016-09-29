/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tda3;

import java.math.*;
import java.util.*;


public class Prueba {

public static BigInteger sumatoria(Nodo<BigInteger> aux){
BigInteger sumatoria= new BigInteger ("0");
while(aux!=null){
sumatoria=sumatoria.add(aux.getDato());
aux=aux.getSiguiente();
}//fin del while
return sumatoria;
}//fin del metodo sumatoria

public static BigInteger aleatorio(){
Random rnd=new Random();
return new BigInteger(String.valueOf(rnd.nextInt(1000000)));

}//fin del metodo aleatorio
/**
 * genera un numero aleatorio bigInteger entre 1 y Q
 */
public static BigInteger aleatorios(BigInteger tope){
Random rnd=new Random();
BigInteger numeroAleatorio;
do{
    numeroAleatorio=new BigInteger(tope.bitLength(),rnd);
}while(numeroAleatorio.compareTo(tope)>=0);
return numeroAleatorio;
}//fin del metodo aleatorio

public static void main(String [] args){
Lista<BigInteger> lista01=new Lista<BigInteger>();
BigInteger q,r;
/**
 * el for genera los 8 numeros aleatorios insertando al final de nuestra lista y los numeros seran nuestra llave privada
 */
for(int x=0;x<8;x++){
lista01.InsertarFinal(aleatorio().add(sumatoria(lista01.getInicio())));
}//fin del ciclo for

Integer inte=new Integer(65);

System.out.println("w="+lista01);
System.out.println("Sum="+sumatoria(lista01.getInicio()));
q=aleatorio().add(sumatoria(lista01.getInicio()));
System.out.println("q="+q);

/**
 * do while para que siempre sea un numero coprimo de q
 */
do{
    r=aleatorios(q);
}while(r.gcd(q).compareTo(new BigInteger("1"))!=0);
System.out.println("r="+r);
System.out.println(r.gcd(q));
 //BigInteger r=aleatorios(aleatorio().add(sumatoria(lista01.getInicio())));

/**
 * creamos una nueva lista... y generamos nuestra llave publica 
 */
Lista <BigInteger> llavePublica=new Lista<BigInteger>();
Nodo<BigInteger> aux=lista01.getInicio();
while(aux!=null){
    llavePublica.InsertarFinal(aux.getDato().multiply(r).mod(q));
    aux=aux.getSiguiente();
}
System.out.println("LLave Publica: "+llavePublica);
aux=llavePublica.getInicio();
/**
 * convertimos nuestros caracteres en forma binaria
 */
  char caracter='l';
  BigInteger mensajeEncriptado=new BigInteger("0");
  System.out.println((int)caracter);
  for(int i=0;i<8;i++){
   System.out.print((caracter & 128)==0?"0":"1");
   if((caracter&128)!=0){
       mensajeEncriptado=mensajeEncriptado.add(aux.getDato());
    }
   aux=aux.getSiguiente();
   caracter<<=1;
  }
  System.out.println();
   System.out.println(mensajeEncriptado);
       BigInteger a=r;
       BigInteger b=q;
       
      
       BigInteger y=mensajeEncriptado.multiply(r.modInverse(q)).mod(q);
       BigInteger f;
      /** public int inverse() {
      int f;
      int a = getInt(multiplier);
      int b = getInt(modulus);
      for (int k=1 ; k < b ; k++) {
         f = 0;
         for (int j=0 ; j < b ; j++)
            if (modulo(k*modulo(a*j,b), b) == j) f += 1; else break;
         if (f == b) return k;
      }
      return 0;
   }
       }*/
       
       System.out.println("y= "+y);
       for(int k=1;k<y.bitLength();k++){
       f=new BigInteger("0");
       for(int j=0;j<f.bitLength();j++){
        if(y.bitLength()==j){
            f= new BigInteger(f+"1");
             System.out.print("f: "+f);
        }
       // break;
        if(f==q){
            System.out.print(k);
        } 
       }
       System.out.print("0");
       }
        System.out.println();
       
        }
}//fin de la clase prueba