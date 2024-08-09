import java.util.Scanner;

public class TriangulodeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Ingresa el número de filas para el triángulo: ");
            int filas = scanner.nextInt();

            for (int i = 1; i < filas; i++) {
                for (int j = 1; j<= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } finally {
            scanner.close();
        }
    }
}
