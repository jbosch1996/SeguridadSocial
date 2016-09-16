package com.company;

/**
 * Created by usu26 on 16/09/2016.
 */
public class Coche {
    private String marca;
    private String modelo;
    private String matricula;
    private int potencia;
    private double precio;

    public Coche(String marca, String modelo, String matricula, int potencia, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (potencia != coche.potencia) return false;
        if (Double.compare(coche.precio, precio) != 0) return false;
        if (marca != null ? !marca.equals(coche.marca) : coche.marca != null) return false;
        if (modelo != null ? !modelo.equals(coche.modelo) : coche.modelo != null) return false;
        return matricula != null ? matricula.equals(coche.matricula) : coche.matricula == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = marca != null ? marca.hashCode() : 0;
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + (matricula != null ? matricula.hashCode() : 0);
        result = 31 * result + potencia;
        temp = Double.doubleToLongBits(precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", precio=" + precio +
                '}';
    }
}
