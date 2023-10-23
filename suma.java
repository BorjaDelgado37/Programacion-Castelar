import java.util.Scanner;

public class suma {
// Borja Delgado Sánchez (28/09/23)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Suma, Resta y Multiplicación de dos números");
            System.out.println("2. Calcular la raíz cuadrada de un número");
            System.out.println("3. Calcular la potencia de un número");
            System.out.println("4. Calcular el área de un círculo");
            System.out.println("5. Calcular la longitud de una circunferencia");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularOperacionesBasicas();
                    break;
                case 2:
                    calcularRaizCuadrada();
                    break;
                case 3:
                    calcularPotencia();
                    break;
                case 4:
                    calcularAreaCirculo();
                    break;
                case 5:
                    calcularLongitudCircunferencia();
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del menú.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    public static void calcularOperacionesBasicas() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            double suma = num1 + num2;
            double resta = num1 - num2;
            double multiplicacion = num1 * num2;

            System.out.println("Resultados:");
            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
        }
    }

    public static void calcularRaizCuadrada() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            if (numero >= 0) {
                double raizCuadrada = Math.sqrt(numero);
                System.out.println("La raíz cuadrada de " + numero + " es " + raizCuadrada);
            } else {
                System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
            }
        }
    }

    public static void calcularPotencia() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la base: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese el exponente: ");
            double exponente = scanner.nextDouble();

            double resultado = Math.pow(base, exponente);
            System.out.println(base + " elevado a la " + exponente + " es igual a " + resultado);
        }
    }

    public static void calcularAreaCirculo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();

            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es: " + area);
        }
    }

    public static void calcularLongitudCircunferencia() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el radio de la circunferencia: ");
            double radio = scanner.nextDouble();

            double longitud = 2 * Math.PI * radio;
            System.out.println("La longitud de la circunferencia es: " + longitud);
        }
    }
}