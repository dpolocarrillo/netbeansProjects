
import java.util.Scanner;
import java.util.HashSet;


* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license


/**
 *
 * @author ljfon
 */
  public class Producto {

    private String codigo;
    private int pcompra;
    private int cbodega;
    private int cmbodega;

    public Producto(String codigo, int pcompra, int cbodega, int cmbodega) {
        this.codigo = codigo;

    }

   public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo){
    this.codigo=codigo;
    }
    public int getPcompra() {
        return pcompra;
    }

    public int getCbodega() {
        return cbodega;
    }

    public int getCmbodega() {
        return cmbodega;
    }
   
    
   

    
    

    
    }

    public boolean Existencia() {
        if () {

        }
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Ingrese codigo de producto");
        String Codigo = scr.nextLine();

        Producto producto = new Producto(Codigo);

        System.out.println("Ingrese el precio de compra");
    }

}
