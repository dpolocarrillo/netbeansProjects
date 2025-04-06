/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehiculo;

/**
 *
 * @author Denis Polo
 */
public class Carro extends Vehiculo {

    private String velocidad;
    private String numLicencia;

    public Carro(String velocidad, String numLicencia, String marca,String color) {
        super(marca, color);
        this.velocidad = velocidad;
        this.numLicencia = numLicencia;
    }

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Digite la Marca: " + marca);
        System.out.println("Digite el Color: " + getColor());
        System.out.println("Digite la Velocidad: " + velocidad);
        System.out.println("Digite el Numero de licencia: " + numLicencia);
    }

    public static void main(String[] args) {
        Carro carrito = new Carro("Ford", "Azul", "150km", "2765147");
        System.out.println("Informacion de carro");
        carrito.mostrarInformacion();

    }
}
