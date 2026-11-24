import java.util.*;

public class RegistroPagos {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        registroPagos();
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

private static void registroPagos() {
        int n = leerInt("Cantidad de pagos: ");
        Set<Double> unicos = new LinkedHashSet<>();
        double total = 0;
        for (int i = 1; i <= n; i++) {
            double pago = leerDouble("Pago " + i + ": S/ ");
            if (unicos.contains(pago)) { System.out.println("Pago repetido ignorado."); continue; }
            unicos.add(pago); total += pago;
        }
        System.out.printf("Total acumulado: S/ %.2f%nCantidad de pagos únicos: %d%n", total, unicos.size());
    }
}
