package articulos;
import uuids.MyUuid;

public class Producto {
    // Atributos de clase
    private static int stock;

    // Atributos de instancia
    private String codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;


    // Constructor
    public Producto(String descripcion, double precioCompra, double precioVenta) {
        this.codigo = MyUuid.getUuid(6);
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        stock++;
    }


    // Funciones GET
    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public static int getStock() {
        return stock;
    }

    // Funciones SET
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public static void setStock(int stock) {
        Producto.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("Código: %s%nDescripción: %s%nPrecio compra: %.2f%nPrecio venta: %.2f%n", getCodigo(), getDescripcion(), getPrecioCompra(), getPrecioVenta());
    }
}