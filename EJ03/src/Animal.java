public abstract class Animal {
    public abstract int getNumPatas();

    public void come() {
        System.out.println("Dame algo de comer");
    }

    public abstract void come(String comida);

    public void duerme() {
        System.out.println("zzzZZZZZZ");
    }
}