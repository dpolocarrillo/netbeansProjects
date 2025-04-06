/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_de_mis_amigos;

import java.util.Scanner;

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

        // Pedir al usuario que ingrese el número de ecuaciones (ramas del circuito)
        System.out.print("Ingrese el número de ecuaciones (ramas del circuito): ");
        int n = scanner.nextInt();

        // Declarar matrices para almacenar coeficientes y términos independientes
        double[][] coeficientes = new double[n][n];
        double[] independientes = new double[n];

        // Pedir al usuario que ingrese los coeficientes de las ecuaciones
        System.out.println("Ingrese los coeficientes de las ecuaciones:");
        for (int i = 0; i < n; i++) {
            System.out.println("Ecuación " + (i+1) + ":");
            for (int j = 0; j < n; j++) {
                System.out.print("Coeficiente " + (j+1) + ": ");
                coeficientes[i][j] = scanner.nextDouble();
            }
            System.out.print("Término independiente: ");
            independientes[i] = scanner.nextDouble();
        }

        // Calcular determinante principal
        double principalDeterminant = determinant(coeficientes);

        // Calcular e imprimir las intensidades de corriente utilizando el método de Cramer
        System.out.println("Intensidades de corriente:");
        for (int i = 0; i < n; i++) {
            double[][] tempMatrix = coeficientes.clone();
            for (int j = 0; j < n; j++) {
                tempMatrix[j][i] = independientes[j];
            }
            double determinant = determinant(tempMatrix);
            System.out.println("I" + (i+1) + " = " + (determinant / principalDeterminant));
        }

        scanner.close();
    }

    // Método para calcular el determinante de una matriz cuadrada
    public static double determinant(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        double det = 0;
        for (int j = 0; j < n; j++) {
            det += matrix[0][j] * cofactor(matrix, 0, j);
        }
        return det;
    }

    // Método para calcular el cofactor de un elemento de una matriz
    public static double cofactor(double[][] matrix, int row, int col) {
        return Math.pow(-1, row + col) * determinant(minor(matrix, row, col));
    }

    // Método para calcular el menor de un elemento de una matriz
    public static double[][] minor(double[][] matrix, int row, int col) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0, c = 0;
        for (int i = 0; i < n; i++) {
            if (i == row) {
                continue;
            }
            c = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) {
                    continue;
                }
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }
        return minor;
    }
}