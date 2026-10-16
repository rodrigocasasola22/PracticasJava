
/*
Simula un robot controlado por texto que recibe órdenes escritas por el usuario
y responde con acciones específicas.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String comando;

        System.out.println("Robot activado. Comandos disponibles:");
        System.out.println("avanzar, retroceder, girar, saltar, estado, salir");

        while (true) {
            System.out.print("\nIngresa un comando: ");
            comando = scanner.nextLine().toLowerCase();

            switch (comando) {
                case "avanzar":
                    System.out.println("El robot avanza 2 metros.");
                    break;

                case "retroceder":
                    System.out.println("El robot retrocede 1 metro.");
                    break;

                case "girar":
                    System.out.println("El robot gira 90 grados a la derecha.");
                    break;

                case "saltar":
                    System.out.println("El robot salta 0.5 metros.");
                    break;

                case "estado":
                    System.out.println("Batería al 85% | Modo: Automático");
                    break;

                case "salir":
                    System.out.println("Apagando robot... ¡Hasta luego!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Comando no reconocido.");
                    break;
            }
        }
    }
}
