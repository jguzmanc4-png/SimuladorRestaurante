import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // =========================================================
        // FUNCIONALIDAD 1: Valor de platos principales (Juan Adolfo - Dev 1)
        // =========================================================
        System.out.print("Valor de platos principales: ");
        double platos = sc.nextDouble();

        // =========================================================
        // FUNCIONALIDAD 2: Valor de bebidas (Tu parte - Jhorlan - Dev 2)
        // =========================================================
        System.out.print("Valor de bebidas: ");
        double bebidas = sc.nextDouble(); // <--- Tu lógica real de escaneo activa

        // =========================================================
        // ESTRUCTURA DE CÁLCULOS GENERALES
        // (Serán perfeccionados por Dev 3 y Dev 4 al fusionar ramas)
        // =========================================================
        double subtotal = platos + bebidas;
        double propina = subtotal * 0.10;
        double total = subtotal + propina;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Propina: " + propina);
        System.out.println("Total: " + total);

        sc.close();
    }
}