package com.company.Coche;

/**
 * Created by usu26 on 19/09/2016.
 */

public class Persona {
    private String dni;
    private String num_seguridad;
    private String nombre;
    private String apellidos;
    private int edad;


    public Persona() {}

    public Persona(String dni, String num_seguridad, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.num_seguridad = num_seguridad;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNum_seguridad() {
        return num_seguridad;
    }

    public void setNum_seguridad(String num_seguridad) {
        this.num_seguridad = num_seguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (num_seguridad != null ? !num_seguridad.equals(persona.num_seguridad) : persona.num_seguridad != null)
            return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellidos != null ? apellidos.equals(persona.apellidos) : persona.apellidos == null;

    }

    @Override
    public int hashCode() {
        int result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (num_seguridad != null ? num_seguridad.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellidos != null ? apellidos.hashCode() : 0);
        result = 31 * result + edad;
        return result;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", num_seguridad='" + num_seguridad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                '}';
    }
}
