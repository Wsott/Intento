package Main.MaterialImpreso;

import java.util.Date;

public class Libro extends MaterialImpreso {
    private String titulo, genero;

    public Libro(Date fecha_de_publicacion, String editorial, String titulo, String genero) {
        super(fecha_de_publicacion, editorial);
        this.titulo = titulo;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void presentar_informacion() {
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - * -");
        System.out.println("Tipo: Libro");
        System.out.printf("Fecha de publicacion: %s", super.getFecha_de_publicacion());
        System.out.printf("Editorial: %s", getEditorial());
        System.out.printf("Titulo: %s", getTitulo());
        System.out.printf("Genero: %s", getGenero());
    }
}
