import java.util.*;

public class MostrarVocales {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarVocales();
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

private static void mostrarVocales() {
        String palabra = leerTexto("Ingresa una palabra: ").toLowerCase(Locale.ROOT);
        StringBuilder vocales = new StringBuilder();
        for (char c : palabra.toCharArray()) {
            if ("aeiouáéíóú".indexOf(c) < 0) continue;
            vocales.append(c).append(' ');
        }
        System.out.println("Vocales encontradas: " + (vocales.length() == 0 ? "Ninguna" : vocales));
    }
}
