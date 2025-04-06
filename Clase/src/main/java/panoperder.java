
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class panoperder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        
        int vec1[], num;
        
        System.out.println("digite el tamaño de la tabla");
        num=scr.nextInt();
        
        vec1= new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("digite los numeros " + (i+1));
            vec1[i]=scr.nextInt();
        }
        int p=0;
        for (int i = 0; i < num; i++) {
            if(vec1[i]>0){
                p++;
            }
        }
        System.out.println("la cantidad de positivos es: " + p);   
    }
}
