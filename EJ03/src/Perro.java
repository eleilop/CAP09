public class Perro extends Mamifero {
    @Override
    public int getNumPatas() {
        return 4;
    }

    @Override
    public void come(String comida) {
        if (comida.equals("pienso"))
            System.out.println("Qué rico, me encanta el pienso");
        else
            System.out.println("Solo me gusta el pienso");
    }

    public void ladra() {
        System.out.println("Wofff wofff");
    }
}