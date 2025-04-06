/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author ljfon
 */
public class cuenta {

    protected double saldo;
    protected int numCons, numRet;

    public cuenta(double cantidad) {
        this.saldo = saldo;
        this.numCons = 0;
        this.numRet = 0;
    }

    public void consignar(double cantidad) {
        this.saldo = this.saldo + cantidad;
        this.numCons++;
    }

    public void retirar(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo = this.saldo - cantidad;
            this.numRet++;
        } else {
            System.out.println("saldo insuficiente");
        }
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getsaldo() {
        return this.saldo;
    }

    public void mostrar() {
        System.out.println("el saldo es:" + this.saldo + "\n" + "numeros de consignaciones;" + this.numCons + "\n"
                + "numero de retiro" + "this.numRet" + "\n");
    }

}
