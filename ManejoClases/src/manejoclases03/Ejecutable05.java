/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author SALA H
 */
public class Ejecutable05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Hospital miHospital = new Hospital();
        // Dar valores a los atributos
        System.out.println("Nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Numero Camas:");
        int camas = entrada.nextInt();
        System.out.println("Presupuesto:");
        double presupuesto = entrada.nextDouble();
        
        miHospital.establecerNombre(nombre);
        miHospital.establecerNumeroCamas(camas);
        miHospital.establecerPresupuesto(presupuesto);
        
        System.out.printf("Nombre: %s - Numero de Camas: %d - Presupuesto: "
                + "%.2f\n", miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(),
                miHospital.obtenerPresupuesto());
        
    }
}
