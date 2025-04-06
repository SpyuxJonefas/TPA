public class tpa5 {

    public static int contarPositivos(int[] array)
    {
        if(array == null )
        {
            return 0;
        }

        if(array.length == 0 || !esPotenciadeDos(array.length))
        {
            return 0;
        }

        int n = array.length - 1;

        return contarPositivos_erc(array,0,n);

    }

    private static int contarPositivos_erc(int[] array, int inicio, int fin)
    {
        if(inicio == fin)
        {
            return array[inicio] >= 0 ? 1: 0;
        }

        int mid = (inicio + fin )/ 2;

        int izquierda = contarPositivos_erc(array,inicio , mid);
        int derecha = contarPositivos_erc(array, mid + 1, fin);

        return izquierda + derecha;

        
    }


    private static boolean esPotenciadeDos(int n)
    {
        if( n < 1)
        {
            return false;
        }
        while(n % 2 == 0)
        {
            n = n / 2 ;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        int[] array = {-1, -4, 0, 3, 7, -2, 6, 8}; // tamaño = 8 (potencia de 2)
        int positivos = contarPositivos(array);
        System.out.println("Números positivos: " + positivos); // Esperado: 3
    }
    
    
}
