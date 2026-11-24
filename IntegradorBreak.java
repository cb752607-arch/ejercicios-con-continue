import java.util.*;

public class IntegradorBreak {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        integradorBreak();
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

private static void integradorBreak() {
        int n = 200, cantidad = 0, aprobados = 0, desaprobados = 0;
        double suma = 0, max = Double.NEGATIVE_INFINITY, min = Double.POSITIVE_INFINITY;
        System.out.println("Se registrarán hasta 200 notas. Si ingresas 20, termina el registro.");
        for (int i = 1; i <= n; i++) {
            double nota = leerDouble("Nota " + i + ": ");
            if (nota < 0 || nota > 20) { System.out.println("Nota inválida, no se cuenta."); continue; }
            cantidad++; suma += nota; max = Math.max(max, nota); min = Math.min(min, nota);
            if (nota >= 11) aprobados++; else desaprobados++;
            if (nota == 20) { System.out.println("Se ingresó 20. Finalizando con break."); break; }
        }
        System.out.println("Cantidad de notas válidas: " + cantidad);
        if (cantidad > 0) {
            System.out.printf("Promedio: %.2f%nNota máxima: %.2f%nNota mínima: %.2f%n", suma/cantidad, max, min);
            System.out.println("Aprobados: " + aprobados + "\nDesaprobados: " + desaprobados);
        } else System.out.println("No hay notas válidas.");
    }
}
