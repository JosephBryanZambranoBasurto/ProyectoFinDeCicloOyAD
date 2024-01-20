
package proyectomediociclo;

import java.util.Scanner;


public class ProyectoMedioCiclo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del triángulo: ");
        int size = scanner.nextInt();

        System.out.println("Ingrese el carácter para formar el triángulo: ");
        char caracter = scanner.next().charAt(0);

        Triangulo trianguloA = new Triangulo(size);
        System.out.println("El triángulo A:");
        trianguloA.generarTrianguloA(caracter);
        trianguloA.imprimirTriangulo();

        System.out.println("El triángulo B:");
        Triangulo trianguloB = new Triangulo(size);
        trianguloB.generarTrianguloB(caracter);
        trianguloB.imprimirTriangulo();

        scanner.close();
    }
}