
package proyectomediociclo;


class Triangulo {
    private char[][] matriz;

    // Constructor de la clase Triangulo que inicializa la matriz
    public Triangulo(int size) {
        matriz = new char[size][size];
    }

    // Método para generar el Triángulo A
    public void generarTrianguloA(char caracter) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                matriz[i][j] = caracter;
            }
        }
    }

    // Método para generar el Triángulo B
    public void generarTrianguloB(char caracter) {
        int size = matriz.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                matriz[i][j] = caracter;
            }
        }
    }

    // Método para imprimir la matriz en forma de triángulo
    public void imprimirTriangulo() {
        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
    }
}

