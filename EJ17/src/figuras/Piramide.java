package figuras;

public class Piramide {
    private static int piramidesCreadas;

    private int altura;

    public Piramide(int altura) {
        this.altura=altura;
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String salida = "";
        for(int i=0; i<altura;i++) {
            for(int j=0;j<altura-i;j++) {
                salida += " ";
            }
            for(int j=0;j<2*i+1;j++) {
                salida += "*";
            }
            salida += "\n";
        }
        return salida;
    }
}
