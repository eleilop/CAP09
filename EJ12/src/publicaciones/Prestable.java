package publicaciones;

public interface Prestable {
    public void presta() throws AlreadyLentException;
    public void devuelve();
    public boolean estaPrestado();
}