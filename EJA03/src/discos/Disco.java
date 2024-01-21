package discos;
import uuids.MyUuid;

public class Disco {
    // Atributos de instancia
    private String codigo;
    private String nombre;
    private String autor;
    private String genero;
    private int duracion;

    // Constructor
    public Disco(String nombre, String autor, String genero, int duracion) {
        this.codigo = MyUuid.getUuid(6);
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.duracion = duracion;
    }

    // Funciones GET
    public String getAutor() {
        return autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }


    // Funciones SET
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String salida = "";
        salida+="------------------------------\n";
        salida+=String.format("Código: %s%n", codigo);
        salida+=String.format("Título: %s%n", nombre);
        salida+=String.format("Autor: %s%n", autor);
        salida+=String.format("Género: %s%n", genero);
        salida+=String.format("Duración: %d%n", duracion);
        salida+="------------------------------\n";
        return salida;
    }
}
