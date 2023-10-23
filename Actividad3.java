
import java.util.Random;
import java.util.Scanner;
public class Actividad3 {


static void cronometro(){
System.out.println("has elegido el cronometro, ya esta activado!");
Scanner leer = new Scanner(System.in);
    int hora = 0;
    int minutos = 0;
    int segundos = 0;

    for (int i = 0; i <= 23; i++) {
      hora = i;

      for (int j = 0; j <= 59; j++) {
        minutos = j;

        for (int y = 0; y <= 59; y++) {
          segundos = y;
          System.out.println(hora + ":" + minutos + ":" + segundos);
        } 
    }
     }

    
}





static void potencia(){
    Scanner scanner = new Scanner(System.in);
    int limiteInferior, limiteSuperior;
    
    
    do {
        System.out.print("Introduce el límite inferior: ");
        limiteInferior = scanner.nextInt();
        if (limiteInferior >= 0) {
            System.out.println("El límite inferior debe ser menor que el límite superior.");
        }
    } while (limiteInferior >= 0);
    
   
    System.out.print("Introduce el límite superior: ");
    limiteSuperior = scanner.nextInt();
    
    int sumaDentroIntervalo = 0;
    int numerosFueraIntervalo = 0;
    boolean numeroIgualALimites = false;
    
    int numero;
    do {
        System.out.print("Introduce un número (0 para terminar): ");
        numero = scanner.nextInt();
        
        if (numero == limiteInferior || numero == limiteSuperior) {
            numeroIgualALimites = true;
        }
        
        if (numero > limiteInferior && numero < limiteSuperior) {
            sumaDentroIntervalo += numero;
        } else if (numero != 0) {
            numerosFueraIntervalo++;
        }
    } while (numero != 0);
    
    System.out.println("Suma de números dentro del intervalo: " + sumaDentroIntervalo);
    System.out.println("Números fuera del intervalo: " + numerosFueraIntervalo);
    
    if (numeroIgualALimites) {
        System.out.println("Se ha introducido al menos un número igual a los límites del intervalo.");
    } else {
        System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
    }
}

static void divido(){
    System.out.println("Introduce una frase y te la dividire por lineas :) ");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese una frase: ");
    String frase = scanner.nextLine();
   
    for (int i = 0; i < frase.length(); i++) {
        char letra = frase.charAt(i);
        System.out.println(letra);
    }
}

static void malavares(){

}

static void adivina(){
 Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        int numeroUsuario;

        System.out.println("¡Bienvenido al juego de adivinar un número!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Adivina cuál es!");

        do {
            System.out.print("Introduce tu número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAdivinar) {
                System.out.println("Más alto. Intenta de nuevo.");
            } else if (numeroUsuario > numeroAdivinar) {
                System.out.println("Más bajo. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
            }
        } while (numeroUsuario != numeroAdivinar);
    } 

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("Menú:");
        System.out.println("\u001B[32m  ooooo    oooooo  1 Activar cronometro   \u001B[0m");
        System.out.println("\u001B[32m      o        o   2 Resultado potencia   \u001B[0m");
        System.out.println("\u001B[32m    ooo       o    3 Divisor de frases    \u001B[0m");
        System.out.println("\u001B[32m      o      o     4 malavares de numeros \u001B[0m");
        System.out.println("\u001B[32m  ooooo     o      5 adivina adivinaza    \u001B[0m");
        System.out.println("\u001B[31m                   6 Salir                \u001B[0m");
        System.out.println("\u001B[33m  ooo        o    o       o        o         \u001B[0m");
        System.out.println("\u001B[33m  o  o      o o    o     o o      o         \u001B[0m");
        System.out.println("\u001B[33m  o   o    o   o    o   o   o    o         \u001B[0m");
        System.out.println("\u001B[33m  o   o   o     o    o  o    o  o          \u001B[0m");
        System.out.println("\u001B[33m  o o o  o       o    oo      oo           \u001B[0m");

        System.out.print("Elija una opción (1-6): ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                cronometro();
                break;
            case 2:
                potencia();
                break;
            case 3:
               divido();
                break;
            case 4:
               malavares();
                break;
            case 5:
               adivina();
                break;
            case 6:
                System.out.println("\u001B[36mSaliendo del programa. ¡Hasta luego! ");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo otro numero.");
                break;
        }
        System.out.print("\u001B[0m");
    } while (opcion != 6);
    scanner.close();
}

}
