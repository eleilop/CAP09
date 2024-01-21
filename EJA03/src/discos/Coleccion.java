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
            if (discos[i]!=null) {
                discos[i]=disco;
                return disco;
            }
        }
        return disco;
    }

    @Override
    public Disco actualizaDisco(String codigo, String nombre, String autor, String genero, int duracion) {
        for(int i=0; i<=discos.length;i++) {
            if(codigo==discos[i].getCodigo()) {
                if(!nombre.equals(""))
                    discos[i].setNombre(nombre);
                if(!autor.equals(""))
                    discos[i].setAutor(autor);
                if(!genero.equals(""))
                    discos[i].setGenero(genero);
                if(duracion!=0)
                    discos[i].setDuracion(duracion);
            }
        }
        return new Disco(nombre, autor, genero, duracion);
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
