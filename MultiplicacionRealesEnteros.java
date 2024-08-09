import java.util.Scanner;


public class MultiplicacionRealesEnteros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número real: ");
            double numeroReal1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número Real: ");
            double numeroReal2 = scanner.nextDouble();

            double multiplicacionReal = numeroReal1 * numeroReal2;

            System.out.print("Ingrese el primer número entero: ");
            int numeroEntero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int numeroEntero2 = scanner.nextInt();

            int multiplicacionEntero = numeroEntero1 * numeroEntero2;

            double sumaMultiplicaciones = multiplicacionReal + multiplicacionEntero;

            System.out.println("El Resultado de la suma de las multiplicaciones es: " + sumaMultiplicaciones);

        } finally {
            scanner.close();
        }
    }
}
