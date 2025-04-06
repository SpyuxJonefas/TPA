public class tpa4{

    public static int buscarMaximo(int[] array)
    {
        if(array == null )
        {
            return -1;
        }
        int n = 0;
        int max = 0;
        while (n != array.length)
        {
            if(max < array[n])
            {
                max = array[n];
            }
            n++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] array = {5, 8, 2, 15, 6, 9};
        int max = buscarMaximo(array);
        System.out.println("Máximo: " + max);  // Esperado: 15
    }
    
}