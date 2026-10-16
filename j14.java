
public class Main {
    public static void main(String[] args) {

        // Declaramos un arreglo de carros
        String[] carros = {"BMW", "Nissan", "Toyota", "Audi", "Honda"};

        System.out.println("Con For Each");
        System.out.println("----------------------------");

        // Recorremos automáticamente los carros
        for (String carro : carros) {
            System.out.println("Carro: " + carro);
        }

        System.out.println("----------------------------");
        System.out.println("Con For tradicional");

        // Recorremos los carros utilizando indices
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Carro: " + carros[i]);
        }

        System.out.println("----------------------------");

        // Mensaje final
        System.out.println("Fin del programa.");
        System.out.println("----------------------------");

    }
}
