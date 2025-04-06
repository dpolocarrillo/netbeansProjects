/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase;

import java.util.Scanner;

/**
 *
 * @author ljfon
 */
public class Clase {

    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        int num;
        System.out.println("Digite el tamaño del vector");
        num= scr.nextInt();
        Res= ejemplo(num);
        System.out.println("La suma de todo es" + Res);
        
        
        
    }
    public static int ejemplo(int num){
        int[] vec1 = new int [num];
        Scanner scr= new Scanner (System.in);
        int acum=0;
        
        
        
        for (int i = 0; i < num; i++){
            System.out.println("DIGITE VALOR");
            vec1 (i)=scr.nextInt();
            acum= vec1[i]+acum;
        }
        return acum;
   }
}
