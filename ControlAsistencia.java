import java.util.*;

public class ControlAsistencia {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        controlAsistencia();
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

private static void controlAsistencia() {
        int n = leerInt("Cantidad de estudiantes registrados: ");
        int asistentes = 0;
        for (int i = 1; i <= n; i++) {
            String estado = leerTexto("Estudiante " + i + " (A=asiste, R=retirado): ");
            if (estado.equalsIgnoreCase("R")) { System.out.println("Estudiante retirado ignorado."); continue; }
            if (estado.equalsIgnoreCase("A")) asistentes++;
            else { System.out.println("Estado no reconocido; se ignora."); continue; }
        }
        System.out.println("Cantidad de asistentes válidos: " + asistentes);
    }
}
