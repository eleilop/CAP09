import articulos.Almacen;
import articulos.Producto;

public class App {
    public static void menu() {
        System.out.println("\n1. Listado");
        System.out.println("2. Alta");
        System.out.println("3. Baja");
        System.out.println("4. Modificación");
        System.out.println("5. Salir");
    }

    public static int leerOpcion() {
        System.out.print("Introduce una opción: ");
        return Integer.parseInt(System.console().readLine());
    }
    public static void main(String[] args) throws Exception {
        Almacen almacen = new Almacen();
        int opcion = 0;
        do {
            menu();
            opcion = leerOpcion();
            switch (opcion) {
                case 1:
                    almacen.listaProductos();
                    break;
                case 2:{
                    System.out.print("\nIntroduce una descripción: ");
                    String descripcion = System.console().readLine();
                    System.out.print("Introduce un precio de compra: ");
                    Double precioCompra = Double.parseDouble(System.console().readLine());
                    System.out.print("Introduce un precio de venta: ");
                    Double precioVenta = Double.parseDouble(System.console().readLine());
                    Producto producto = new Producto(descripcion, precioCompra, precioVenta);
                    almacen.altaProducto(producto);
                    break;
                }
                case 3:
                    System.out.print("\nIntroduce el código del producto: ");
                    almacen.bajaProducto(System.console().readLine());
                    break;
                case 4:{
                    System.out.print("Introduce el código del producto: ");
                    String codigo = System.console().readLine();
                    System.out.print("Introduce una descripción: ");
                    String descripcion = System.console().readLine();
                    System.out.print("Introduce un precio de compra: ");
                    Double precioCompra = Double.parseDouble(System.console().readLine());
                    System.out.print("Introduce un precio de venta: ");
                    Double precioVenta = Double.parseDouble(System.console().readLine());
                    almacen.modificaProducto(codigo, descripcion, precioCompra, precioVenta);
                    break;
                }
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    break;
            }
        } while (opcion!=5);
    }
}