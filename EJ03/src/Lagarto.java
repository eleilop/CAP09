public class Lagarto extends Animal {
    @Override
    public int getNumPatas() {
        return 4;
    }

    @Override
    public void come(String comida) {
        if (comida.equals("insecto") || (comida.equals("insectos")))
            System.out.println("Qué rico, me encantan los insectos");
        else
            System.out.println("Solo me gustan los insectos");
    }
}