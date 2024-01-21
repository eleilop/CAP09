import gatos.Gato;
import sexos.Sexo;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadGatos = 4;
        Gato[] arrayGatos = new Gato[cantidadGatos];

        for(int i=1;i<=cantidadGatos;i++) {
            System.out.printf("GATO %d%n", i);
            System.out.print("Introduce el nombre: ");
            String nombre = System.console().readLine();
            System.out.print("Introduce el sexo (MACHO/HEMBRA): ");
            String sexo = System.console().readLine();

            arrayGatos[i-1] = new Gato(nombre, sexo.equals("MACHO")?Sexo.MACHO:Sexo.HEMBRA);
            System.out.println();
        }
        
        for(int i=1;i<=cantidadGatos;i++) {
            System.out.printf("GATO %d%n", i);
            System.out.printf("Nombre: %s%n", arrayGatos[i-1].getNombre());
            System.out.printf("Sexo: %s%n%n", arrayGatos[i-1].getSexo());
        }
    }
}