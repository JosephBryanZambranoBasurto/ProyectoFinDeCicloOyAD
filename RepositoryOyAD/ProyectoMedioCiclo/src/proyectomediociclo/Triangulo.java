
package proyectomediociclo;


class Triangulo {
    private char[][] matriz;

    // Constructor de la clase Triangulo que inicializa la matriz
    public Triangulo(int size) {
        matriz = new char[size][size];//                /*1*/ ta
    }
//    Tiempo de inicializar constructor
//    T = ta
    
    
    // Método para generar el Triángulo A
    public void generarTrianguloA(char caracter) {
        int size = matriz.length;//                    /*1*/ ta + to
        for (int i = 0; i < size; i++) {//             /*2*/ ta + (n*tc + tc) + n*(ta + to) = ta + n*(tc + ta + to) + tc
            for (int j = 0; j <= i; j++) {//           /*3*/ n*ta + (n*tc + tc) + n*(ta + to) = n*(tc + 2ta + to) + tc
                matriz[i][j] = caracter;//             /*4*/ ¿?
            }
        }
    }
//Tiempo mejor esperado al generar Triangulo A
//Tm = ta + to + ta + n*(tc + ta + to) + tc + n*(tc + 2ta + to) + tc
//Tm = 2ta + to + n*(2tc + 3ta + 2to) + 2tc
//Tm = (2tc + 3ta + 2to)*n + (2tc + 2ta + to) = A*n + B
//
//Tiempo peor esperado al generar Triangulo A
//Tp = 2ta + to + n*(2tc + 4ta + 2to) + 2tc
//Tp = (2tc + 4ta + 2to)*n + (2tc + 2ta + to) = A'*n + B
//
//Tiempo promedio al generar Triangulo A
//Tu = (Tm + Tp)/2 = [(2tc + 3ta + 2to)*n + (2tc + 2ta + to) + (2tc + 4ta + 2to)*n + (2tc + 2ta + to)]/2
//Tu = [(2tc + 3ta + 2to)*n + (2tc + 4ta + 2to)*n + 4tc + 4ta + 2to)]/2  
//Tu = [(4tc + 7ta + 4to)*n + 4tc + 4ta + 2to]/2
    

    // Método para generar el Triángulo B
    public void generarTrianguloB(char caracter) {
        int size = matriz.length;//                    /*1*/ ta + to
        for (int i = 0; i < size; i++) {//             /*2*/ ta + (n*tc + tc) + n*(ta + to) = ta + n*(tc + ta + to) + tc
            for (int j = 0; j < size - i; j++) {//     /*3*/ n*ta + [n*(tc + to) + tc] + n*(ta + to) = n*(tc + 2ta + 2to) + tc
                matriz[i][j] = caracter;//             /*4*/ ¿?
            }
        }
    }
//Tiempo mejor esperado al generar Triangulo B
//Tm = ta + to + ta + n*(tc + ta + to) + tc + n*(tc + 2ta + 2to) + tc
//Tm = 2ta + to + n*(2tc + 3ta + 3to) + 2tc
//Tm = (2tc + 3ta + 3to)*n + (2tc + 2ta + to) = A*n + B
//
//Tiempo peor esperado al generar Triangulo B
//Tp = 2ta + to + n*(2tc + 4ta + 3to) + 2tc
//Tp = (2tc + 4ta + 3to)*n + (2tc + 2ta + to) = A'*n + B
//
//Tiempo promedio al generar Triangulo B
//Tu = (Tm + Tp)/2 = [(2tc + 3ta + 3to)*n + (2tc + 2ta + to) + (2tc + 4ta + 3to)*n + (2tc + 2ta + to)]/2
//Tu = [(2tc + 3ta + 3to)*n + (2tc + 4ta + 3to)*n + 4tc + 4ta + 2to)]/2  
//Tu = [(4tc + 7ta + 6to)*n + 4tc + 4ta + 2to]/2
    
    
    // Método para imprimir la matriz en forma de triángulo
    public void imprimirTriangulo() {
        for (char[] fila : matriz) { //                /*1*/ n*(ta + to)
            for (char c : fila) { //                   /*2*/ 2n*(ta + to) = n*(2ta + 2to)
                if (c == 0) { //                       /*3*/ n*tc
                    System.out.print("  ");          /*4*/
                } else { //                            /*5*/ n*tc
                    System.out.print(c + " ");         /*6*/
                }
            }
            System.out.println();                      /*7*/
        }
    }
//Tiempo de imprimir Triangulo
//T = n*(ta + to) + n*(2ta + 2to) + n*tc + n*tc
//T = n*(3ta + 3to + 2tc)
    

//Tiempo mejor esperado del Proyecto
//Tm(ejercicio) = T(Constructor) + Tm(generarTrianguloA) + Tm(generarTrianguloB) + T(imprimirTriangulo)
//Tm(ejercicio)= ta + [(2tc + 3ta + 2to)*n + (2tc + 2ta + to)] + [(2tc + 3ta + 3to)*n + (2tc + 2ta + to)] + n*(3ta + 3to + 2tc)
//
//Tiempo peor esperado del Proyecto
//Tp(ejercicio) = T(Constructor) + Tp(generarTrianguloA) + Tp(generarTrianguloB) + T(imprimirTriangulo)
//Tp(ejercicio)= ta + [(2tc + 4ta + 2to)*n + (2tc + 2ta + to)] + [(2tc + 4ta + 3to)*n + (2tc + 2ta + to)] + n*(3ta + 3to + 2tc)
//
//Tiempo promedio del Proyecto
//Tu(ejercicio) = T(Constructor) + Tu(generarTrianguloA) + Tu(generarTrianguloB) + T(imprimirTriangulo)
//Tu(ejercicio)= ta + [(4tc + 7ta + 4to)*n + 4tc + 4ta + 2to]/2 + [(4tc + 7ta + 6to)*n + 4tc + 4ta + 2to]/2 + n*(3ta + 3to + 2tc)
}


