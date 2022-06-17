public class Main {

    public static int suma(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println("******* Funciones ********");
        System.out.println("Función que suma tres numeros");
        var a = 5;
        var b = 6;
        var c = 7;
        System.out.println("El resultado de la suma de "+ a +" con "+b+" y con "+c+" es: "+suma(a,b,c));

        System.out.println("******* Clases ********");
        Coche miCoche = new Coche(1);
        System.out.println("Antes de aumentar puertas tiene: "+miCoche.getNumeroPuertas()+" Puertas");
        miCoche.aumentarPuertas(2);
        System.out.println("Despues de aumentar puertas tiene: "+miCoche.getNumeroPuertas());
    }
}