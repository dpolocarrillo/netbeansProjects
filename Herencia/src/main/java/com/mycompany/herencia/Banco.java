/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herencia;

/**
 *
 * @author ljfon
 */
public class Banco {

   
    private static double saldo = 20000; // Saldo inicial
    private static double sobregiro = 0;

    public static void main(String[] args) {
        System.out.println("Estado inicial:");
        mostrarEstado();

        // Operación 1: Consignar $100,000
        System.out.println("\nConsignando $100,000...");
        consignar(100000);
        mostrarEstado();

        // Operación 2: Retirar $50,000
        System.out.println("\nRetirando $50,000...");
        retirar(50000);
        mostrarEstado();

        // Operación 3: Retirar $80,000 (crea sobregiro)
        System.out.println("\nRetirando $80,000...");
        retirar(80000);
        mostrarEstado();

        // Operación 4: Consignar $50,000 (cubre sobregiro y suma al saldo)
        System.out.println("\nConsignando $50,000...");
        consignar(50000);
        mostrarEstado();
    }

    public static void consignar(double cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                saldo += (cantidad - sobregiro);
                sobregiro = 0;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            saldo += cantidad;
        }
    }

    public static void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro = cantidad - saldo;
            saldo = 0;
        }
    }

    public static void mostrarEstado() {
        System.out.println("--- ESTADO DE CUENTA ---");
        System.out.println("Saldo: $" + saldo);
        System.out.println("Sobregiro: $" + sobregiro);
    }
}




