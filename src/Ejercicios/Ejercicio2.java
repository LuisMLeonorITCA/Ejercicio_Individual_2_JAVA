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
public class Ejercicio2 {
 public static void main(String[] args) {
        try{
            BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Ingresar el valor de la venta");
            double valorVenta = Double.parseDouble(leer.readLine());
            calcularComision(valorVenta);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void calcularComision(double valorVenta)
    {
        double comision = 0.0, salario = 0.0, renta = 0.0, saltotal = 0.0;
        if (valorVenta >= 3000) {
            comision = valorVenta * 0.10;
            salario = comision + 300;
            renta = salario * 0.10;
            saltotal = salario - renta;
        }else if (valorVenta >=1000 && valorVenta <=2999)
        {
            comision = valorVenta * 0.08;
            salario = comision + 300;
            renta = salario * 0.10;
            saltotal = salario - renta;
        }else if(valorVenta >=1 && valorVenta <=999)
        {
            comision = valorVenta * 0.05;
            salario = comision + 300;
            renta = salario * 0.10;
            saltotal = salario - renta;
        }
        System.out.println("El Salario Total Liquido es: " + saltotal );
    }
}
    

