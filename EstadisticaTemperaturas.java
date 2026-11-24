import java.util.*;

public class EstadisticaTemperaturas {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        estadisticaTemperaturas();
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

private static void estadisticaTemperaturas() {
        int n = leerInt("Cantidad de temperaturas: ");
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        int validas = 0;
        for (int i = 1; i <= n; i++) {
            double t = leerDouble("Temperatura " + i + " (°C): ");
            if (t < -10 || t > 50) { System.out.println("Temperatura ignorada."); continue; }
            suma += t; validas++; max = Math.max(max, t); min = Math.min(min, t);
        }
        if (validas == 0) System.out.println("No hay temperaturas válidas.");
        else System.out.printf("Promedio: %.2f °C%nMáxima: %.2f °C%nMínima: %.2f °C%n",
                suma / validas, max, min);
    }
}
