
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class sumdevec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scr= new Scanner(System.in);
       
       int num, vec1[], p=0, s=0;
        System.out.println("Digite los numeros de la tabla");
        num = scr.nextInt();
        vec1 = new int[num];
        
        for (int i = 0; i < num ; i++) {
            System.out.println("digite el primer numero" + (i+1));
            vec1[i] = scr.nextInt();
          }
        for (int i = 0; i < num; i++) {
            if(vec1[i]>0){
                p++;
            }
            
            
        }
        for (int i = 0; i <num ; i++) {
            s+=vec1[i];
            
            
        }
        System.out.println("el numero es  = " + p);
        System.out.println("el resultado es = " + s);
    }
}
