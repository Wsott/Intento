package Main;

import java.util.LinkedList;

public class Persona {
    private String nombre, apellido, rol;
    private LinkedList<Persona> jefe_de;

    public Persona (String nombre, String apellido, String rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        jefe_de = new LinkedList<Persona>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void add_empleado(Persona nuevo_empleado) {
        this.jefe_de.add(nuevo_empleado);
    }

    public LinkedList<Persona> get_empleados() {
        return this.jefe_de;
    }
}
