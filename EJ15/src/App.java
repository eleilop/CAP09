import domino.FichaDomino;

public class App {
    public static void main(String[] args) throws Exception {
        FichaDomino fichaAnt = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
        System.out.println(fichaAnt);

        for(int i=1;i<=7;i++) {
            boolean encaja = false;
            FichaDomino fichaSig = null;
            
            while (!encaja) {
                fichaSig = new FichaDomino((int)(Math.random()*7), (int)(Math.random()*7));
                encaja = fichaAnt.encajaSinVoltear(fichaSig);
            }
            System.out.println(fichaSig);
        }
    }
}