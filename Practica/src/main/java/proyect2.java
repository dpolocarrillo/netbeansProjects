
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class proyect2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scr = new Scanner(System.in);
            System.out.println("Bienvenido Usuario");
            System.out.print("Ingrese la cantidad de nodos del circuito: ");
            int nodos = scr.nextInt();
            System.out.print("Ingrese la cantidad de intensidades que pasan por el nodo: ");
            int intensidades = scr.nextInt();
            int[][] signoIntensidades = new int[nodos][intensidades];
            double[][] resistencias = new double[nodos][intensidades];
            double[] voltajes = new double[nodos];
            for (int i = 0; i < nodos; i++) {
            System.out.println("Malla " + (i + 1) + ":");
            System.out.println("Recuerda la regla de las manecillas del reloj");
            System.out.print("Ingrese la cantidad de voltaje: ");
            voltajes[i] = scr.nextDouble();
            System.out.print("Ingrese la cantidad de resistencias: ");
            int cantidadResistencias = scr.nextInt();
            for (int j = 0; j < cantidadResistencias; j++) {
            System.out.print("Ingrese el valor de la resistencia " + (j + 1) + ": ");
            resistencias[i][j] = scr.nextDouble();
            System.out.print("¿La resistencia interactúa con la intensidad " + (j + 1) + "? (1 si, 0 no): ");
            int interactua = scr.nextInt();
            if (interactua == 1) {
            System.out.print("¿La intensidad " + (j + 1) + " entra (1) o sale (0) del nodo? ");
            int sentido = scr.nextInt();
            signoIntensidades[i][j] = (sentido == 1) ? 1 : -1;
            }
            }
            }
            double[][] matriz = new double[nodos][intensidades];
            double[] terminosIndependientes = new double[nodos];

            for (int i = 0; i < nodos; i++) {
            terminosIndependientes[i] = voltajes[i];
            for (int j = 0; j < intensidades; j++) {
             matriz[i][j] = signoIntensidades[i][j] * resistencias[i][j];
            }
            }
            double determinanteSistema = 0;
            for (int i = 0; i < intensidades; i++) {
            double productoDiagonalPrincipal = 1;
            double productoDiagonalSecundaria = 1;
            for (int j = 0; j < nodos; j++) {
            productoDiagonalPrincipal *= matriz[j][(i + j) % intensidades];
            productoDiagonalSecundaria *= matriz[j][(i + intensidades - j) % intensidades];
            }
            determinanteSistema += productoDiagonalPrincipal;
            determinanteSistema -= productoDiagonalSecundaria;
            }
            double[] determinantesIntensidades = new double[intensidades];
            for (int i = 0; i < intensidades; i++) {
            double[][] matrizIntensidad = new double[nodos][intensidades];
            for (int j = 0; j < nodos; j++) {
            for (int k = 0; k < intensidades; k++) {
            if (k == i) {
            matrizIntensidad[j][k] = terminosIndependientes[j];
            } else {
            matrizIntensidad[j][k] = matriz[j][k];
            }
            }
            }
            double determinanteIntensidad = 0;
            for (int j = 0; j < intensidades; j++) {
            double productoDiagonalPrincipal = 1;
            double productoDiagonalSecundaria = 1;
            for (int k = 0; k < nodos; k++) {
            productoDiagonalPrincipal *= matrizIntensidad[k][(j + k) % intensidades];
            productoDiagonalSecundaria *= matrizIntensidad[k][(j + intensidades - k) % intensidades];
            }
            determinanteIntensidad += productoDiagonalPrincipal;
            determinanteIntensidad -= productoDiagonalSecundaria;
            }
            determinantesIntensidades[i] = determinanteIntensidad;
            }
            double[] intensidadesResultado = new double[intensidades];
            for (int i = 0; i < intensidades; i++) {
            intensidadesResultado[i] = determinantesIntensidades[i] / determinanteSistema;
            }
            for (int i = 0; i < intensidades; i++) {
            System.out.println("Intensidad i" + (i + 1) + ": " + intensidadesResultado[i] + " amperios");
        }
    }
}
  
