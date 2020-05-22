/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Leonor
 */
public class Ejercicio1 {
public static void main(String[] args) {                  
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        try { //Se utiliza el manejador de errores de lo contrario genera error double cantidad1 = 0, cantidad2 = 0;  
            System.out.println("Ingrese la operacion a realizar");
            System.out.println("Suma: S Resta: R Multiplicacion: M Division: D");
            String calculadora = leer.readLine();
            System.out.println("Ingresa la cantidad 1");
            double cantidad1 = Double.parseDouble(leer.readLine());
            System.out.println("Ingresa la cantidad 2");
            double cantidad2 = Double.parseDouble(leer.readLine());         
            switchCalc(cantidad1,cantidad2,calculadora.toUpperCase().charAt(0));
        }catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
    
    public static void switchCalc(double cantidad1, double cantidad2,char calculadora){
        double resultado = 0.0;
        switch(calculadora){//Valor o caracter a evaluar
            case 'S': 
                resultado = cantidad1 + cantidad2;
                break;
            case 'R': 
                resultado = cantidad1 - cantidad2;
                break;
            case 'M':
                resultado = cantidad1 * cantidad2;
                break;
            case 'D':
                resultado = cantidad1 / cantidad2;
                break;
            default://Si no cumple ninguno de los anteriores
                System.out.println("Por favor ingrese un numero");
        }
        System.out.println("El resultado es: " + resultado);
    }
}

 

