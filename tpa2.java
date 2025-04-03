public class tpa2 {

    public static int contarPositivos(int[] array) {
        if (array == null || array.length == 0 || !esPotenciadedos(array.length)) {
            return -1; 
        }

        return contarPositivos_DV(array, 0, array.length - 1);
    }

    private static boolean esPotenciadedos(int n)
    {
        if(n < 1)
        {
            return false;
        }
        while ( n % 2 == 0)
        {
            n = n/2;
        }

        return n == 1;
    }

    private static int contarPositivos_DV(int[] array, int inicio, int fin) {
        
        if (inicio == fin) {
            return array[inicio] > 0 ? 1 : 0;
        }
    
        
        int medio = (inicio + fin) / 2;
    
        
        int izquierda = contarPositivos_DV(array, inicio, medio);
        int derecha = contarPositivos_DV(array, medio + 1, fin);
    
        
        return izquierda + derecha;
    }
    



    public static void main(String[] args) {
        // Array de tamaño N = 8 (potencia de 2)
        // Primeras 5 posiciones negativas (X = 5)
        // Últimas 3 positivas (Y = 3), X + Y = 8
        int[] array = {-7, -5, -3, -2, -1, 1, 2, 3};

        int positivos = contarPositivos(array);

        if (positivos == -1) {
            System.out.println("El array no es válido (nulo, vacío o tamaño no potencia de 2)");
        } else {
            System.out.println("Cantidad de números positivos: " + positivos);
        }
    }
    
    
}
