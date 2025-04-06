/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cancion;

/**
 *
 * @author ljfon
 */
public class Cancion {

    private String titulo;
    private String autor;

    ///// Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    ///// Constructor predeterminado
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    ///// Devuelve y establece el titulo y el autor
    public String DTitulo() {
        return titulo;
    }

    public String DAutor() {
        return autor;
    }

    public void CTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void CAutor(String autor) {
        this.autor = autor;
    }

   public String cancion() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
