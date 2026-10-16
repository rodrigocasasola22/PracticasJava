
public class Main {

    public static void main(String[] args) {

        int carro = 2;

        switch (carro) {
            case 1: // cuando carro sea igual a 1
                System.out.println("BMW");
                break;

            case 2: // cuando carro sea igual a 2
                System.out.println("Mercedes-Benz");
                break;

            case 3: // cuando carro sea igual a 3
                System.out.println("Audi");
                break;

            default: // cualquier otro caso
                System.out.println("Carro no válido");
        }

        System.out.println("\n-----------\n");

    }
}
