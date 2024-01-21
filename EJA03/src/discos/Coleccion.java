package discos;
import crud.CRUD;

public class Coleccion implements CRUD {
    // Atributo de instancia
    private Disco[] discos;

    // Constructor
    public Coleccion() {
        discos = new Disco[100];
    }

    // Funciones CRUD
    @Override
    public void listaDiscos() {
        for(int i=0;i<discos.length;i++) {
            if (discos[i]!=null)
                discos[i].toString();
        }
    }

    @Override
    public Disco anadeDisco(Disco disco) {
        for(int i=0;i<discos.length;i++) {
            if (discos[i]==null) {
                discos[i]=disco;
                return disco;
            }
        }
        return disco;
    }

    @Override
    public String actualizaDisco(String codigo, String nombre, String autor, String genero, int duracion) {
        for(int i=0; i<=discos.length;i++) {
            if(discos[i]!=null) {
                if(codigo==discos[i].getCodigo()) {
                    discos[i].setNombre(nombre);
                    discos[i].setAutor(autor);
                    discos[i].setGenero(genero);
                    discos[i].setDuracion(duracion);
                    return discos[i].toString();
                }
            }
        }
        return "";
    }

    @Override
    public void eliminaDisco(String codigo) {
        for(int i=0; i<=discos.length;i++) {
            if(codigo==discos[i].getCodigo()) {
                discos[i] = null;
            }
        }
    }
}
