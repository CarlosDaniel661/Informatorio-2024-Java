import java.util.Scanner;

public class MiNombreYEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa tu Nombre y Apellido: ");
            String nombreCompleto = scanner.nextLine();

            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();

            System.out.println("Mi nombre es:" + nombreCompleto);
            System.out.println("Mi edad es: " + edad + " años");

        } finally {
            scanner.close();

        }
    }
    
}
