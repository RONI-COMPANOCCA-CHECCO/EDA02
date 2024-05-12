import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int d = 2; // Número de posiciones que va a rotar hacia la izquierda
        
        int[] Aiz = rotarIzquierdaArray(A, d);
        
        System.out.println("Arreglo original: " + Arrays.toString(A));
        System.out.println("Arreglo rotado hacia la izquierda: " + Arrays.toString(Aiz));
    }
    
    public static int[] rotarIzquierdaArray(int[] A, int d) {
        int n = A.length;
        int[] Aiz = new int[n];

        int rotaciones = d % n;

        for (int i = 0; i < n; i++) {
            int newIndex = (i + (n - rotaciones)) % n;
            Aiz[newIndex] = A[i];
        }

        return Aiz;
    }
}