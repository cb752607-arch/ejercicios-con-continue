import java.util.*;

public class RegistroMeteorologico {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        registroMeteorologico();
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

private static void registroMeteorologico() {
        int n = leerInt("Cantidad de registros de lluvia: ");
        double suma = 0; int validos = 0;
        for (int i = 1; i <= n; i++) {
            double lluvia = leerDouble("Lluvia del registro " + i + " (mm): ");
            if (lluvia < 0) { System.out.println("Registro negativo ignorado."); continue; }
            suma += lluvia; validos++;
        }
        System.out.printf("Precipitación acumulada: %.2f mm%n", suma);
        if (validos > 0) System.out.printf("Promedio: %.2f mm%n", suma / validos);
        else System.out.println("No hay registros válidos para el promedio.");
    }
}
