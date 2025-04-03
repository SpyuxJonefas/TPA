public class tpa1 {

    /**
 * Determina si una matriz cuadrada NxN es simétrica respecto a su diagonal principal,
 * utilizando el enfoque de Divide y Vencerás.
 *
 * Una matriz es simétrica si para todo par de índices (i, j), se cumple que:
 *     matriz[i][j] == matriz[j][i]
 *
 * Esta función valida que la matriz sea cuadrada, no nula, y que su tamaño N sea una potencia de 2.
 * En caso contrario, devolverá false automáticamente.
 *
 * @param matriz Matriz cuadrada de enteros NxN
 * @return true si la matriz es simétrica, false en caso contrario o si no cumple los requisitos
 */

    public static boolean esSimetrica_DV(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return false;
        }
    
        int n = matriz.length;
        boolean nula = false;
    
        // Validar que todas las filas existan y tengan longitud n (cuadrada)
        for (int i = 0; i < n; i++) {
            if (matriz[i] == null || matriz[i].length != n) {
                nula = true;
            }
        }

        if(nula == true)
        {
            return false;
        }

        if(!esPotenciadedos(n))
        {
            return false;
        }



        return esSimetric_rec(matriz,0,0,n);
        
    }

    private static boolean esPotenciadedos(int n)
    {
        if (n < 1)
        {
            return false;
        }

        while (n % 2 == 0)
        {
            n = n / 2;
        }

        return n == 1;
    }

    private static boolean esSimetric_rec(int [][] matriz, int x, int y, int n)
    {
        if ( n == 1)
        {
            return true;
        }

        int mid = n / 2;

        return 
                esSimetric_rec(matriz, x, y, mid) && esSimetric_rec(matriz, x + mid, y + mid, mid) && esSimetric_rec(matriz, y, x, mid) &&
                esSimetric_rec(matriz, y + mid, x + mid, mid) && compararSimetria(matriz, y, x + mid, y + mid, x, mid); 

       
    }

    private static boolean compararSimetria(int[][] m, int f1, int c1, int f2, int c2, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Comparamos B[i][j] con C[j][i]
                if (m[f1 + i][c1 + j] != m[f2 + j][c2 + i]) {
                    return false;
                }
            }
        }
        return true;
    }
    



    public static void main(String[] args) {
        // MATRIZ SIMÉTRICA (4x4)
        int[][] matrizSimetrica = {
            {1, 2, 3, 4},
            {2, 5, 6, 7},
            {3, 6, 8, 9},
            {4, 7, 9, 10}
        };
    
        // MATRIZ NO SIMÉTRICA (4x4)
        int[][] matrizNoSimetrica = {
            {1, 2, 3, 4},
            {2, 5, 6, 7},
            {3, 0, 8, 9}, // valor modificado: 0 en vez de 6
            {4, 7, 9, 10}
        };
    
        // MATRIZ VACÍA
        int[][] matrizVacia = new int[0][0];
    
        // MATRIZ NULA
        int[][] matrizNula = null;
    
        // MATRIZ MAL FORMADA (una fila es null)
        int[][] matrizMalFormada = {
            {1, 2},
            null
        };
    
        // MATRIZ DE TAMAÑO NO POTENCIA DE 2
        int[][] matriz3x3 = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };
    
        // MATRIZ 1x1 (caso base)
        int[][] matriz1x1 = {
            {42}
        };
    
        // PRUEBAS
        System.out.println("¿matrizSimetrica es simétrica?: " + esSimetrica_DV(matrizSimetrica)); // true
        System.out.println("¿matrizNoSimetrica es simétrica?: " + esSimetrica_DV(matrizNoSimetrica)); // false
        System.out.println("¿matrizVacia es simétrica?: " + esSimetrica_DV(matrizVacia)); // false
        System.out.println("¿matrizNula es simétrica?: " + esSimetrica_DV(matrizNula)); // false
        System.out.println("¿matrizMalFormada es simétrica?: " + esSimetrica_DV(matrizMalFormada)); // false
        System.out.println("¿matriz3x3 es simétrica?: " + esSimetrica_DV(matriz3x3)); // false (no es potencia de 2)
        System.out.println("¿matriz1x1 es simétrica?: " + esSimetrica_DV(matriz1x1)); // true
    
        System.out.println("\n***** FIN DE PRUEBAS *****");
    }
    
}//class
