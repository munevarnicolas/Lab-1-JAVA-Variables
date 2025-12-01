package Java3Tarea;

import java.util.Scanner;

public class Facturacion {
    public static void main(String[] args) {

        String nombreProducto;
        double precioProducto;
        int cantidadComprar;
        final double Impuesto = 0.21;
        double dineroCliente;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = scanner.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        precioProducto = scanner.nextDouble();

        System.out.println("Ingrese la cantidad a comprar: ");
        cantidadComprar = scanner.nextInt();

        System.out.println("Ingrese cuanto dinero tiene el cliente: ");
        dineroCliente = scanner.nextDouble();

        double subtotal = precioProducto * cantidadComprar;
        double totalAPagar = subtotal + (subtotal * Impuesto);


        boolean puedeComprar = dineroCliente >= totalAPagar;

        System.out.println("DETALLE DE LA COMPRA");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio por unidad: $" + precioProducto);
        System.out.println("Cantidad: " + cantidadComprar);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Impuesto (21%): $" + (subtotal * Impuesto));
        System.out.println("Total a pagar: $" + totalAPagar);
        System.out.println("Dinero del cliente: $" + dineroCliente);
        System.out.println("¿Se aprobo la compra?: " + puedeComprar);
        scanner.close();
    }
}