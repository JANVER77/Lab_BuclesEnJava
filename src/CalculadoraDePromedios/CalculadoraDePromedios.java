package CalculadoraDePromedios;

import java.util.Scanner;

public class CalculadoraDePromedios {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumatoria = 0;

        System.out.println("\nIngrese cantidad de calificaciones :");
        int numCalificiaciones = input.nextInt();
        input.nextLine();



        for(int i = 1; i <= numCalificiaciones; i++){
            System.out.println("Ingrese nota " + i);
            double calificacion = input.nextDouble();
            input.nextLine();
            sumatoria += calificacion;
        }
        double promedio = promediarNotas(sumatoria, numCalificiaciones);
        System.out.println(verifcarEstAprobado(promedio) +  " con " + promedio);
    }

    private static double promediarNotas(double suma, int numNotas){
        double promedio =  suma / numNotas;
        return promedio;
    }

    private static String verifcarEstAprobado(double promedio){
        if(10 >= promedio && promedio >= 8 ){
            return "Excelente";
        } else if(7.9 >= promedio && promedio >= 6){
            return "Aprobado";
        } else if (6 > promedio && promedio >= 0){
            return "Reprobado";
        } else {
            System.out.println("no es valido");
            return "no valido";
        }
    }

}
