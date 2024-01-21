import terminales.Movil;

public class App {
    public static void main(String[] args) throws Exception {
        Movil m1 = new Movil("605 32 64 72", "rata");
        Movil m2 = new Movil("605 32 64 72", "mono");

        m1.llama(m2, 300);
        System.out.println(m1.toString());
        System.out.println(m2.toString());
    }
}