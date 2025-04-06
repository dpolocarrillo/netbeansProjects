/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject3;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author ljfon
 */
public class Producto {

    private String codigo;
    private int pcompra;
    private int cbodega;
    private int cmbodega;

    public void Producto(String codigo) {
        this.codigo = codigo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPcompra() {
        return pcompra;
    }

    public void setPcompra(int pcompra) {
        this.pcompra = pcompra;
    }

    public int getcbodega() {
        return cbodega;
    }

    public void setCbodega(int cbodega) {
        this.cbodega = cbodega;
    }

    public int getCmbodega() {
        return cmbodega;
    }

    public void setCmbodega(int cmbodega) {
        this.cmbodega = cmbodega;
    }

    public boolean Existencia() {
        if (cbodega < cmbodega) {
null;
        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        
        

    }
}
