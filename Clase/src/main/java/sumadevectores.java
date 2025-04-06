
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class sumadevectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scr = new Scanner (System.in);
        
        int vec1[],vec2[],num;
        
        System.out.println("digite el tamaño del vector");
        num=scr.nextInt();
        
        vec1= new int[num];
        vec2= new int[num];
        
        for (int i = 0; i < num; i++) {
            System.out.println("diigte los numeros del primero vector");
            vec1[i]=scr.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("digite los numeros del segundo vector");
            vec2[i]=scr.nextInt();
        }
        for (int i = 0; i < num; i++) {
            vec1[i]=vec1[i]+vec2[i];
        }
        for (int i = 0; i < num; i++) {
            System.out.println(vec1[i]);
        }
    }
}
