/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author ljfon
 */
public class Cuentacorriente {
     private double saldo = 20000; 
    private double sobregiro = 0;
    
    
    public void consignar(double cantidad) {
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

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            sobregiro = cantidad - saldo;
            saldo = 0;
        }
    }

    public void mostrar() {
        System.out.println("Estado de cuenta" + "\n" + "saldo: $" + saldo + 
                "\n"+ "sobregiro: $" + sobregiro );
      }
}


