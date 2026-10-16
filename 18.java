/*
ArrayList forma parte de java.util, por lo que requiere la instrucción
import java.util.ArrayList;
al inicio del archivo.
 */
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista dinámica de cadenas (String)
        ArrayList<String> carros = new ArrayList<>();

        /* Los elementos se añaden dinámicamente sin definir un
        límite previo. */
        // 1. Agregar elementos (se van acumulando en orden)
        carros.add("BMW");
        carros.add("MAZDA");
        carros.add("HONDA");
        carros.add("AUDI");
        System.out.println("Lista inicial: " + carros);
        // 2. Eliminar un elemento por índice o por valor
        carros.remove("");

        // 3. Consultar y verificar
        System.out.println("\nLista después de eliminar: " + carros);
        System.out.println("¿Haycarros NISSAN?: " + carros.contains("NISSAN"));
        System.out.println("Elemento en posición 0: " + carros.get(0));

        System.out.println ("--------------------------------------");

        String[] marcas = {"BMW","MAZDA","HONDA","AUDI"};
System.out.println("Lista de marcas de carros");
System.out.println("---------------------");
for (int i = 0; i < marcas.length; i++) {
System.out.println(marcas[i]);
    }
System.out.println("Total de carros: " + marcas.length);
    System.out.println("Primera marca: "+ marcas[0]);
    boolean encontrado= false;
    for (int j = 0; j < marcas.length; j++) {
    if (marcas [j].equals("BMW")){
        encontrado= true;
    }
    }
    System.out.println ("Hay un BMW?:"+ encontrado);

    }}


