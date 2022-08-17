/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisnumero;

import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class AnalisisNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //----------------------------------------------
        //          Declaración de variables 
        //----------------------------------------------

        // Constantes


        // Variables de entrada
        int numero;
        
        // Variables de salida
        boolean esCero, esPositivo, esMenor100, esPar;

        // Variables auxiliares

        // Clase Scanner para petición de datos de entrada
        Scanner teclado= new Scanner (System.in);
        
        
        //----------------------------------------------
        //                Entrada de datos 
        //----------------------------------------------
        System.out.println("ANÁLISIS DE UN NÚMERO");
        System.out.println("---------------------");
        System.out.print("Introduzca un número entero: ");
        numero= teclado.nextInt();
        
        //----------------------------------------------
        //                 Procesamiento 
        //----------------------------------------------
        
        // Cálculo de los resultados relacionales
        esCero= numero==0;
        esPositivo= numero>0;
        esMenor100= numero<100;
        esPar= numero % 2 == 0;
        
        //----------------------------------------------
        //              Salida de resultados 
        //----------------------------------------------
        System.out.println ();
        System.out.println ("RESULTADO");
        System.out.println ("---------");
        System.out.println ("El número es cero: " + esCero);
        System.out.println ("El número es positivo: " + esPositivo);
        System.out.println ("El número es menor que 100: " + esMenor100);
        System.out.println ("El número es par: " + esPar);
                
        System.out.println ();
        System.out.println ("Fin del programa. Bye!");        
    }
    
}
