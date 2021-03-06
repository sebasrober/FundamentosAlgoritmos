/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu;


import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Software Student
 */
public class SubPrograma {
    static Scanner leer=new Scanner(System.in);//objeto global
    int resultado;//varibale global
    // metodo/funcion para hallar el factorial de un numero
    int factorial(int numero){//numero es parametro/variable de entrada
        int contador=1;//varibale local
        resultado=1;
        while(contador<=numero){
            resultado=resultado*contador;
            contador++;//incrementa en una unidad
        }
        return resultado;
    }
    long factorialLong(int numero){//numero es parametro/variable de entrada
        int contador=1;//varibale local
        long resultado2=1;
        while(contador<=numero){
            resultado2=resultado2*contador;
            contador++;//incrementa en una unidad
        }
        return resultado2;
    }
    BigInteger factorialBigNum(int numero){//numero es parametro/variable de entrada
        int contador=1;//varibale local
        BigInteger resultado2=new BigInteger("1");
        while(contador<=numero){
            resultado2=resultado2.multiply(BigInteger.valueOf(contador));
            contador++;//incrementa en una unidad
        }
        return resultado2;
    }
    // Calcula el Factorial en un rango de Numeros
    void calcFactRangoNum(int numInicial, int numFinal){
        for (int i = numInicial; i <=numFinal; i++) {
        if(i>65){
        System.out.println("El Factorial del numero "+i+"! es:"+factorialBigNum(i));
        }else if(i>33){    
        System.out.println("El Factorial del numero "+i+"! es:"+factorialLong(i));
        }else{
        System.out.println("El Factorial del numero "+i+"! es:"+factorial(i));
        }
        }  
    }
    
    public static void main(String[] args) throws IOException {
        LeerTeclado br=new LeerTeclado();             
        System.out.println("Ingrese un Rango de Numeros");
                
        int numI=br.leer(0, "Ingrese el Primer numero:");        
        int numF=br.leer(0, "Ingrese el numero Final:");       
        SubPrograma sp=new SubPrograma();//sp esun Objeto de la Clase SubPrograma
        sp.calcFactRangoNum(numI, numF);                
        
        
        String nombre=br.leer("", "Ingrese el nombre:");
        System.out.println("El nombre es:"+nombre);
                
    }
   
}
