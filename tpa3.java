public class tpa3 {

    // Función recursiva: calcula a * b como suma de a repetida b veces
    public static int producto(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a + producto(a, b - 1);
    }

    // Función que llama a producto(i, i) desde i = 5 hasta i < x
    public static void funcionA(int x) {
        for (int i = 5; i < x; i++) {
            int resultado = producto(i, i); // producto(i, i) = i * i
            System.out.println("producto(" + i + ", " + i + ") = " + resultado);
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Ejecutando funcionA con x = 8 ===");
        funcionA(8);
    }
}
