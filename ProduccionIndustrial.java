import java.util.*;

public class ProduccionIndustrial {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        produccionIndustrial();
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

private static void produccionIndustrial() {
        int n = leerInt("Cantidad de días: ");
        int suma = 0, diasValidos = 0;
        for (int i = 1; i <= n; i++) {
            int produccion = leerInt("Producción del día " + i + ": ");
            if (produccion == 0) { System.out.println("Día sin producción ignorado."); continue; }
            if (produccion < 0) { System.out.println("Valor negativo ignorado."); continue; }
            suma += produccion; diasValidos++;
        }
        System.out.println("Producción acumulada: " + suma);
        if (diasValidos > 0) System.out.printf("Promedio diario: %.2f%n", (double) suma / diasValidos);
        else System.out.println("No hubo días válidos.");
    }
}
