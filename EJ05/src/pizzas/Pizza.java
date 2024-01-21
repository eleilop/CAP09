package pizzas;

public class Pizza {
    // ATRIBUTOS DE CLASE
    public static int TotalPedidas;
    public static int TotalServidas;

    // ATRIBUTOS DE INSTANCIA
    private String tipo;
    private String size;
    private String estado;

    public Pizza(String tipo, String size) {
        this.tipo = tipo;
        this.size = size;
        this.estado = "pedida";
        TotalPedidas++;
    }

    // FUNCIONES
    public void sirve() {
        if(estado.equals("pedida")) {
            estado = "servida";
            TotalServidas++;
        }
        else
            System.out.println("esa pizza ya se ha servido");
    }

    public static int getTotalPedidas() {
        return TotalPedidas;
    }

    public static int getTotalServidas() {
        return TotalServidas;
    }

    @Override
    public String toString() {
        return String.format("pizza %s %s, %s", tipo, size, estado);
    }
}