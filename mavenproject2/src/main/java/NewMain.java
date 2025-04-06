/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ljfon
 */
public class NewMain {
public class Planeta {
    // Atributos
    private String nombre;
    private int cantidadDeSatelites;
    private double masa;
    private double volumen;
    private int diametro;
    private int distanciaMediaAlSol; // en millones de kilómetros
    private String tipoDePlaneta;
    private boolean observable;

    // Constructor
    public Planeta(String nombre, int cantidadDeSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol, String tipoDePlaneta, boolean observable) {
        this.nombre = nombre;
        this.cantidadDeSatelites = cantidadDeSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipoDePlaneta = tipoDePlaneta;
        this.observable = observable;
    }

    // Método para mostrar los valores de los atributos de un planeta
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadDeSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaAlSol);
        System.out.println("Tipo de planeta: " + tipoDePlaneta);
        System.out.println("Observable: " + (observable ? "Sí" : "No"));
    }

    // Método para calcular la densidad del planeta
    public double calcularDensidad() {
        return masa / volumen;
    }

    // Método para determinar si un planeta es exterior (más allá del cinturón de asteroides)
    public boolean esPlanetaExterior() {
        // Convertir distancia media al Sol de millones de km a unidades astronómicas (UA)
        double distanciaUA = (distanciaMediaAlSol * 1e6) / 149597870.0;
        return distanciaUA > 3.4;
    }

    // Método principal
    public static void main(String[] args) {
        // Crear dos planetas
        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 149, "TERRESTRE", true);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.898e27, 1.43128e15, 139820, 778, "GASEOSO", true);

        // Mostrar información y cálculos de la Tierra
        System.out.println("Información del planeta Tierra:");
        tierra.mostrarInformacion();
        System.out.println("Densidad de la Tierra: " + tierra.calcularDensidad() + " kg/km³");
        System.out.println("¿Es la Tierra un planeta exterior?: " + (tierra.esPlanetaExterior() ? "Sí" : "No"));
        System.out.println();

        // Mostrar información y cálculos de Júpiter
        System.out.println("Información del planeta Júpiter:");
        jupiter.mostrarInformacion();
        System.out.println("Densidad de Júpiter: " + jupiter.calcularDensidad() + " kg/km³");
        System.out.println("¿Es Júpiter un planeta exterior?: " + (jupiter.esPlanetaExterior() ? "Sí" : "No"));
    }
}

  
      
            
        }
 
    
  
    

