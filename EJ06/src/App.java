import tiempo.Tiempo;

public class App {
    public static void main(String[] args) throws Exception {
        Tiempo t1 = new Tiempo(1, 20, 30);
        Tiempo t2 = new Tiempo(0, 30, 40);
        Tiempo t3 = new Tiempo(0, 35, 20);

        System.out.printf("%s + %s = %s%n", t1.toString(), t2.toString(), t1.suma(t2));
        System.out.printf("%s - %s = %s%n", t2.toString(), t3.toString(), t2.resta(t3));
    }
}