public class App {
    public static void main(String[] args) throws Exception {
        Canario canario = new Canario();
        Gato gato = new Gato();
        Lagarto lagarto = new Lagarto();
        Perro perro = new Perro();
        Pinguino pinguino = new Pinguino();

        System.out.println("\n########## CANARIO ##########");
        System.out.printf("El canario tiene %d patas%n", canario.getNumPatas());
        canario.come();
        canario.come("piedra");
        canario.come("semillas");
        canario.duerme();
        canario.vuela();
        canario.pia();

        System.out.println("\n########## GATO ##########");
        System.out.printf("El gato tiene %d patas%n", gato.getNumPatas());
        gato.come();
        gato.come("piedra");
        gato.come("pescado");
        gato.duerme();
        gato.darPata();
        gato.maulla();

        System.out.println("\n########## LAGARTO ##########");
        System.out.printf("El lagarto tiene %d patas%n", lagarto.getNumPatas());
        lagarto.come();
        lagarto.come("piedra");
        lagarto.come("insecto");
        lagarto.duerme();

        System.out.println("\n########## PERRO ##########");
        System.out.printf("El perro tiene %d patas%n", perro.getNumPatas());
        perro.come();
        perro.come("piedra");
        perro.come("pienso");
        perro.duerme();
        perro.darPata();
        perro.ladra();

        System.out.println("\n########## PINGUINO ##########");
        System.out.printf("El pinguino tiene %d patas%n", pinguino.getNumPatas());
        pinguino.come();
        pinguino.come("piedra");
        pinguino.come("pescado");
        pinguino.duerme();
        pinguino.vuela();
        pinguino.pia();
    }
}