import discos.Coleccion;
import discos.Disco;

public class App {
    public static void menu() {
        System.out.println("----------- DISCOS -----------");
        System.out.println("1. Listar");
        System.out.println("2. Añadir");
        System.out.println("3. Modificar");
        System.out.println("4. Eliminar");
        System.out.println("5. Salir");
        System.out.println("------------------------------");
    }

    public static int leerOpcion() {
        int opcion = 0;
        do {
            System.out.print("Introduce una opción: ");
            opcion = Integer.parseInt(System.console().readLine());
        } while (opcion<1 && opcion>5);
        return opcion;
    }

    public static void main(String[] args) throws Exception {
        int opcion = 0;
        Coleccion coleccion = new Coleccion();
        do {
            menu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    coleccion.listaDiscos();
                    break;
                case 2:{
                    System.out.print("Introduce el nombre: ");
                    String nombre = System.console().readLine();
                    System.out.print("Introduce el autor: ");
                    String autor = System.console().readLine();
                    System.out.print("Introduce el genero: ");
                    String genero = System.console().readLine();
                    System.out.print("Introduce la duracion: ");
                    int duracion = Integer.parseInt(System.console().readLine());
                    
                    Disco disco = new Disco(nombre, autor, genero, duracion);
                    System.out.println(coleccion.anadeDisco(disco));;
                    break;
                }
                case 3:{
                    System.out.print("Introduce el código del disco a actualizar: ");
                    String codigo = System.console().readLine();
                    System.out.print("Introduce el nombre: ");
                    String nombre = System.console().readLine();
                    System.out.print("Introduce el autor: ");
                    String autor = System.console().readLine();
                    System.out.print("Introduce el genero: ");
                    String genero = System.console().readLine();
                    System.out.print("Introduce la duracion: ");
                    int duracion = Integer.parseInt(System.console().readLine());
                    
                    System.out.println(coleccion.actualizaDisco(codigo, nombre, autor, genero, duracion));
                    break;
                }
                case 4:
                    System.out.print("Introduce el código del disco a eliminar: ");
                    coleccion.eliminaDisco(System.console().readLine());
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    break;
            }
        } while (opcion!=5);
    }
}