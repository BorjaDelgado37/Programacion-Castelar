import java.util.Scanner;

    public class ProgramaJava {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Tarea 1
            System.out.print("Por favor, introduce tu nombre: ");
            String nombre = scanner.nextLine();
            System.out.println("Bienvenido " + nombre);
    
            // Tarea 2
            System.out.print("Introduce una contraseña: ");
            String contraseña = scanner.nextLine();
            String contraseñaDefinida = "programacion2223"; 
            if (contraseña.equals(contraseñaDefinida)) {
                System.out.println("La contraseña es correcta.");
            } else {
                System.out.println("La contraseña es incorrecta.");
            }
    
            // Tarea 3
            System.out.print("Por favor, introduce una frase: ");
            String frase = scanner.nextLine();
            int longitud = frase.length();
            char primeraLetra = frase.charAt(0);
            char ultimaLetra = frase.charAt(longitud - 1);
            System.out.println("Longitud de la frase: " + longitud);
            System.out.println("Primera letra: " + primeraLetra);
            System.out.println("Última letra: " + ultimaLetra);
    
            // Tarea 4
            System.out.print("Por favor, introduce la frase 'Hola amigo ¿cómo estás?': ");
            String fraseCompleta = scanner.nextLine();
            String subcadena = fraseCompleta.substring(5, 11);
            System.out.println("Subcadena: " + subcadena);
    
            scanner.close();
        }
    }