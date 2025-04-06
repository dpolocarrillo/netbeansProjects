/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerproducto;

/**
 *
 * @author ljfon
 */
public class Producto {

    private String codigo;
    private int precio_compra;
    private int cantidad_bodega;
    private int cantidad_minima_bodega;

    public Producto(String codigo) {
        this.codigo = codigo;
    }

    public boolean existencia() {
        return cantidad_bodega>cantidad_minima_bodega;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(int precio_compra) {
        this.precio_compra = precio_compra;
    }

    public int getCantidad_bodega() {
        return cantidad_bodega;
    }

    public void setCantidad_bodega(int cantidad_bodega) {
        this.cantidad_bodega = cantidad_bodega;
    }

    public int getCantidad_minima_bodega() {
        return cantidad_minima_bodega;
    }

    public void setCantidad_minima_bodega(int cantidad_minima_bodega) {
        this.cantidad_minima_bodega = cantidad_minima_bodega;
    }
}
