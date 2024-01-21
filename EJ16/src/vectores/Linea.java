package vectores;

public class Linea {
    private Punto p1;
    private Punto p2;

    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return String.format("Linea formateada por los puntos %s y %s", p1, p2);
    }
}
