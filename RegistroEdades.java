import java.util.*;

public class RegistroEdades {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        registroEdades();
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

private static void registroEdades() {
        int cantidad = leerInt("¿Cuántas edades registrarás?: ");
        int validas = 0; double suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            int edad = leerInt("Edad " + i + ": ");
            if (edad < 18 || edad > 65) {
                System.out.println("Edad ignorada (debe estar entre 18 y 65).");
                continue;
            }
            validas++; suma += edad;
        }
        System.out.println("Cantidad válida de personas: " + validas);
        if (validas > 0) System.out.printf("Promedio de edad: %.2f%n", suma / validas);
        else System.out.println("No hay edades válidas para calcular el promedio.");
    }
}
