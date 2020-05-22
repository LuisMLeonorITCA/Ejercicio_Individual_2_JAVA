/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Leonor
 */
public class Ejercicio3 {
 public static void main(String[] args) {
       
             Scanner leer = new Scanner(System.in);
            System.out.println("Por favor ingrese su peso (Kg)");
            double peso = leer.nextDouble();
            System.out.println("Por favor ingrese su estatura (m)");
            double estatura = leer.nextDouble();
            double indice = peso / (estatura * estatura);
            calcularMasaCorp(peso, estatura, indice);
        
    }
    public static void calcularMasaCorp(double peso, double estatura, double indice)
    {
        if (indice <18) {
            System.out.println("Peso Bajo. Necesario valorar signos de desnutricion");
        }else if(indice >=18 && indice <=24.9)
        {
            System.out.println("Normal");
        }else if(indice >=25 && indice <=26.9)
        {
            System.out.println("Sobrepeso");
        }else if(indice >=27 && indice <28 )
        {
            System.out.println("Obesidad");
        }else if(indice >=27 && indice <=29.9)
        {
            System.out.println("Obesidad Grado 1");
        }else if(indice >=30 && indice<=39.9)
        {
            System.out.println("Obesidad Grado 2");
        }else if(indice >40)
        {
            System.out.println("Obesidad Grado 3 Extrema o Morbida");
        }
        
    }
}
