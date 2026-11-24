import java.util.*;

public class IntegradorContinue {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        integradorContinue();
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

private static void integradorContinue() {
        int cantidad = 5, validas = 0, invalidas = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        System.out.println("Se registrarán 200 notas. Se ignoran notas menores que 0 o mayores que 20.");
        for (int i = 1; i <= cantidad; i++) {
            double nota = leerDouble("Nota " + i + ": ");
            if (nota < 0 || nota > 20) { invalidas++; continue; }
            validas++; suma += nota; max = Math.max(max, nota); min = Math.min(min, nota);
        }
        if (validas > 0) {
            System.out.printf("Promedio: %.2f%nNota máxima: %.2f%nNota mínima: %.2f%n", suma/validas, max, min);
        } else System.out.println("No se ingresaron notas válidas.");
        System.out.println("Cantidad de notas válidas: " + validas);
        System.out.println("Cantidad de notas inválidas: " + invalidas);
    }
}
