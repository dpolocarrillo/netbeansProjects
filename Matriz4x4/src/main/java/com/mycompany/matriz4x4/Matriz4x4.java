/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matriz4x4;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author ljfon
 */
public class Matriz4x4 {

    public static void main(String[] args) {
                int NE[][] = new int [4][4];
        int suma=0;
       
        int fila=0;
        int columna=0;
        DecimalFormat  d = new DecimalFormat ("#.##");
        for (int i = 0; i < 4; i++) { 
            for (int j = 0; j < 4; j++) {
                NE [i][j]= (int)(Math.random()*100);
                System.out.println(NE [i][j]+ "");
            }
            System.out.println("");
        }
        do{
            fila = Integer.parseInt(JOptionPane.showInputDialog("Digite fila"));
           if(fila>0 && fila<3){
               
               for (int i = 0; i < 4; i++) {
                   suma=suma+NE[fila][i];
               }
                   System.out.println("la suma de la fila" + fila + " es:" +suma);
               }
        }
             while (fila<0 && fila>3);
           
           
            
        do {
            columna = Integer.parseInt(JOptionPane.showInputDialog("Digite columna"));
            if (columna >= 0 && columna <= 3) {

                for (int i = 0; i < 4; i++) {
                    suma = suma + NE[i][columna];
                }
                System.out.println("la suma de la columna" + columna + "es:"+ suma);
            }
        } while (columna > 0 && columna < 3);
        suma=0;
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i) {
                    System.out.println("la diagonal principal" + "es"+ NE[i][j]);
                }
            }
        }
        
           for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i+j==3) {
                    System.out.println("la diagonal inversa" + "es"+NE[i][j]);

                }
            }
        }

    }
}
    

