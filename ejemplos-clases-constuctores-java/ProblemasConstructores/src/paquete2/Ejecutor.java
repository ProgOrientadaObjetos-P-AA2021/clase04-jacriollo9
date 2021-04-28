/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar el nombre del hospital");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine();
        System.out.println("Ingrese el numero de Doctores");
        int numDoctores = entrada.nextInt();
        System.out.println("Ingrese el numero de Enfermeros");
        int numEnfermeros = entrada.nextInt();

        Hospital hosp = new Hospital(nombre, ciudad, numDoctores, numEnfermeros);
        System.out.printf("%s\n", hosp);

    }
}
