import java.util.Scanner;

public class RegistroDeVisitantes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaración de variables
        String nombre;
        int edad;
        char genero;
        boolean esPrimeraVisita;
        long numeroTelefono;


        // Asignación de valores
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();

        System.out.println("Ingrese su género (M/F): ");
        genero = scanner.next().charAt(0);

        System.out.println("¿Es su primera visita? (True/False): ");
        esPrimeraVisita = scanner.nextBoolean();

        System.out.println("Ingrese su número de teléfono: ");
        numeroTelefono = scanner.nextLong();


        // Impresión de valores
        System.out.println("\n**Información del visitante:**");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Primera visita: " + esPrimeraVisita);
        System.out.println("Número de teléfono: " + numeroTelefono);
    }
}


