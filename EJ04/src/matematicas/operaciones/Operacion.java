package matematicas.operaciones;

public class Operacion {
    public static int min(int v1, int v2) {
        return Math.min(v1, v2);
    }

    private static int _mcd(int v1, int v2, int maxcmomdiv) {
        int minimo = min(v1, v2);
        int ret = maxcmomdiv;
        for (int i = 2; i<=minimo; i++){
            if (v1%i==0 && v2%i==0) {
                v1/=i;
                v2/=i;
                ret*=i;
                _mcd(v1, v2, ret);
                ret = _mcd(v1, v2, ret);
            }
        }
        return 0;
    }

    public static int mcd(int v1, int v2) {
        return _mcd(v1, v2, 1);
    }
}