public class Coche {

    private int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void aumentarPuertas(int cantidad){
        numeroPuertas+=cantidad;
    }
}
