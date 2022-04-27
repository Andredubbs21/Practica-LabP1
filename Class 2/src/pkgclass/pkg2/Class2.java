/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgclass.pkg2;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Class2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Declarar variables
    Scanner leer = new Scanner(System.in);
    String alumno = "", direccion = "";
    int edad = 0;
    double estatura = 0, nota1,nota2,nota3,promedio;
    // Desde el teclado 
    System.out.println("Ingresar nombre del alumno: ");
    alumno = leer.next();
    System.out.println("Ingresar edad: ");
    edad = leer.nextInt();
    System.out.println("Ingresar la estatura: ");
    estatura = leer.nextDouble();
    System.out.println("Ingresar la direccion: ");
    leer.nextLine();
    direccion = leer.nextLine();
    System.out.println("******Datos de notas ******");
    System.out.println("Nota1: ");
    nota1 = leer.nextDouble();
    System.out.println("Nota2: ");
    nota2 = leer.nextDouble();
    System.out.println("Nota3: ");
    nota3 = leer.nextDouble();
    promedio = (nota1 + nota2 + nota3)/3;
    System.out.println("Promedio: " + promedio);
    }
    
}
