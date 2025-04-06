/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class NewMainEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ///MATRIZ 1
        int m1 [][]= new int [6][2];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                m1[i][j]=(int)(Math.random()*100);
                System.out.print(m1[i][j]+"");
               }
            System.out.println("");
        }
         ///MATRIZ 2
            int m2 [][] = new int [5][8];
            
           for (int i = 0; i < 5; i++) {
               for (int j = 0; j < 8; j++) {
                   m2 [i][j]=(int)(Math.random()*100);
                   System.out.print(m2[i][j]+"");
                }
               System.out.println("");
         }
           ///MATRIZ 3
                int m3 [][]= new int [4][2];
                
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        m3 [i][j] = (int)(Math.random()*100);
                        System.out.print( m3 [i][j] + "");
                    }
                    System.out.println("");
        }
            ///MATRIZ 4
            int m4 [][] = new int [3][5];
            
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                m4 [i][j]=(int)(Math.random()*100);
                System.out.println( m4[i][j] + "");
             }
                System.out.println("");
            }
            //MATRIZ 5
            int m5 [][]= new int [3][10];
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 10; j++) {
                    m5 [i][j]=(int)(Math.random()*100);
                    System.out.print(m5 [i][j] + "");
                 }
                System.out.println("");
        }
            //MATRIZ 6 
            int m6 [][]=new int [3][3];
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    m6[i][j]=(int)(Math.random()*100);
                    System.out.print(m6 [i][j] + "");
                }
                System.out.println("");
        }
            
        //MATRIZ 7
        int m7 [][]= new int [7][4];
        
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                m7 [i][j]=(int)(Math.random()*100);
                System.out.print(m7 [i][j] + "");
            }
            System.out.println("");
        }
             //MATRIZ 8
        int m8 [][]= new int [5][3];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                m7 [i][j]=(int)(Math.random()*100);
                System.out.print(m8 [i][j] + "");
            }
            System.out.println("");
        }
        //MATRIZ 9
        int m9 [][]= new int [5][4];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                m7 [i][j]=(int)(Math.random()*100);
                System.out.print(m9 [i][j] + "");
            }
            System.out.println("");
        }     
            
    }
    
}
