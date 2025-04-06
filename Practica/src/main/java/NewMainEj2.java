/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class NewMainEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //public class matrices 
        
        int a [][]= new int [3][3];
        int b [][]= new int [3][3];
        int c [][]= new int [3][3];
        int d [][]= new int [3][3];
        int e [][]= new int [3][3];
        ///1. Creación de dos matrices A y B de tamaño 3x3
        System.out.println("MATRIZ A");
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=(int)(Math.random()*100);
                b[i][j]=(int)(Math.random()*100);
                System.out.print(a[i][j] + "   ");
            }
            System.out.println("");
        }
          System.out.println("MATRIZ B");
         
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print(a[i][j] + "   ");
               }
              System.out.println("");
        }
         
        ///2. Suma de A+B = C
        System.out.println("SUMA DE MATRICES");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j]= a[i][j] + b [i][j];
                System.out.print(c [i][j] + "   ");
            }
            System.out.println("");
           
        }
          //3. Diagonal Principal de C
          System.out.println("DIAGONAL PRINCIPAL");
           for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i==j){
                System.out.print(c [i][j] + "   ");
              }
           }
               System.out.println("   ");
           }
           
               ///4. Diagonal Inversa de C
               System.out.println("DIAGONAL INVERSA");
               for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i+j==(c.length-1))){
                 System.out.print(c [j][i] + "   ");    
                }
                System.out.println("   ");
            } 
               }
               
               //5. Resta de A-B = D
               System.out.println("RESTA DE MATRICES");
               for (int i = 0; i < 3; i++) {
                   for (int j = 0; j < 3; j++) {
                       d[i][j]= a[i][j]+(-1*b [i][j]);
                       System.out.print(d [i][j]+ "   ");
                   }
                   System.out.println("   ");
        }
               System.out.println("");
              /// 6. Multiplicación de A*B= E
               System.out.println("MULTIPLICACION DE MATRICES");
               
               for (int i = 0; i < 3; i++) {
                   for (int j = 0; j < 3; j++) {
                       for (int k = 0; k < 3; k++) {
                      e[i][j]+=a[i][k]*b [k][i];
                       }
                }
                   
              }
               for (int i = 0; i < i; i++) {
                   for (int j = 0; j < 3; j++) {
                       System.out.println(e[i][j] + "");
                   }
                   System.out.println("   ");
        }
        
               }
}
    
    

