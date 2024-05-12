import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el número para la base del triángulo
        System.out.print("Ingrese el número de filas para la base del triángulo: ");
        int base = scanner.nextInt();
        
        trianguloRecursivo(base);
     
        scanner.close();
    }
    
    public static void trianguloRecursivo(int base) {
        if (base > 0) {
            trianguloRecursivo(base - 1);
            
            for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

