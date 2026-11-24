import java.util.*;

public class PalabrasValidas {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        palabrasValidas();
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

private static void palabrasValidas() {
        int n = leerInt("Cantidad de palabras: ");
        int validas = 0;
        for (int i = 1; i <= n; i++) {
            String p = leerTexto("Palabra " + i + ": ");
            if (p.length() < 5) { System.out.println("Palabra ignorada."); continue; }
            validas++;
        }
        System.out.println("Cantidad de palabras válidas: " + validas);
    }
}
