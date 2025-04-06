/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.repaso;

/**
 * un algoritmo que recree el comportamiento de un semaforo que cuenta personas.
 *
 * @author ljfon
 */
public class Repaso {

    static boolean contar_personas(int personas_pasadas, boolean semaforo) {
        System.out.println("Han pasado " + personas_pasadas + " personas por el semaforo");
        if (personas_pasadas == 10) {
            semaforo = false;
            System.out.println("El semaforo esta en Rojo");
        } else {
            System.out.println("El semaforo esta en Verde");

        }
        return semaforo;
    }

    public static void main(String[] args) {
        String programa_nombre = "programs que inicia";
        System.out.println(programa_nombre);
        int numero_person = 10;
        boolean semaforo = true;

        while (semaforo) {
            for (int i = 1; i <= numero_person; i++) {
                semaforo = contar_personas(i, semaforo);
            }
        }

        // operadores
        int a = 1, b = -2;
        a += b;
        System.out.println("mas igual " + a);
        a -= b;
        System.out.println("menos igual " + a);
        a *= b;
        System.out.println("por igual " + a);
        a /= b;
        System.out.println("div igual " + a);
        a %= b;
        System.out.println("mod igual " + a);

        // pares
        for (int i = 0; i < 10; i++) {
            System.out.println((es_par(i) ? i + " es par" : i + "  es impar"));
        }
    }

    static boolean es_par(double num) {
        return num % 2 == 0;
    }

}
