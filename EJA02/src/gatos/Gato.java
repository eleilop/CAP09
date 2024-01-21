package gatos;
import sexos.Sexo;

public class Gato {
    // Atributos de instancia
    private String nombre;
    private Sexo sexo;

    // Constructores
    public Gato(String nombre, Sexo sexo) {
        this.nombre = nombre;
        this.sexo = sexo;
    }

    public Gato(String nombre) {
        this.nombre = nombre;
        this.sexo = Sexo.MACHO;
    }

    public Gato(Sexo sexo) {
        this.nombre = "Garfield";
        this.sexo = sexo;
    }

    public Gato() {
        this.nombre = "Garfield";
        this.sexo = Sexo.MACHO;
    }

    // Funciones
    public String getNombre() {
        return nombre;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}