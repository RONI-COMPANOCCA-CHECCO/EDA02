import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese la cantidad de números
        System.out.print("Ingrese cuántos números desea agregar: ");
        int n = scanner.nextInt();
        int[] A = new int[n]; // Creamos una matriz de tamaño n
        
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }
        
        int[] Ain = Invertir(A);
        
        System.out.print("Matriz original: "); //  LA MATRIZ ORIGINAL
        imprimirArray(A);
        
        System.out.print("Matriz invertida: ");
        imprimirArray(Ain);
        
        scanner.close();
    }
    
    public static int[] Invertir(int[] A) {
        int n = A.length;
        int[] Ain = new int[n];

        for (int i = 0; i < n; i++) {
            Ain[i] = A[n - 1 - i];
        }

        return Ain;
    }
    
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

