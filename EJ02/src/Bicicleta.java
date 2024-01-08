public class Bicicleta extends Vehiculo {
    /**
     * Hace que la bicicleta recorra X Km.
     * 
     * @param km Número de km a recorrer.
     */
    public void anda(int km) {
        System.out.printf("La bicicleta anda %d km%n", km);
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }

    /**
     * Hace el caballito con la bicicleta.
     */
    public void caballito() {
        System.out.println("YIIIIHAAAAAAAA!!!");
    }

    /**
     * Muestra los Km Recorridos con la bicicleta.
     * @return Km Recorridos con la bicicleta.
     */
    public int getKmBicicleta() {
        return kilometrosRecorridos;
    }
}