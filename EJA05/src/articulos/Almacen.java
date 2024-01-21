package articulos;

public class Almacen {
    // Atributo de instancia
    private Producto[] productos;


    // Constructor
    public Almacen() {
        productos = new Producto[100];
    }


    // Funciones MENÚ
    public void listaProductos() {
        for(int i=0;i<productos.length;i++) {
            if (productos[i]!=null)
                productos[i].toString();
        }
    }

    public void altaProducto(Producto producto) {
        for(int i=0;i<productos.length;i++) {
            if (productos[i]!=null)
                productos[i]=producto;
        }
    }

    public void bajaProducto(String codigo) {
        for(int i=0; i<=productos.length;i++) {
            if(codigo==productos[i].getCodigo()) {
                productos[i] = null;
            }
        }
    }

    public void modificaProducto(String codigo, String descripcion, double precioCompra, double precioVenta) {
        for(int i=0; i<=productos.length;i++) {
            if(codigo==productos[i].getCodigo()) {
                if(!descripcion.equals(""))
                    productos[i].setDescripcion(descripcion);
                if(precioCompra<=0)
                    productos[i].setPrecioCompra(precioCompra);
                if(precioVenta<=0)
                    productos[i].setPrecioVenta(precioVenta);
            }
        }
    }
}