/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author ljfon
 */
public class cuentaahorro extends cuenta {
    
    private boolean activa;
    public cuentaahorro(double saldo) {
        super(saldo);
     if(this.saldo>=10000){
       activa=true;
   System.out.println("cuenta activa");
}
    else{
    activa=false;
         System.out.println("cuenta inactiva");
    }  
}
    
 public void consignar(double cantidad){
     if(activa) 
       super.consignar(cantidad);
     
     else 
         System.out.println("no puede consignar en cuentas inactivas");
 }       
 public void retirar(double cantidad){
     double flag=this.saldo+cantidad;
     if(activa && flag>10000){
         super.retirar(cantidad);
     } else{
         System.out.println("la cantidad no es permitida");
     }
             
 }   public void mostrar(){
     super.mostrar();
     System.out.println ("activa:" + this.activa);
 }  
 }
