import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> carros = new ArrayList<>();

        System.out.println("=== 1. METODO .add() ===");

        carros.add("BMW");
        carros.add("Nissan");
        carros.add("Toyota");


        carros.add(1, "Audi");

        System.out.println("Lista actual: " + carros);


        System.out.println("\n=== 2. METODO .get() ===");

        String primerCarro = carros.get(0);
        String segundoCarro = carros.get(1);

        System.out.println("Carro en la posicion 0: " + primerCarro);
        System.out.println("Carro en la posicion 1: " + segundoCarro);


        System.out.println("\n=== 3. METODO .set() ===");


        carros.set(1, "Mercedes");

        System.out.println("Lista tras modificar: " + carros);


        System.out.println("\n=== 4. METODO .remove() ===");


        carros.remove(0);

        System.out.println("Despues de eliminar la posicion 0: " + carros);

        
        carros.remove("Toyota");

        System.out.println("Despues de eliminar Toyota: " + carros);


        System.out.println("\n=== ESTADO FINAL ===");

        System.out.println("Total de carros restantes: " + carros.size());
        System.out.println("Contenido final: " + carros);
    }
}
