package CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean  salir = false;
        int saldo = 5000;

        do{
            System.out.printf("""
                    ***** Bienvenido a nuestro Cajero Generation *******
                    
                        selecciona una de las siguientes opciones: 
                    
                            1. Consultar saldo
                            2. Retirar
                            3. Depositar
                            4. Salir                   
                    
                    """);
            int opcion = input.nextInt();
            input.nextLine();
            if (opcion == 4){
                System.out.println("Gracias por preferirnos, te esperamos pronto");
                salir = true;
            }

            saldo = eligirOpcion(opcion, saldo, input);


        } while (!salir);
    }

    private static void consultar(int saldo) {
        System.out.println("Tiene un saldo de : $" + saldo + "\n\n");
    }

    private static int retirar(int saldo, Scanner input){
        System.out.println("Digite el valor que desea retirar : ");
        int retiro = input.nextInt();
        input.nextLine();
        System.out.println(saldo + retiro);
        saldo -= retiro;
        System.out.println(saldo);
        return saldo;
    }

    private static int depositar(int saldo, Scanner input){
        System.out.println("Digite el valor que desea retirar : ");
        int retiro = input.nextInt();
        input.nextLine();
        saldo += retiro;
        return saldo;
    }
    private static int eligirOpcion(int opcion, int saldo, Scanner input){
        switch (opcion){
            case 1:
                consultar(saldo);
                break;
            case 2:
                saldo = retirar(saldo, input);
                consultar(saldo);
                break;
            case 3:
                saldo = depositar(saldo, input);
                consultar(saldo);
                break;
            case 4:
                break;
        }
        return saldo;
    }

}
