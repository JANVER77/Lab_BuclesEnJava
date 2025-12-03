package GeneradorDeContraseñas;

import java.util.Random;
import java.util.Scanner;

public class GenerarDeContraseñas {
    public static void main(String[] args) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiales = "!@#$%^&*()_+-=";

        String caracteres = mayusculas + minusculas + numeros + especiales;
        String pass = "";

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("ingrese longitud de contraseña deseada : ");
        int longPass = input.nextInt();

        for (int i = 0; i < longPass; i++){
            int position = random.nextInt(caracteres.length());
            char caracter = caracteres.charAt(position);
            pass += caracter;
        }

        System.out.println("\nLa contraseña generado es : " + pass);
    }



}
