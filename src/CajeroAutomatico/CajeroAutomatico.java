package CajeroAutomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void operaciones() {
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

            saldo = procesarOpcion(opcion, saldo, input);


        } while (!salir);
    }

    private static void consultarSaldo(int saldo) {
        System.out.println("Tiene un saldo de : $" + saldo + "\n\n");
    }

    private static int retirar(int saldo, Scanner input){
        System.out.println("Digite el valor que desea retirar : ");
        int retiro = input.nextInt();
        input.nextLine();
        if (retiro > saldo){
            System.out.println("Fondos insuficientes, consulta tu saldo");
            return saldo;
        }
        saldo -= retiro;
        return saldo;
    }

    private static int depositar(int saldo, Scanner input){
        System.out.println("Digite el valor que desea retirar : ");
        int retiro = input.nextInt();
        input.nextLine();
        saldo += retiro;
        return saldo;
    }
    private static int procesarOpcion(int opcion, int saldo, Scanner input){
        switch (opcion){
            case 1:
                consultarSaldo(saldo);
                break;
            case 2:
                saldo = retirar(saldo, input);
                consultarSaldo(saldo);
                break;
            case 3:
                saldo = depositar(saldo, input);
                consultarSaldo(saldo);
                break;
            case 4:
                break;
        }
        return saldo;
    }

}
