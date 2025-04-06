/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleado;

/**
 *
 * @author ljfon
 */
public class Empleado {

       private String nombre, dir, Dni;
   private boolean casado;
   private int numhijos;
   private double sueldo, horaextras, retencion;
   
   
   ///constructor
    public Empleado(String nombre, String dir, String Dni, boolean casado,
          int numhijos, double sueldo, double horasextras, double retencion){
        
        this.nombre=nombre;
        this.dir=dir;
        this.Dni=Dni;
        this.casado=casado;
        this.numhijos=numhijos;
        this.sueldo=sueldo;
        this.horaextras=horasextras;
        this.retencion=retencion;
    }

    public Empleado (String nombre, String dir, boolean casado, int numhijos, double sueldo, double horaextras, double retencion) {
        this.nombre = nombre;
        this.dir = dir;
        this.casado = casado;
        this.numhijos = numhijos;
        this.sueldo = sueldo;
        this.horaextras = horaextras;
        this.retencion = retencion;
    }
   
        ////Horas extras realizadas
        public double CalculohoraE(){
        double horaEx;
        horaEx = this.horaextras * (this.sueldo/720);
        return horaEx;
   }
    ///Sueldo bruto
    public double salario(){
        double salario=0;
        sueldo = this.sueldo + (this.horaextras * 1);
        return salario;
    }
    ////Retenciones 
    public void retencion(){
        double ret= 350;
        
        if (casado){
           ret = ret - 2;
           ret = ret * salario();
        }
       if (numhijos < ret){
        ret = ret - 1;
        ret= ret * salario();
    }  

    }
}
