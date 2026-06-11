import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factura completa");
        System.out.println("2. Solo calcular propina");
        System.out.print("Seleccione una opcion: ");

        int opcion = sc.nextInt();

        if (opcion == 2) {
            System.out.print("Ingrese el subtotal: ");
            double subtotalPropina = sc.nextDouble();
            double propinaCalculada = subtotalPropina * 0.10;
            System.out.println("La propina es: " + propinaCalculada);
            sc.close();
            return;
        }

        System.out.print("Valor de platos principales: ");
        double platos = sc.nextDouble();

        System.out.print("Valor de bebidas: ");
        double bebidas = sc.nextDouble();

        double subtotal = platos + bebidas;
        double propina = subtotal * 0.10;
        double total = subtotal + propina;

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Propina: " + propina);
        System.out.println("Total: " + total);

        sc.close();
    }
}
