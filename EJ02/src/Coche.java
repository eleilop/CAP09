public class Coche extends Vehiculo {
    /**
     * Hace que el coche recorra X Km.
     * 
     * @param km Número de km a recorrer.
     */
    public void anda(int km) {
        System.out.printf("El choche anda %d km%n", km);
        kilometrosTotales += km;
        kilometrosRecorridos += km;
    }

    /**
     * Quema rueda con el coche.
     */
    public void quemaRueda() {
        System.out.println("BRUMMMMM!!! BRUMMMM!!!");
    }

    /**
     * Muestra los Km Recorridos con el coche.
     * @return Km Recorridos con el coche.
     */
    public int getKmCoche() {
        return kilometrosRecorridos;
    }
}