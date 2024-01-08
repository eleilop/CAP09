public class App {
    public static void menu() {
        System.out.println("\nVEHÍCULOS");
        System.out.println("=========");
        System.out.println("1. Anda con la bicicleta");
        System.out.println("2. Haz el caballito con la bicicleta");
        System.out.println("3. Anda con el coche");
        System.out.println("4. Quema rueda con el coche");
        System.out.println("5. Ver kilometraje de la bicicleta");
        System.out.println("6. Ver kilometraje del coche");
        System.out.println("7. Ver kilometraje total");
        System.out.println("8. Salir");
    }
    public static void main(String[] args) throws Exception {
        Bicicleta bici = new Bicicleta();
        Coche coche = new Coche();
        int opcion = 0;

        do {
            menu();
            System.out.print("\nElige una opción (1-8): ");
            opcion = Integer.parseInt(System.console().readLine());
            switch (opcion) {
                case 1:
                    System.out.print("Introduce los km a recorrer: ");
                    bici.anda(Integer.parseInt(System.console().readLine()));
                    break;
            
                case 2:
                    bici.caballito();
                    break;
            
                case 3:
                    System.out.print("Introduce los km a recorrer: ");
                    coche.anda(Integer.parseInt(System.console().readLine()));
                    break;
            
                case 4:
                    coche.quemaRueda();
                    break;
            
                case 5:
                    System.out.printf("Km recorridos con la bicicleta: %d km%n", bici.getKmBicicleta());;
                    break;
            
                case 6:
                    System.out.printf("Km recorridos con el coche: %d km%n", coche.getKmCoche());;
                    break;
            
                case 7:
                    System.out.printf("Kilometros totales: %d km%n", Vehiculo.getKmTotales());;
                    break;
            
                case 8:
                    System.out.println("Gracias por usar el programa!!");
                    break;
            
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opcion!=8);
    }
}