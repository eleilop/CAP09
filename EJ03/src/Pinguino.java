public class Pinguino extends Ave {
    @Override
    public int getNumPatas() {
        return 2;
    }

    @Override
    public void vuela() {
        System.out.println("No puedo volar...");
    }

    @Override
    public void come(String comida) {
        if (comida.equals("pescado") || (comida.equals("pescados")))
            System.out.println("Qué rico, me encanta el pescado");
        else
            System.out.println("Solo me gusta el pescado");
    }

    @Override
    public void pia() {
        System.out.println("KAKAAAA KAKAAAAA");
    }
}