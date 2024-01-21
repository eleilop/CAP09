package utilidades;

public class NumeroAleatorio {
    public static String obtenNumero(int digitos) {
        String numero = ""+(int)(Math.random()*digitos);
        return numero;
    }
}
