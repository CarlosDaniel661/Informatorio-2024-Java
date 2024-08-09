import java.util.Scanner;

public class PotenciaDosYTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            double numero = scanner.nextDouble();

            double potenciaCuadrado = Math.pow(numero, 2);
            double potenciaCubo = Math.pow(numero, 3);

            System.out.println("El número " + numero + " al cuadrado es: " + potenciaCuadrado);
            System.out.println("El número " + numero+ " al cubo es: " + potenciaCubo);
            
        } finally {
            scanner.close();
        }
        
    }
    
}
