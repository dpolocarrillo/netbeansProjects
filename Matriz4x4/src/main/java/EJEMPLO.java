
import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class EJEMPLO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] Ma = new int[5][5];
        DecimalFormat M = new DecimalFormat ("#.##");
        ///// LLENAR LA MATRIZ CON NUMEROS ALEATORIOS
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                Ma[i][j] = (int)(Math.random()*100);
                System.out.println(Ma[i][j]+ "");
            }
        }

        ///// MOSTRAR LA MATRIZ 
        System.out.println("Digite la matriz");
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(Ma[i][j] + "Ma");
            }
            System.out.println();
        }

        ///// CALCULAR EL PROMEDIO DE LA MATRIZ 
        int STotal=0;
        int prom=0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
               STotal = Ma[i][j];
            }
        }
        prom=STotal/(5*5);
        System.out.println("el promedio de la matriz es:" + prom);

        ///// ENCONTRAR EL NUMERO MAYOR Y LA CANTIDAD DE VECES QUE SE REPITE 
        int NM = Ma[0][0];
        int FM = 0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (Ma[i][j] > NM) {
                    NM= Ma[i][j];
                    FM= 1;
                } else if (Ma[i][j] == NM) {
                    FM++;
                }
            }
        }
        System.out.println("El numero mayor es" + NM);
        System.out.println("Cantidad de veces que se repite: " + FM);

        ///// MOSTRAR TODOS LOS NUMEROS PARES 
        System.out.println("digite los números pares de la matriz:");
        for (int i =0; i<5; i++) {
            for (int j=0; j<5; j++) {
                if (Ma[i][j] % 2==0) {
                    System.out.print(Ma[i][j] + "");
                }
            }
        }
        System.out.println();

        ///// CALCULAR LA SUMA DE LAS DIAGONALES 
        int SDiaPrinci=0;
        int SDiaSecun=0;
        
        for (int i=0; i<5; i++) {
            SDiaPrinci = Ma[i][i];
            SDiaSecun= Ma[i][4-i];
        }
        System.out.println("la suma de la diagonal principal es: " + SDiaPrinci);
        System.out.println("la suma de la diagonal secundaria es: " + SDiaSecun);

        ///// CALCULAR LA AUMA DE LA ULTIMA FILA
        int SUFila=0;
           for (int j=0; j<5; j++) {
            SUFila =Ma[4][j];
        }
        System.out.println("la suma de la última fila es: " + SUFila);
    }
}

 
    

 