/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author ljfon
 */
public class Jhonso extends Vehiculo {

    private int num_pasajeros;
    private String capacidad_carga;
    private String material;

    public Jhonso(int num_pasajeros, String capacidad_carga, String material, String marca, String color) {
        super(marca, color);
        this.num_pasajeros = num_pasajeros;
        this.capacidad_carga = capacidad_carga;
        this.material = material;
    }

    public int getNum_pasajeros() {
        return num_pasajeros;
    }

    public void setNum_pasajeros(int num_pasajeros) {
        this.num_pasajeros = num_pasajeros;
    }

    public String getCapacidad_carga() {
        return capacidad_carga;
    }

    public void setCapacidad_carga(String capacidad_carga) {
        this.capacidad_carga = capacidad_carga;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("La Cantidad de Pasajero es: " + num_pasajeros);
        System.out.println("La Capacidad de Carga es: " + capacidad_carga);
        System.out.println("El Material es:  " + material);
        System.out.println("La Marca es: " + marca);
        System.out.println("El Color es: " + getColor());
    }

    public static void main(String[] args) {
        Jhonso canoa = new Jhonso(25, "10 toneladas", "Madera:Roble", "Balsamo", "Marron");
        System.out.println("Informacion del Jhonso");
        canoa.mostrarInformacion();

    }
}
