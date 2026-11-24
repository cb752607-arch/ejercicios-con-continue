import java.util.*;

public class IntegradorBreakContinue {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        integradorBreakContinue();
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

private static void integradorBreakContinue() {
        int cantidad = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        long suma = 0;
        System.out.println("Ingresa números enteros. Los negativos se ignoran y 0 finaliza.");
        while (true) {
            int numero = leerInt("Número: ");
            if (numero == 0) { System.out.println("Cero ingresado: fin con break."); break; }
            if (numero < 0) { System.out.println("Negativo ignorado con continue."); continue; }
            cantidad++; suma += numero; mayor = Math.max(mayor, numero); menor = Math.min(menor, numero);
        }
        System.out.println("Cantidad de números válidos: " + cantidad);
        if (cantidad > 0) {
            System.out.println("Suma total: " + suma);
            System.out.printf("Promedio: %.2f%n", (double) suma / cantidad);
            System.out.println("Número mayor: " + mayor + "\nNúmero menor: " + menor);
        } else System.out.println("No se ingresaron números válidos.");
    }
}
