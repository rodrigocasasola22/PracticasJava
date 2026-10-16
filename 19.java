import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
        ArrayList<Integer> piezasDulces = new ArrayList<>();

        piezasDulces.add(12);
        piezasDulces.add(5);
        piezasDulces.add(20);
        piezasDulces.add(8);

        System.out.println("--- Registro de piezas de bolsas de dulces  ---");
        for (Integer piezas : piezasDulces) {
            if (piezas >= 10) {
                System.out.println("Bolsa con " + piezas + " piezas: Es una bolsa grande");
            } else {
                System.out.println("Bolsa con " + piezas + " piezas: Es una bolsa pequeña");
            }
        }
    }
}

