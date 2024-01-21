import terminales.Terminal;

public class App {
    public static void main(String[] args) throws Exception {
        Terminal t1 = new Terminal("678 11 22 33");
        Terminal t2 = new Terminal("678 11 22 33");
        System.out.println(t1.toString());
        t1.llama(t2, 40);
        System.out.println(t1.getTiempoConversacion());
        System.out.println(t2.getTiempoConversacion());
    }
}