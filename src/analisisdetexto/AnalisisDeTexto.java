/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisdetexto;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class AnalisisDeTexto {

    /**
     * Ejercicio 6: análisis de un texto.
     */
    public static void main(String args[]) {
        //----------------------------------------------
        //          Declaración de variables y Entrada de datos
        //----------------------------------------------  
        Scanner scanner= new Scanner(System.in);
                
        String primeraLetra= "Hola";
        String ultimaLetra= "Hola";    
        String psuspensivos= "Hola";
        
                
        
                           
        //----------------------------------------------
        //          Declaración de variables y Entrada de datos
        //----------------------------------------------  
        System.out.println("ANÁLISIS DE UN TEXTO");
        System.out.println("--------------------");
        System.out.print("Introduzca un texto: ");
        String palabra= scanner.nextLine();
        System.out.println("");
        
        //----------------------------------------------
        //              Procesamiento y Salida de resultados 
        //----------------------------------------------
        System.out.println("RESULTADO");
        System.out.println("---------");
        if(palabra.length()>5){
            System.out.println("El texto contiene más de cinco caracteres, true, en total: "+palabra.length());
        }else{
            System.out.println("El texto contiene menos de cinco caracteres, true, en total: "+palabra.length());
        }                
        if (palabra.equals(primeraLetra)){
            System.out.println("El texto comienza con una palabra mayúscula: "+ palabra.equals(primeraLetra));
        }else{
            System.out.println("El texto no comienza con una palabra mayúscula: "+ palabra.equals(primeraLetra));
        }
        if (palabra.equalsIgnoreCase(ultimaLetra)){
            System.out.println("El texto termina con una palabra minuscula: "+ palabra.equalsIgnoreCase(ultimaLetra));
        }else{
            System.out.println("El texto no termina con una palabra minúscula: "+ palabra.equalsIgnoreCase(ultimaLetra));
        }
        if (psuspensivos.equals(palabra)){
            System.out.println("El texto no termina en dos puntos suspensivos: "+ psuspensivos.equals(palabra));
        }else{
            System.out.println("El texto termina en dos puntos suspensivos: "+ psuspensivos.equals(palabra));
        }    
    }
    
}
