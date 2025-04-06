/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class planeta2 {
        
      public static void main(String[] args) {
       
      // Crear dos planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149, "TERRESTRE", true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778, "GASEOSO", true);

        // Mostrar información y cálculos de la Tierra
        System.out.println("Información del planeta Tierra:");
        tierra.methodInformacion();
        System.out.println("La densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es la Tierra un planeta exterior?: " + (tierra.esPlanetaExterior() ? "Sí" : "No"));
        System.out.println();

        // Mostrar información y cálculos de Júpiter
        System.out.println("Información del planeta Júpiter:");
        jupiter.mostrarInformacion();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es Júpiter un planeta exterior?: " + (jupiter.esPlanetaExterior() ? "Sí" : "No"));
    }
}
    
    

