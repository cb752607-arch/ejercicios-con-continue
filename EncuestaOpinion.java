import java.util.*;

public class EncuestaOpinion {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        encuestaOpinion();
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

private static void encuestaOpinion() {
        int n = leerInt("Cantidad de respuestas: ");
        int[] frecuencia = new int[6]; int total = 0, suma = 0;
        for (int i = 1; i <= n; i++) {
            int r = leerInt("Respuesta " + i + " (1 a 5): ");
            if (r < 1 || r > 5) { System.out.println("Respuesta fuera de rango ignorada."); continue; }
            frecuencia[r]++; total++; suma += r;
        }
        System.out.println("Frecuencia de respuestas:");
        for (int i = 1; i <= 5; i++) System.out.println(i + ": " + frecuencia[i]);
        if (total > 0) System.out.printf("Promedio: %.2f%n", (double) suma / total);
        else System.out.println("No hay respuestas válidas.");
    }
}
