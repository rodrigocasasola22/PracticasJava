
public class Main {

    public static void main(String[] args) {

        // Codigo con break
        String[] carros = {"Nissan", "Toyota", "BMW", "Audi", "Honda"};

        for (int i = 0; i < carros.length; i++) {

            System.out.println("Carro: " + carros[i]);

            if (carros[i].equals("BMW")) {
                System.out.println("Se encontro el BMW.");
                System.out.println("El ciclo se detendra con break.");
                break;
            }
        }

        System.out.println("----------------------");

        // Codigo con continue
        String[] carros2 = {"Nissan", "Toyota", "BMW", "Audi", "Honda"};

        for (int i = 0; i < carros2.length; i++) {

            if (carros2[i].equals("BMW")) {
                System.out.println("El BMW sera omitido.");
                continue;
            }

            System.out.println("Carro: " + carros2[i]);
        }

        System.out.println("Fin del programa.");
    }
}
