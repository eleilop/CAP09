package figuras;

public class Rectangulo {
    private static int rectangulosCreados;

    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String salida = "";
        for(int i=0; i<altura;i++) {
            for(int j=0;j<base;j++) {
                salida+="* ";
            }
            salida += "\n";
        }
        return salida;
    }
}