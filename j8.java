
/*
                 switch-case

El switch-case es una estructura de control en Java que te
permite tomar decisiones múltiples basadas en el valor de una
única variable o expresión.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 12: ");
        int mes = scanner.nextInt();

        String nombreMes;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                System.out.println("---------------");
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("---->");
                nombreMes = "Número inválido (debe ser 1-12)";
                System.out.println("---->");
                break;
        }

        System.out.println("El mes es: " + nombreMes);
        scanner.close();
    }
}
