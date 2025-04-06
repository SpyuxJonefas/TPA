

public class tpa8 {

    public static boolean esPerfecto(int n)
    {
        boolean perfecto = false;
        int div = 1;
        int cont = 0;
        while (div != n)
        {
            if(n % div == 0)
            {
                cont = div + cont;
                
            }
            div++;
        }

        if(cont == n)
        {
            perfecto =true;
        }

        return perfecto;
        
    }


    public static void main(String[] args) {
        int numero = 28;

        if (esPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " NO es un número perfecto.");
        }
    }
    
}
