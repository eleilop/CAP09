package crud;
import discos.Disco;

public interface CRUD {
    public Disco anadeDisco(Disco disco);
    public String actualizaDisco(String codigo, String nombre, String autor, String genero, int duracion);
    public void eliminaDisco(String codigo);
    public void listaDiscos();
}