public class App {
    public static void main(String[] args) throws Exception {
        Caballo pegasso = new Caballo();
        Caballo epona = new Caballo(Sexo.HEMBRA);

        System.out.println("##### PEGASSO #####");
        pegasso.getSexo();
        System.out.println(pegasso.getNumPatas());;
        System.out.println("\n##### EPONA #####");
        epona.getSexo();
        System.out.println(epona.getNumPatas());
    }
}