/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.em;

/**
 *
 * @author ljfon
 */
public class Em {

    public class Circulo extends Em {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}}
public class Rectangulo extends Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }
}
public class Cuadrado extends Rectangulo {
    public Cuadrado(double lado) {
        super(lado, lado);
    }
}
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + lado3;
    }
}

public class Main {
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