import vectores.Linea;
import vectores.Punto;

public class App {
    public static void main(String[] args) throws Exception {
        Punto p1 = new Punto(0, 3);
        Punto p2 = new Punto(4, 8);
        Linea l = new Linea(p1, p2);

        System.out.println(l);
    }
}