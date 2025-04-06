/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Denis Polo
 */
public class Vehiculo {

    protected String marca;
    private String color;

    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String potencia) {
        this.color = color;
    }

    public void mostrarInformacion() {
        System.out.println("La Marca es: " + marca);
        System.out.println("El Color es: " + color);
    }

    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Renaul", "Blanca con Negra.");
        System.out.println("Informacion del Vehiculo");
        vehiculo.mostrarInformacion();

    }

}
