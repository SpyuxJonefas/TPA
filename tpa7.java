public class tpa7 {


    public static boolean busquedaBinaria(int [] array, int inicio, int fin, int x)
    {

        if (inicio > fin) {
            return false;
        }
        int mid = (inicio + fin) / 2;

        boolean encontrado = false;

        if(x > array[mid]){
            
            return busquedaBinaria(array, mid+1, fin, x);
            
        }
        else if(x < array[mid])
        {
            return busquedaBinaria(array, inicio, mid - 1, x);
        }
        else if(x == array[mid])
        {
            encontrado = true;
        }

        

        return encontrado;

    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int x = 7;
        boolean encontrado = busquedaBinaria(array, 0, array.length - 1, x);
        System.out.println("¿Está el número " + x + "? " + encontrado);  // Esperado: true
    }
    
    
}
