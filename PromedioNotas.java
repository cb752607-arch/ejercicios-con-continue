import java.util.*;

public class PromedioNotas {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        promedioNotas();
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

private static void promedioNotas() {
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        int validas = 0;
        for (int i = 1; i <= 5; i++) {
            double nota = leerDouble("Nota " + i + ": ");
            if (nota < 0 || nota > 20) {
                System.out.println("Nota fuera del rango. Se ignora.");
                continue;
            }
            suma += nota; validas++;
            max = Math.max(max, nota); min = Math.min(min, nota);
        }
        if (validas == 0) System.out.println("No se ingresaron notas válidas.");
        else {
            System.out.printf("Promedio: %.2f%nNota máxima: %.2f%nNota mínima: %.2f%n",
                    suma / validas, max, min);
        }
    }
}
