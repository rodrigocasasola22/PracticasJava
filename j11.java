
public class Main {

    public static void main(String[] args) {
        int velocidad = 120;

        // Evaluamos la velocidad

        if (velocidad >= 120) {
            System.out.println("Velocidad muy alta");

        } else if (velocidad >= 90) {
            System.out.println("Velocidad alta");

        } else if (velocidad >= 60) {
            System.out.println("Velocidad moderada");

        } else {
            System.out.println("Velocidad baja");
        }

        // Mensaje final
        System.out.println("Fin del programa.");

    }
}
