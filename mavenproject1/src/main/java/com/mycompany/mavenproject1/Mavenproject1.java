/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ljfon
 */
public class Mavenproject1 {

    public class Planeta {
    private String nombre;
    private int cantidadSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol;
    private String tipoPlaneta;
    private boolean observableAVista;

    // Constructor
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, double distanciaMediaAlSol, String tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipoPlaneta = tipoPlaneta;
        this.observableAVista = false;
    }

    // Método para imprimir los valores de los atributos de un planeta
    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones km): " + distanciaMediaAlSol);
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + observableAVista);
    }

    // Método para calcular la densidad de un planeta
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método para determinar si un planeta es exterior
    public boolean esPlanetaExterior() {
        double distanciaUA = distanciaMediaAlSol / 149597870; // Convertir distancia a UA
        return distanciaUA > 2.1 && distanciaUA < 3.4;
    }

    public static void main(String[] args) {
        // Crear dos planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149.6, "TERRESTRE");
        Planeta neptuno = new Planeta("Neptuno", 14, 1.024e26, 6.254e13, 49528, 4497.1, "GASEOSO");

        // Imprimir los valores de los atributos de cada planeta
        System.out.println("Planeta Tierra:");
        tierra.imprimirAtributos();
        System.out.println("Densidad: " + tierra.calcularDensidad());
        System.out.println("Es planeta exterior: " + tierra.esPlanetaExterior());
        System.out.println();

        System.out.println("Planeta Neptuno:");
        neptuno.imprimirAtributos();
        System.out.println("Densidad: " + neptuno.calcularDensidad());
        System.out.println("Es planeta exterior: " + neptuno.esPlanetaExterior());
    }
    }
}

