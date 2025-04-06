/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Denis Polo
 */
public class Ejecutable {

   public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área del círculo: " + circulo.area());
        System.out.println("Perímetro del círculo: " + circulo.perimetro());

        Rectangulo rectangulo = new Rectangulo(4, 6);
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());

        Cuadrado cuadrado = new Cuadrado(4);
        System.out.println("Área del cuadrado: " + cuadrado.area());
        System.out.println("Perímetro del cuadrado: " + cuadrado.perimetro());

        Triangulo triangulo = new Triangulo(4, 3, 3, 4, 5);
        System.out.println("Área del triángulo: " + triangulo.area());
        System.out.println("Perímetro del triángulo: " + triangulo.perimetro());
    }
    
}
