package com.company.Coche;

/**
 * Created by usu26 on 03/10/2016.
 */
public class Taller {

    private String persona;
    private String coche;
    private String registro_vehiculos;
    private String taller;
    private String main;

    public Taller (){}

    public Taller(String persona, String coche, String registro_vehiculos, String taller, String main) {
        this.persona = persona;
        this.coche = coche;
        this.registro_vehiculos = registro_vehiculos;
        this.taller = taller;
        this.main = main;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public String getRegistro_vehiculos() {
        return registro_vehiculos;
    }

    public void setRegistro_vehiculos(String registro_vehiculos) {
        this.registro_vehiculos = registro_vehiculos;
    }

    public String getTaller() {
        return taller;
    }

    public void setTaller(String taller) {
        this.taller = taller;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Taller taller1 = (Taller) o;

        if (persona != null ? !persona.equals(taller1.persona) : taller1.persona != null) return false;
        if (coche != null ? !coche.equals(taller1.coche) : taller1.coche != null) return false;
        if (registro_vehiculos != null ? !registro_vehiculos.equals(taller1.registro_vehiculos) : taller1.registro_vehiculos != null)
            return false;
        if (taller != null ? !taller.equals(taller1.taller) : taller1.taller != null) return false;
        return main != null ? main.equals(taller1.main) : taller1.main == null;

    }

    @Override
    public int hashCode() {
        int result = persona != null ? persona.hashCode() : 0;
        result = 31 * result + (coche != null ? coche.hashCode() : 0);
        result = 31 * result + (registro_vehiculos != null ? registro_vehiculos.hashCode() : 0);
        result = 31 * result + (taller != null ? taller.hashCode() : 0);
        result = 31 * result + (main != null ? main.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Taller{" +
                "persona='" + persona + '\'' +
                ", coche='" + coche + '\'' +
                ", registro_vehiculos='" + registro_vehiculos + '\'' +
                ", taller='" + taller + '\'' +
                ", main='" + main + '\'' +
                '}';
    }
}
