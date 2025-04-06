/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba_netbeans;

import javax.swing.JOptionPane;

/**
 * s
 *
 * @author ljfon
 */
public class Prueba_netbeans {
    /**
     * 
     * @param a
     * @param b
     * @return
     */
    static int sumar(int a, int b) {
        int result = a+b;
        return result;
    }

    static int restar(int a, int b) {
        return a - b;
    }

    static int multiplicar(int a, int b) {
        return a * b;
    }

    static double dividir(double a, double b) {
        return   (a/b);
    }

    public static void main(String[] args) {
        // ingreso - proceso - salida
        /**
         * main no recibe ingresos
         * 
         * el proceso / proposito de main es que las 4 operaciones resuelvan
         * 
         * la salida es e¿imprimir los resultados de cada operacion
         */

        // proceso
        int result_suma = sumar(1, 2);
        int result_resta = restar(3, 2);
        int result_multipplicacion = multiplicar(3, 2);
        double result_dividir = dividir(1, 2);

        // salida

        System.out.println("el resultado de la suma es: "+ result_suma);
        System.out.println("el resultado de la resta es: "+ result_resta);
        System.out.println("el resultado de la multiplicacion es: "+ result_multipplicacion);
        System.out.println("el resultado de la divicion es: "+ result_dividir);




    }

}
