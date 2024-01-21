package incidencias;

public class Incidencia {
    public static int pendientes;
    private static int contador;

    private int codigo;
    private int puesto;
    private String estado;
    private String problema;
    private String resolucion;

    public Incidencia(int puesto, String problema) {
        this.codigo = ++contador;
        this.puesto = puesto;
        this.problema = problema;
        this.estado = "Pendiente";
        pendientes++;
    }

    public void resuelve(String resolucion) {
        this.resolucion = resolucion;
        this.estado = "Resuelta";
        pendientes--;
    }

    public static int getPendientes() {
        return pendientes;
    }

    @Override
    public String toString() {
        return String.format("Incidencia %d - Puesto: %d - %s - %s %s",
        this.codigo,
        this.puesto,
        this.problema,
        this.estado,
        (this.estado.equals("Resuelta"))?"- "+this.resolucion:"");
    }
}