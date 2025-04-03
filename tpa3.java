public class tpa3 {

    public static void main(String[] args) {
        System.out.println("=== Ejecutando funcionA con x = 8 ===");
        funcionA(8);
    }

    /**
     * Función pública que ejecuta la multiplicación de i*i desde i=5 hasta x-1.
     * Llama a la función recursiva 'producto' en cada iteración.
     */
    public static void funcionA(int x) {
        for (int i = 5; i < x; i++) {
            int resultado = producto(i, i);
            System.out.println("producto(" + i + ", " + i + ") = " + resultado);
        }
    }

    /**
     * Función recursiva que calcula el producto de dos enteros a * b
     * como suma repetida de 'a' un total de 'b' veces.
     * Ejemplo: producto(3, 4) → 3 + 3 + 3 + 3 = 12
     */
    private static int producto(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + producto(a, b - 1);
    }
}
