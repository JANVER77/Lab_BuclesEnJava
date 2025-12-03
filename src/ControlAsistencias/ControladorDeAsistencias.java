package ControlAsistencias;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControladorDeAsistencias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String presente = "presente";
        String ausente = "ausente";

        System.out.println("\n\nCual es total de estudiantes :");
        int totalEstudiantes = input.nextInt();
        input.nextLine();

        List<String> presentes = new ArrayList<>();
        List<String> ausentes = new ArrayList<>();

        for(int i = 0; i < totalEstudiantes; i++){
            System.out.println("\nIngrese el nombre : ");
            String estudiante = input.nextLine();
            System.out.println("Ingrese Ausente o Presente :");
            String estado = input.nextLine();
            if(estado.equalsIgnoreCase(presente)){
                presentes.add(estudiante);
            } else if (estado.equalsIgnoreCase(ausente)){
                ausentes.add(estudiante);
            } else {
                System.out.println("La opcion ingresado no es valida\n");
                i--;
            }

        }
        mostrarLista(presentes, "presentes");
        mostrarLista(ausentes, "ausentes");

    }

    private static void mostrarLista(List<String> lista, String estado){
        System.out.println("\n********* Lista de " + estado + " ***********\n");
        if(lista.size() > 0){
            for(int i = 0; i < lista.size(); i++){
                System.out.printf("""
                      %d. %s
                    """,i+1, lista.get(i));
            }
        } else {
            System.out.println("No hubo " + estado);
        }


    }
}
