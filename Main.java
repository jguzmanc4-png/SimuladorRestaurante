import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factura completa");
        System.out.println("2. Solo calcular propina");
        System.out.print("Seleccione una opcion: ");

        int opcion = sc.nextInt();

        // Funcionalidad de propina
        if (opcion == 2) {
            System.out.print("Ingrese el subtotal: ");
            double subtotalPropina = sc.nextDouble();

            double propinaCalculada = subtotalPropina * 0.10;

            System.out.println("La propina es: " + propinaCalculada);

            sc.close();
            return;
        }

        // Funcionalidad de platos principales
        System.out.print("Valor de platos principales: ");
        double platos = sc.nextDouble();

        // Funcionalidad de bebidas
        System.out.print("Valor de bebidas: ");
        double bebidas = sc.nextDouble();

        // Cálculos generales
        double subtotal = platos + bebidas;
        double propina = subtotal * 0.10;

        // Funcionalidad total-restaurante
        double descuento = 0;

        if (subtotal > 100000) {
            descuento = subtotal * 0.05;
        }

        double total = subtotal + propina - descuento;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Propina: " + propina);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);

        sc.close();
    }

}