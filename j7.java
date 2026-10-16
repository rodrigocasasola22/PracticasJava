public class Main {

    public static void main(String[] args) {

        System.out.println("----------------------");
        System.out.println("Imprimira los carros mientras el contador sea menor o igual a 5.");
        System.out.println("----------------------");

        String[] carros = {"BMW", "Nissan", "Toyota", "Audi", "Honda"};

        int contador = 1;

        do {
            System.out.println("Carro: " + carros[contador - 1]);
            contador++;
        } while (contador <= 5);

        System.out.println("Ciclo terminado.");
        System.out.println("----------------------");
    }
}
