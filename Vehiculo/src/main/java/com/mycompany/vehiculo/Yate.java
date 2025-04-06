/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author ljfon
 */
public class Yate extends Vehiculo {

    private String tipo_motor;
    private String año_fabricacion;
    private String tamaño;

    public Yate(String tipo_motor, String año_fabricacion, String tamaño, String marca, String color) {
        super(marca, color);
        this.tipo_motor = tipo_motor;
        this.año_fabricacion = año_fabricacion;
        this.tamaño = tamaño;

    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public String getAño_fabricacion() {
        return año_fabricacion;
    }

    public void setAño_fabricacion(String año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("El Tipo de Motor es: " + tipo_motor);
        System.out.println("El Año de Fabricacion es: " + año_fabricacion);
        System.out.println("El tamaño del Yate es: " + tamaño);
        System.out.println("La Marca es: " + marca);
        System.out.println("El Color es: " + getColor());
    }

    public static void main(String[] args) {
        Yate yate = new Yate("Caterpillar", "1658", "12metros","Princess", "Blanco");
        System.out.println("Informacion del Yate");
        yate.mostrarInformacion();

    }
}
