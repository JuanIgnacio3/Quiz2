/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz.pkg2;

/**
 *
 * @author Ignacio
 */
public class Cancion {
    private int id;
    private String titulo;
    private String autor;
    private double duracion;
    private int anoCreacion;

    public Cancion(int id, String titulo, String autor, double duracion, int anoCreacion) { //constructor
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anoCreacion = anoCreacion;
    }

    public int getId() { //getters y setters
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAnoCreacion() {
        return anoCreacion;
    }

    public void setAnoCreacion(int anoCreacion) {
        this.anoCreacion = anoCreacion;
    }
}
