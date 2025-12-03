package TablaMultiplicarInteractiva;

import java.util.Scanner;

public class TablaMultiplicarInteractiva {
    public static void multiplicar() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese numenro entre 1 - 10: ");
        int num = input.nextInt();
        input.nextLine();
        if(num > 0 && num < 11){
            int multiplicador = 1;
            System.out.printf("********** Tabla de multiplicar del %d *********\n",num);
            while(multiplicador < 11){
                int res = num * multiplicador;
                System.out.printf("""                       
                                               
                                          %d * %d = %d 
                        """,num, multiplicador, res);
                multiplicador++;
            }
        }else{
            System.out.println("\n Opcion no valida");
        }

    }
}
