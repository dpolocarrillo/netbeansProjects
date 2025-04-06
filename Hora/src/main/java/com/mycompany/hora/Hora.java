/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hora;

import java.util.Scanner;

/**
 *
 * @author ljfon
 */
public class Hora {

    private int Horas;
    private int Minutos;
    private int Segundos;

    // Constructor predeterminado con hora por defecto 00:00:00
    public Hora() {
        this.Horas = 0;
        this.Minutos = 0;
        this.Segundos = 0;
    }

    ////// Constructor parametrizado
    public Hora(int horas, int minutos, int segundos) {
        valida(horas, minutos, segundos);
        this.Horas = horas;
        this.Minutos = minutos;
        this.Segundos = segundos;
    }

    ////// Leer la hora 
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora (horas): ");
        int horas = scanner.nextInt();
        System.out.print("Ingrese la hora (minutos): ");
        int minutos = scanner.nextInt();
        System.out.print("Ingrese la hora (segundos): ");
        int segundos = scanner.nextInt();
        valida(horas, minutos, segundos);
        this.Horas = horas;
        this.Minutos = minutos;
        this.Segundos = segundos;
    }

    ///// Validar la Hora
    private void valida(int horas, int minutos, int segundos) {
        if (horas < 0 || horas > 23) {
            throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
        }
        if (minutos < 0 || minutos > 59) {
            throw new IllegalArgumentException("Los minutos deben estar entre 0 y 59");
        }
        if (segundos < 0 || segundos > 59) {
            throw new IllegalArgumentException("Los segundos deben estar entre 0 y 59");
        }
    }

    ////// Imprimir la Hora
    public void print() {
        System.out.printf("%02d:%02d:%02d", this.Horas, this.Minutos, this.Segundos);
    }

    /////// Convertir la hora a segundos
    public int Segundos() {
        return this.Horas * 3600 + this.Minutos * 60 + this.Segundos;
    }

    ////// Establecer la hora a partir de segundos
    public void ASegundos(int segundos) {
        this.Horas = segundos / 3600;
        this.Minutos = (segundos % 3600) / 60;
        this.Segundos = segundos % 60;
    }

    ////// Calcular la diferencia en segundos entre dos horas
    public int segundosDesde(Hora otraHora) {
        return Math.abs(this.Segundos() - otraHora.Segundos());
    }

    /////// Avanzar un segundo
    public void avanzar() {
        this.Segundos++;
        if (this.Segundos == 60) {
            this.Segundos = 0;
            this.Minutos++;
            if (this.Minutos == 60) {
                this.Minutos = 0;
                this.Horas++;
                if (this.Horas == 24) {
                    this.Horas = 0;
                }
            }
        }
    }

    ////// Retroceder un segundo
    public void retroceder() {
        this.Segundos--;
        if (this.Segundos == -1) {
            this.Segundos = 59;
            this.Minutos--;
            if (this.Minutos == -1) {
                this.Minutos = 59;
                this.Horas--;
                if (this.Horas == -1) {
                    this.Horas = 23;
                }
            }
        }
    }

    ////// Clon de la hora
    public Hora clon() {
        return new Hora(this.Horas, this.Minutos, this.Segundos);
    }

    ////// Comparar si la hora es igual a otra
    public boolean igualQue(Hora otraHora) {
        return this.Horas == otraHora.Horas && this.Minutos == otraHora.Minutos && this.Segundos == otraHora.Segundos;
    }

    /////// Cmparar si la hora es menor que otra
    public boolean menorQue(Hora otraHora) {
        return this.Segundos() < otraHora.Segundos();
    }

    ////// Comparar si la hora es mayor que otra
    public boolean mayorQue(Hora otraHora) {
        return this.Segundos() > otraHora.Segundos();
    }
}
