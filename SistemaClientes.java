import java.util.*;

public class SistemaClientes {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sistemaClientes();
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

private static void sistemaClientes() {
        int n = leerInt("Cantidad de clientes a registrar: ");
        int validos = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Cliente " + i + ":");
            String nombre = leerTexto("Nombre: ");
            String correo = leerTexto("Correo: ");
            String telefono = leerTexto("Teléfono: ");
            if (nombre.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                System.out.println("Registro incompleto, se ignora.");
                continue;
            }
            validos++;
        }
        System.out.println("Cantidad de clientes válidos: " + validos);
        if (n > 0) System.out.printf("Porcentaje de registros válidos: %.2f%%%n", 100.0 * validos / n);
        else System.out.println("No se registraron clientes.");
    }
}
