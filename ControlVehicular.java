import java.util.*;

public class ControlVehicular {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        controlVehicular();
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

private static void controlVehicular() {
        int n = leerInt("Cantidad de vehículos: ");
        double suma = 0, mayor = Double.NEGATIVE_INFINITY; int validas = 0;
        for (int i = 1; i <= n; i++) {
            double v = leerDouble("Velocidad " + i + " (km/h): ");
            if (v < 20) { System.out.println("Velocidad ignorada."); continue; }
            suma += v; mayor = Math.max(mayor, v); validas++;
        }
        if (validas == 0) System.out.println("No hay velocidades válidas.");
        else System.out.printf("Velocidad promedio: %.2f km/h%nMayor velocidad: %.2f km/h%n",
                suma / validas, mayor);
    }
}
