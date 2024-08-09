import java.util.Scanner;

public class CalculoDivisibilidad {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int numero2 = scanner.nextInt();

            int suma = numero1 + numero2;

            boolean esDivisible = (numero2 != 0) && (numero1 % numero2 == 0);
            String mensajeDivisibilidad = esDivisible ? "es divisible" : "no es divisible";

            System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

            System.out.println("El primer número (" + numero1 + ") " + mensajeDivisibilidad + " por el segundo número (" + numero2 + ").");


        } finally {
            scanner.close();
        }
    }
}
