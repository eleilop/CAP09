import figuras.Piramide;
import figuras.Rectangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Piramide p1 = new Piramide(5);
        Rectangulo r1 = new Rectangulo(5, 3);
        System.out.println(p1);
        System.out.println(r1);
    }
}