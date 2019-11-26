package dto;

import java.io.Serializable;
import java.util.List;

public class Alumno implements Serializable {
    private int id;
    private String nombre;
    private String nacionalidad;
    private String sexo;
    private int edad;
    private List modulos;

    public List getModulos() {
        return modulos;
    }

    public void setModulos(List modulos) {
        this.modulos = modulos;
    }

    public Alumno() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", modulos=" + modulos +
                '}';
    }
}
