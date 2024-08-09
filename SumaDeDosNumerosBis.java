import java.util.Scanner;

public class SumaDeDosNumerosBis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Ingresa el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int numero2 = scanner.nextInt();

            int suma = numero1 + numero2;

            String paridad = (suma % 2 == 0) ? "par" : "impar";

            System.out.println("El resultado es " + suma +" y es " + paridad);
            
        } finally{
            scanner.close();
        }
    }
}
