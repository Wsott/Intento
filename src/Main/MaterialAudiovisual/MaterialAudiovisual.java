package Main.MaterialAudiovisual;

import Main.IPresentar;

import java.util.Date;

public abstract class MaterialAudiovisual implements IPresentar {
    private Date fechaDePublicacion;
    private String productora, titulo;

    public MaterialAudiovisual(Date fechaDePublicacion, String productora, String titulo) {
        this.fechaDePublicacion = fechaDePublicacion;
        this.productora = productora;
        this.titulo = titulo;
    }

    public Date getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(Date fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
