import java.util.*;

public class ControlVentas {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        controlVentas();
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

private static void controlVentas() {
        int n = leerInt("Cantidad de ventas a registrar: ");
        double total = 0; int validas = 0;
        for (int i = 1; i <= n; i++) {
            double venta = leerDouble("Venta " + i + ": S/ ");
            if (venta < 0) { System.out.println("Venta negativa ignorada."); continue; }
            total += venta; validas++;
        }
        System.out.printf("Total vendido: S/ %.2f%nVentas válidas: %d%n", total, validas);
    }
}
