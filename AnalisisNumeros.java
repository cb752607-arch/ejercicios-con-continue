import java.util.*;

public class AnalisisNumeros {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        analisisNumeros();
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

private static void analisisNumeros() {
        List<Integer> validos = new ArrayList<>();
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) continue;
            validos.add(i);
        }
        System.out.println("Números del 1 al 500 que no son múltiplos de 2, 3 ni 5:");
        System.out.println(validos);
        System.out.println("Cantidad encontrada: " + validos.size());
    }
}
