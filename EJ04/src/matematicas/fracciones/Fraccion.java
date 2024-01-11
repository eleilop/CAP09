package matematicas.fracciones;
import matematicas.operaciones.Operacion;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int num, int den) {
        this.numerador=num;
        this.denominador=den;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador+"/"+denominador;
    }

    public void invierte() {
        int aux = denominador;
        denominador = numerador;
        numerador = aux;
    }

    public Fraccion simplifica() {
        int mcd = Operacion.mcd(numerador, denominador);
        this.numerador/=mcd;
        this.denominador/=mcd;
        return this;
    }

    public Fraccion multiplica(Fraccion f) {
        this.numerador *= f.numerador;
        this.denominador *= f.denominador;
        return this;
    }

    public Fraccion divide(Fraccion f) {
        this.numerador*=denominador;
        this.denominador*=numerador;
        return this;
    }
}