public class tpa6 {

    public static int sumaRecursiva(int[] array, int cont)
    {
        if(cont == array.length)
        {
            return 0;
        }

        return array[cont] + sumaRecursiva(array, cont+1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int suma = sumaRecursiva(array, 0);
        System.out.println("Suma total: " + suma);  // Esperado: 15
    }
    
    
}
