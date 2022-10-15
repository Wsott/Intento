package Main.MaterialImpreso;

import java.util.Date;

public class Periodico extends MaterialImpreso {
    private String titular;

    public Periodico(Date fecha_de_publicacion, String editorial, String titular) {
        super(fecha_de_publicacion, editorial);
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void presentar_informacion() {
        System.out.println("- * - * - * - * - * - * - * - * - * - * - * - * -");
        System.out.println("Tipo: Periodico");
        System.out.printf("Fecha de publicacion: %s", super.getFecha_de_publicacion());
        System.out.printf("Editorial: %s", getEditorial());
        System.out.printf("Titular: %s", getTitular());
    }
}
