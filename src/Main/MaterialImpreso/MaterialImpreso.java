package Main.MaterialImpreso;

import Main.IPresentar;

import java.util.Date;

public abstract class MaterialImpreso implements IPresentar {
    private Date fecha_de_publicacion;
    private String editorial;

    public MaterialImpreso(Date fecha_de_publicacion, String editorial) {
        this.fecha_de_publicacion = fecha_de_publicacion;
        this.editorial = editorial;
    }

    public Date getFecha_de_publicacion() {
        return fecha_de_publicacion;
    }

    public void setFecha_de_publicacion(Date fecha_de_publicacion) {
        this.fecha_de_publicacion = fecha_de_publicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
