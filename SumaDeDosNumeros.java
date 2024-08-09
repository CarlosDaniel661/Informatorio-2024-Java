import java.util.Scanner;

public class SumaDeDosNumeros {
    public static void main(String[] args) {
        
        // Scanner se usa para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese el primer número entero
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        // Pedimos al usuario que ingrese el segundo número entero
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        //Suma los dos números ingresados por el usuario
        int suma = numero1 + numero2;

        //Mostrar el resultado en pantalla
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);
        scanner.close();
    }
}
