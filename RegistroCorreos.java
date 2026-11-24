import java.util.*;

public class RegistroCorreos {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        registroCorreos();
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

private static void registroCorreos() {
        int n = leerInt("Cantidad de correos a ingresar: ");
        List<String> validos = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String correo = leerTexto("Correo " + i + ": ");
            if (!correo.contains("@")) { System.out.println("Correo ignorado: falta @."); continue; }
            validos.add(correo);
        }
        System.out.println("Correos válidos:");
        if (validos.isEmpty()) System.out.println("Ninguno.");
        else for (String correo : validos) System.out.println("- " + correo);
    }
}
