public class Main {

    public static void main(String[] args) {

        // 1. Crear un arreglo de enteros con espacio para 3 elementos
        int[] precios = new int[3];

        // 2. Asignar valores usando sus indices (0, 1, 2)
        precios[0] = 85000;
        precios[1] = 92000;
        precios[2] = 78000;

        // 3. Modificar un valor existente
        precios[0] = 90000;

        // 4. Imprimir la longitud del arreglo y un valor concreto
        System.out.println("Tamaño del arreglo: " + precios.length);
        System.out.println("Precio del BMW: " + precios[0]);
        System.out.println("Precio del Nissan: " + precios[1]);
    }
}


// El Array con double tambien lo hicimos hoy 14/10/26