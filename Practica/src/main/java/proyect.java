
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Paso 1: Pedir la cantidad de nodos del circuito
        System.out.print("Ingrese la cantidad de nodos del circuito: ");
        int cantidadNodos = scanner.nextInt();

        int[] intensidades = new int[cantidadNodos];
        
        // Paso 2: Pedir la cantidad de intensidades que pasan por cada nodo
        for (int i = 0; i < cantidadNodos; i++) {
            System.out.print("Ingrese la cantidad de intensidades que pasan por el nodo " + (i + 1) + ": ");
            intensidades[i] = scanner.nextInt();
        }

        // Paso 3: Pedir el valor de voltaje en cada malla
        double[] voltajes = new double[cantidadNodos];
        for (int i = 0; i < cantidadNodos; i++) {
            System.out.print("Ingrese el valor del voltaje en la malla " + (i + 1) + ": ");
            voltajes[i] = scanner.nextDouble();
        }

        // Paso 3.2: Pedir la cantidad de resistencias y su valor en cada malla
        double[][] resistencias = new double[cantidadNodos - 1][];
        for (int i = 0; i < cantidadNodos - 1; i++) {
            System.out.print("Ingrese la cantidad de resistencias en la malla " + (i + 1) + ": ");
            int cantidadResistencias = scanner.nextInt();
            resistencias[i] = new double[cantidadResistencias];
            for (int j = 0; j < cantidadResistencias; j++) {
                System.out.print("Ingrese el valor de la resistencia " + (j + 1) + " en la malla " + (i + 1) + ": ");
                resistencias[i][j] = scanner.nextDouble();
            }
        }

        // Paso 4: Construir las matrices
        double[][] matrizIntensidades = new double[cantidadNodos][cantidadNodos - 1];
        double[][] matrizVoltajes = new double[cantidadNodos][cantidadNodos];
        double[][] matrizResistencias = new double[cantidadNodos - 1][cantidadNodos - 1];

        for (int i = 0; i < cantidadNodos; i++) {
            for (int j = 0; j < cantidadNodos - 1; j++) {
                matrizIntensidades[i][j] = (j < intensidades[i]) ? 1 : 0;
            }
        }

        for (int i = 0; i < cantidadNodos; i++) {
            matrizVoltajes[i][i] = voltajes[i];
        }

        for (int i = 0; i < cantidadNodos - 1; i++) {
            for (int j = 0; j < cantidadNodos - 1; j++) {
                if (i == j) {
                    for (int k = 0; k < intensidades[i]; k++) {
                        matrizResistencias[i][j] += resistencias[i][k];
                    }
                }
            }
        }

        // Paso 5: Calcular determinantes
        double determinanteSistema = calcularDeterminante(matrizIntensidades);

        double[] determinantesIntensidades = new double[cantidadNodos];
        for (int i = 0; i < cantidadNodos; i++) {
            double[][] matrizIntensidadesMod = matrizIntensidades.clone();
            for (int k = 0; k < cantidadNodos - 1; k++) {
                matrizIntensidadesMod[k][i] = matrizVoltajes[k][0];
            }
            determinantesIntensidades[i] = calcularDeterminante(matrizIntensidadesMod);
        }

        // Paso 6: Calcular intensidades
        double[] intensidadesCalculadas = new double[cantidadNodos];
        for (int i = 0; i < cantidadNodos; i++) {
            intensidadesCalculadas[i] = determinantesIntensidades[i] / determinanteSistema;
        }

        // Paso 7: Mostrar resultados
        for (int i = 0; i < cantidadNodos; i++) {
            System.out.println("Intensidad i" + (i + 1) + ": " + intensidadesCalculadas[i] + " A");
            if (intensidadesCalculadas[i] < 0) {
                System.out.println("(La corriente va en sentido contrario a las manecillas del reloj)");
            }
        }
    }

    // Método para calcular el determinante de una matriz cuadrada
    public static double calcularDeterminante(double[][] matriz) {
        int n = matriz.length;
        double determinante = 0;

        if (n == 1) {
            return matriz[0][0];
        }

        if (n == 2) {
            return matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        }

        for (int i = 0; i < n; i++) {
            double[][] submatriz = new double[n - 1][n - 1];
            for (int j = 1; j < n; j++) {
                for (int k = 0, l = 0; k < n; k++) {
                    if (k != i) {
                        submatriz[j - 1][l++] = matriz[j][k];
                    }
                }
            }
            determinante += Math.pow(-1, i) * matriz[0][i] * calcularDeterminante(submatriz);
        }

        return determinante;
    }
}

     
