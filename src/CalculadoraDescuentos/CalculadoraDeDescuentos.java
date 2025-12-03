package CalculadoraDescuentos;

import java.util.Scanner;

public class CalculadoraDeDescuentos {
    public static void calcularCosto() {
        Scanner input = new Scanner(System.in);
        double valorCompra;

        System.out.println("\nIngrese el precio del producto: ");
        int valorProducto = input.nextInt();
        input.nextLine();

        for (int porcentaje = 10; porcentaje <= 50; porcentaje += 10 ){
            double desc = (double) porcentaje / 100;
            valorCompra = valorProducto - valorProducto * desc;
            System.out.println("\n El valor de su compra con un descuento de " + porcentaje + "% es de $" + valorCompra);
        }
        input.close();
    }
}
