package Main.MaterialAudiovisual;

import java.util.Date;

public class Audio extends MaterialAudiovisual {
    private String tipo;

    public Audio(Date fechaDePublicacion, String productora, String titulo, String tipo) {
        super(fechaDePublicacion, productora, titulo);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void presentar_informacion() {
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - * -");
        System.out.println("Tipo: Audio");
        System.out.printf("Fecha de publicacion: %s", super.getFechaDePublicacion().toString());
        System.out.printf("Productora: %s", super.getProductora());
        System.out.printf("Titulo: %s", super.getTitulo());
        System.out.printf("Tipo: %s", this.tipo);
    }
}
