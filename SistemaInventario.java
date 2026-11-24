import java.util.*;

public class SistemaInventario {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sistemaInventario();
    }

private static int leerInt(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String s = sc.nextLine().trim();
            try { return Integer.parseInt(s); }
            catch (NumberFormatException e) { System.out.println("Ingresa un número entero válido."); }
        }
    }

private static double leerDouble(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String s = sc.nextLine().trim().replace(',', '.');
            try { return Double.parseDouble(s); }
            catch (NumberFormatException e) { System.out.println("Ingresa un número válido."); }
        }
    }

private static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }

private static void sistemaInventario() {
        int n = leerInt("Cantidad de productos: ");
        int disponibles = 0;
        for (int i = 1; i <= n; i++) {
            String producto = leerTexto("Nombre del producto " + i + ": ");
            int stock = leerInt("Stock de " + producto + ": ");
            if (stock == 0) { System.out.println("Producto sin stock ignorado."); continue; }
            if (stock > 0) disponibles++;
        }
        System.out.println("Total de productos disponibles: " + disponibles);
    }
}
