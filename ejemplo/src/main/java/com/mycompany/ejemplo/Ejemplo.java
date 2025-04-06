/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplo;

import java.util.Calendar;

/**
 *
 * @author ljfon
 */
public class Ejemplo {
      private String nombre, apellido, dni;
    private int AnoNac;
      
    public Ejemplo(String nombre, String apellido, String dni, int AnoNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.AnoNac = AnoNac;
    }
     public void imprimir(){
        System.out.println("Nombre de persona es: " +this.nombre+""+ this.apellido+ 
                "Identificacion:"+ this.dni+
                " Año de Nacimiento" + this.AnoNac);
    
  }
     public int CalcularEdad(){
      Calendar cal =  Calendar.getInstance();
      int year = cal.get(Calendar.YEAR);
      year = year-this.AnoNac;
      return year;

}  
    
    
    
    
    
}

