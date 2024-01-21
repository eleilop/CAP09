package tarjetasregalo;

public class TarjetaRegalo {
    private String numero;
    private double fondo;

    public TarjetaRegalo(double fondoInicial) {
        this.fondo = fondoInicial;
        this.numero = "";
        for (int i=1; i<=5; i++) {
            this.numero += (int)(Math.random()*10);
        }
    }

    public void gasta(float importe) throws NotEnoughFundException {
        if (importe>fondo)
            throw new NotEnoughFundException(importe);
        this.fondo -= importe;
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo t) {
        TarjetaRegalo ret = new TarjetaRegalo(this.fondo + t.fondo);
        this.fondo = 0;
        fondo = 0;
        return ret;
    }

    @Override
    public String toString() {
        return String.format("Tarjeta nº %s - Saldo %.2f", this.numero, this.fondo);
    }
}