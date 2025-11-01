package pe.edu.tecsup.app;

import java.util.Scanner;

public class InputDatos {
    public static void main(String[] args) {

        String nombre;
        int edad;

        //Data entry
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe tu nombre...");
        nombre = entrada.nextLine();
        System.out.println("Escribe tu edad: ");
        edad = entrada.nextInt();

        //Data output
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: "+ edad);

    }
}
