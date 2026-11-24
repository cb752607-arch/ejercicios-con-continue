import java.util.*;

public class EvaluacionExamenes {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        evaluacionExamenes();
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

private static void evaluacionExamenes() {
        int n = leerInt("Cantidad de preguntas: ");
        int respondidas = 0, correctas = 0;
        for (int i = 1; i <= n; i++) {
            String r = leerTexto("Pregunta " + i + " - respuesta (C=correcta, I=incorrecta, ENTER=sin responder): ");
            if (r.isEmpty()) { System.out.println("Pregunta sin responder, ignorada."); continue; }
            if (r.equalsIgnoreCase("C")) { respondidas++; correctas++; }
            else if (r.equalsIgnoreCase("I")) respondidas++;
            else { System.out.println("Respuesta no válida, ignorada."); continue; }
        }
        System.out.println("Número de respuestas válidas: " + respondidas);
        if (respondidas > 0) System.out.printf("Porcentaje de aciertos: %.2f%%%n", 100.0 * correctas / respondidas);
        else System.out.println("No hay respuestas válidas.");
    }
}
