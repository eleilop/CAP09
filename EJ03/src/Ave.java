public abstract class Ave extends Animal {
    @Override
    public void come(String comida) {
        if (comida.equals("semilla") || (comida.equals("semillas")))
            System.out.println("Qué rico, me encantan las semillas");
        else
            System.out.println("Solo me gustan las semillas");
    }

    public void vuela() {
        System.out.println("Me encanta surcar los cielos!!");
    }

    public void pia() {
        System.out.println("Pio pio, pio pio");
    }
}