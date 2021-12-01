/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author PersonaL-CTI
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String apellido;
        String cadena = "";
        double sueldoPadre;
        double gastoHijo1;
        double gastoHijo2;
        double gastoHijo3;
        double totalGastosHijos;
        boolean bandera = true;
        String salida;

        while (bandera) {

            System.out.println("Ingrese sus nombres ");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese sus apellidos ");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese su sueldo ");
            sueldoPadre = entrada.nextDouble();
            
            System.out.println("Ingrese los gastos de su primer hijo ");
            gastoHijo1 = entrada.nextDouble();
            
            System.out.println("Ingrese los gastos de su segundo hijo ");
            gastoHijo2 = entrada.nextDouble();
            
            System.out.println("Ingrese los gastos de su tercer hijo ");
            gastoHijo3 = entrada.nextDouble();

            totalGastosHijos = gastoHijo1 + gastoHijo2 + gastoHijo3;
            if (sueldoPadre < totalGastosHijos) {
                cadena = ("El padre de familia " + nombre + " " + apellido
                        + " sueldo semanal:  $" + sueldoPadre + " Numero de hijos: 3\n"
                        + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + gastoHijo1
                        + "\n" + "Hijo 2, gasta semanalmente: " + gastoHijo2 + "\n" + ""
                        + "Hijo 3, gasta semanalmente: " + gastoHijo3 + "\n"
                        + "Total de gasto en hijos: " + totalGastosHijos + "\n" + "El padre de familia "
                        + nombre + " le falta el dinero semanalmente ");
            }
            if (sueldoPadre >= totalGastosHijos) {
                cadena = ("El padre de familia " + nombre + " " + apellido
                        + " sueldo semanal:  $" + sueldoPadre + " Numero de hijos: 3\n"
                        + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + gastoHijo1
                        + "\n" + "Hijo 2, gasta semanalmente: " + gastoHijo2 + "\n" + ""
                        + "Hijo 3, gasta semanalmente: " + gastoHijo3 + "\n"
                        + "Total de gasto en hijos: " + totalGastosHijos + "\n" + "El padre de familia "
                        + nombre + " le alcanza el dinero semanalmente ");
            }
            entrada.nextLine();

            System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
            System.out.println(cadena);
        }

    }
}
