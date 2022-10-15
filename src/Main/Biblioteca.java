package Main;

import Main.MaterialAudiovisual.Audio;
import Main.MaterialAudiovisual.Pelicula;
import Main.MaterialImpreso.Libro;
import Main.MaterialImpreso.Periodico;

import java.util.LinkedList;

public class Biblioteca implements IPresentar{
    private String nombre;
    private LinkedList<Persona> empleados;
    private LinkedList<Audio> audios;
    private LinkedList<Pelicula> peliculas;
    private LinkedList<Periodico> periodicos;
    private LinkedList<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        empleados = new LinkedList<Persona>();
        audios = new LinkedList<Audio>();
        peliculas = new LinkedList<Pelicula>();
        periodicos = new LinkedList<Periodico>();
        libros = new LinkedList<Libro>();
    }

    public void listar_empleados() {

    }

    public void agregar_libro(Libro nuevo) {
        libros.add(nuevo);
    }

    public void agregar_audio(Audio nuevo) {
        audios.add(nuevo);
    }

    public void agregar_pelicula(Pelicula nuevo) {
        peliculas.add(nuevo);
    }

    public void agregar_periodico(Periodico nuevo) {
        periodicos.add(nuevo);
    }

    public void listar_audios() {
        for (Audio actual: audios) {
            presentar(actual);
        }
    }

    public void listar_peliculas() {
        for (Pelicula actual: peliculas) {
            presentar(actual);
        }
    }

    public void listar_periodicos() {
        for (Audio actual: audios) {
            presentar(actual);
        }
    }

    public void listar_libros() {
        for (Audio actual: audios) {
            presentar(actual);
        }
    }

    private void presentar(IPresentar elemento) {
        presentar(elemento);
    }

    @Override
    public void presentar_informacion() {
        System.out.printf("Biblioteca: '%s'", this.nombre);
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - * -");
        System.out.println("- * - * - * - * - * LIBROS * - * - * - * - * - * -");
        listar_libros();
        System.out.println("- * - * - * - * - * PERIODICOS * - * - * - * - * - * -");
        listar_periodicos();
        System.out.println("- * - * - * - * - * AUDIOS * - * - * - * - * - * -");
        listar_audios();
        System.out.println("- * - * - * - * - * PELICULAS * - * - * - * - * - * -");
        listar_peliculas();
    }
}
