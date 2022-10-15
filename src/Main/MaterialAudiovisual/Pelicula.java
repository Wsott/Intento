package Main.MaterialAudiovisual;

import java.util.Date;

public class Pelicula extends MaterialAudiovisual {
    private float duracion;

    public Pelicula(Date fechaDePublicacion, String productora, String titulo, float duracion) {
        super(fechaDePublicacion, productora, titulo);
        this.duracion = duracion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public void presentar_informacion() {
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - * -");
        System.out.println("Tipo: Pelicula");
        System.out.printf("Fecha de publicacion: %s", super.getFechaDePublicacion().toString());
        System.out.printf("Productora: %s", super.getProductora());
        System.out.printf("Titulo: %s", super.getTitulo());
        System.out.printf("Duracion: %f", getDuracion());
    }
}
