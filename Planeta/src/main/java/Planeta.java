/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author ljfon
 */
public class Planeta {

    private String nombre;
    private int CSATELITE;
    private double Masa;
    private double Volumen;
    private int Diam;
    private int DMSol;
    private String Tplaneta;
    private boolean OAVista;

    // Constructor:
    public Planeta(String nombre,int CSATELITE,double Masa,double Volumen,int Diam,int DMSol,String Tplaneta) {
        this.nombre = nombre;
        this.CSATELITE = CSATELITE;
        this.Masa = Masa;
        this.Volumen = Volumen;
        this.Diam = Diam;
        this.DMSol = DMSol;
        this.Tplaneta = Tplaneta;
        this.OAVista = false;
    }

    Planeta(String júpiter, int i, double d, double d0, int i0, int i1, String gaseoso, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Imprimir los valores de los atributos de un planeta:
    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("La cantidad de satélites es: " + CSATELITE);
        System.out.println("Masa (kg): " + Masa);
        System.out.println("Volumen (km³): " + Volumen);
        System.out.println("Diámetro (km): " + Diam);
        System.out.println("Distancia media al Sol (millones km): " + DMSol);
        System.out.println("Tipo de planeta: " + Tplaneta);
        System.out.println("Observable a simple vista: " + OAVista);
    }

    // Calcular la densidad de un planeta:
    public double calcularDensidad() {
        return Masa / Volumen;
    }

    // Determinar si un planeta es exterior
    public boolean esPlanetaExterior() {
        double distanciaUA = DMSol/ 149597870; 
      // Convertir distancia a UA
        return distanciaUA > 2.1 && distanciaUA < 3.4;
    }

    void methodInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
  




