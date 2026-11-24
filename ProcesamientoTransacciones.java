import java.util.*;

public class ProcesamientoTransacciones {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        procesamientoTransacciones();
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

private static void procesamientoTransacciones() {
        int n = leerInt("Cantidad de transacciones: ");
        double total = 0; int validas = 0;
        for (int i = 1; i <= n; i++) {
            double monto = leerDouble("Transacción " + i + ": S/ ");
            if (monto < 10) { System.out.println("Monto menor a S/10 ignorado."); continue; }
            total += monto; validas++;
        }
        System.out.printf("Total procesado: S/ %.2f%nCantidad de transacciones válidas: %d%n", total, validas);
    }
}
