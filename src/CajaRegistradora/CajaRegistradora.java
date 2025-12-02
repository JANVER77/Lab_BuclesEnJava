package CajaRegistradora;

import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int seleccion;
        int cuenta = 0;

        do{
            System.out.printf("""
                    Elige una opcion del siguiente menu:
                    
                    ********* listado de precios ***********
                    
                    1. Hammburguesa  : $50                    
                    2. Hog Dog       : $40                    
                    3. Salchipapa    : $25                    
                    4. Porcion papas : $15                    
                    5. Bebida Gaseosa: $8                    
                    6. Terminar orden                    
                    
                    Que desea ordenar, selecciona una opcion :\n
                    """);
            seleccion = input.nextInt();
            input.nextLine();

            if(seleccion == 6){
                System.out.println("\nGracias por su compra regrese pronto");
                break;
            }
            cuenta += seleccionarOpcion(seleccion);



            System.out.println("\nSu cuenta va en $" + cuenta + "\n ¿Desear ordenar algo mas?\n\n");

        } while (seleccion != 6);

        input.close();
    }

    private static int seleccionarOpcion(int opcion){
        int costo = 0;
        switch (opcion){
            case 1:
                costo = 50;
                break;
            case 2:
                costo = 40;
                break;
            case 3:
                costo = 25;
                break;
            case 4:
                costo = 15;
                break;
            case 5:
                costo = 8;
                break;
            default:
                System.out.println("Gracias por su compra, regrese pronto");
                break;
        }
        return costo;
    }
}
