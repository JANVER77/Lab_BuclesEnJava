import CajaRegistradora.CajaRegistradora;
import CajeroAutomatico.CajeroAutomatico;
import CalculadoraDePromedios.CalculadoraDePromedios;
import CalculadoraDescuentos.CalculadoraDeDescuentos;
import ControlAsistencias.ControladorDeAsistencias;
import GeneradorDeContraseñas.GenerarDeContraseñas;
import TablaMultiplicarInteractiva.TablaMultiplicarInteractiva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("""
                *************** Taller Java 6 Bucles **************
                
                        1. Caja Registradora de comida
                        2. Calculadora de descuentos
                        3. Tabla de multiplicar interactiva
                        4. Cajero automatico
                        5. Generador de contraseñas
                        6. Control de asistencia en clase
                        7. Calculadora de promedios
                        
                        Seleccione una opcion :          
                """);
        int opcion = input.nextInt();
        input.nextLine();

        switch (opcion){
            case 1:
                CajaRegistradora.registrar();
                break;
            case 2:
                CalculadoraDeDescuentos.calcularCosto();
                break;
            case 3:
                TablaMultiplicarInteractiva.multiplicar();
                break;
            case 4:
                CajeroAutomatico.operaciones();
                break;
            case 5:
                GenerarDeContraseñas.crearContraseña();
                break;
            case 6:
                ControladorDeAsistencias.contralarAsistencias();
                break;
            case 7:
                CalculadoraDePromedios.verificarAprobacion();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }

    }
}