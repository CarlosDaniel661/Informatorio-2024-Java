import java.util.Scanner;

public class NombreDeBebida {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el nombre de tu mascota: ");
            String nombreMascota = scanner.nextLine();

            System.out.print("Ingresa el nombre de la última película que viste: ");
            String nombrePelicula = scanner.nextLine();

            System.out.println("Nombre de la próxima bebida: "+ nombreMascota + " " + nombrePelicula);

        } finally {
            scanner.close();
        }
    }
}
