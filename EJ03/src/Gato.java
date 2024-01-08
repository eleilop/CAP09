public class Gato extends Mamifero {
    @Override
    public int getNumPatas() {
        return 4;
    }

    @Override
    public void come(String comida) {
        if (comida.equals("pescado") || (comida.equals("pescados")))
            System.out.println("Qué rico, me encanta el pescado");
        else
            System.out.println("Solo me gusta el pescado");
    }

    public void maulla() {
        System.out.println("Miauuuuuu");
    }
}
