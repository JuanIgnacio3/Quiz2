/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Ignacio
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion[] top10 = new Cancion[2];

        for (int i = 0; i < 2; i++) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Id de la canción " + (i + 1)));
            String titulo = JOptionPane.showInputDialog("Ingrese el título de la canción " + (i + 1));
            String autor = JOptionPane.showInputDialog("Ingrese el autor de la canción " + (i + 1));
            double duracion = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la duración de la canción " + (i + 1)));
            int anoCreacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de creación de la canción " + (i + 1)));

            top10[i] = new Cancion(id, titulo, autor, duracion, anoCreacion);
        }

        //Info de canciones
        for (Cancion cancion : top10) {
            if (cancion != null) {
                System.out.println("Información de la canción:");
                System.out.println("Título: " + cancion.getTitulo());
                System.out.println("Autor: " + cancion.getAutor());
                System.out.println("Duración: " + cancion.getDuracion());
                System.out.println("Año de creación: " + cancion.getAnoCreacion());
                System.out.println("---------------------------");
            }
        }
        
       //Anteriores al año actual
        System.out.println("Canciones anteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion != null && cancion.getAnoCreacion() < 2023) {
                System.out.println("Título: " + cancion.getTitulo());
            }
        }

        //Año actual
        System.out.println("Canciones del año actual:");
        for (Cancion cancion : top10) {
            if (cancion != null && cancion.getAnoCreacion() == 2023) {
                System.out.println("Título: " + cancion.getTitulo());
            }
        }

        //Posteriores al año actual
        System.out.println("Canciones posteriores al año actual:");
        for (Cancion cancion : top10) {
            if (cancion != null && cancion.getAnoCreacion() > 2023) {
                System.out.println("Título: " + cancion.getTitulo());
            }
        }

        //Mayor duración
        System.out.println("Canción de mayor duración:");
        Cancion cancionMayorDuracion = obtenerCancionMayorDuracion(top10);
        if (cancionMayorDuracion != null) {
            System.out.println("Título: " + cancionMayorDuracion.getTitulo());
        }

        // Autor de primera posición
        System.out.println("Autor de la canción en la primera posición:");
        Cancion primeraCancion = top10[0];
        if (primeraCancion != null) {
            System.out.println("Autor: " + primeraCancion.getAutor());
        }
    }

    //Mayor duración
    private static Cancion obtenerCancionMayorDuracion(Cancion[] canciones) {
        Cancion mayorDuracion = null;
        for (Cancion cancion : canciones) {
            if (cancion != null) {
                if (mayorDuracion == null || cancion.getDuracion() > mayorDuracion.getDuracion()) {
                    mayorDuracion = cancion;
                }
            }
        }
        return mayorDuracion;
    }
}