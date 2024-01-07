public class Caballo {
    private int numpatas = 4;
    private Sexo sexo;

    public Caballo(Sexo s) {
        this.sexo = s;
    }

    public Caballo() {
        this.sexo = Sexo.MACHO;
    }

    public int getNumPatas() {
        return this.numpatas;
    }

    public void getSexo() {
        if (this.sexo==Sexo.MACHO)
            System.out.println("Soy un caballo");
        else
            System.out.println("Soy una yegua");
    }
}