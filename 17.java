public class Main{
    public static void main(String[] args) {
        double[] precios = {17,21,22,33,35,77,73,37};
        double total = 0;
        System.out.println("--- Lista de precios ---");
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Producto " + i + ": $" + precios[i]);
            total += precios[i];
        }
        double promedio = total / precios.length;
        System.out.println("\nTotal: $" + total);
        System.out.println("Promedio por producto: $" +  promedio);
    }
}

