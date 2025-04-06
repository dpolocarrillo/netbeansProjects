/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallerproducto;

import java.util.Scanner;

/**
 *
 * @author ljfon
 */
public class TallerProducto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo;
        int precio_compra;
        int cantidad_bodega;
        int cantidad_minima_bodega;

        System.out.println("Ingrese el codigo del producto");
        codigo = scanner.nextLine();
        System.out.println("Ingrese el precio del producto");
        precio_compra = scanner.nextInt();
        System.out.println("Ingrese la cantidad de bodega");
        cantidad_bodega = scanner.nextInt();
        System.out.println("Ingrese la cantidad minima de bodega");
        cantidad_minima_bodega = scanner.nextInt();

        if (codigo.equals("")) {
            System.out.println("El codigo no puede ser vacio");
            System.exit(0);
        }
        if (precio_compra < 0) {
            System.out.println("El precio tiene que ser mayor a cero");
            System.exit(0);

        }
        if (cantidad_bodega < 0) {
            System.out.println("La cantidad de bodega tiene que ser mayor a cero");
            System.exit(0);

        }
        if (cantidad_minima_bodega < 0) {
            System.out.println("La cantidad minima en bodega tiene "
                    + "que ser mayor a cero");
            System.exit(0);

        }

        Producto producto = new Producto(codigo);

        producto.setPrecio_compra(precio_compra);
        producto.setCantidad_bodega(cantidad_bodega);
        producto.setCantidad_minima_bodega(cantidad_minima_bodega);

        if (producto.existencia()) {
            System.out.println("Si hay existencia, no debe solicitar mas producto");
        } else {
            System.out.println("Debe"
                    + " solicitar mas producto");
        }

    }

}
