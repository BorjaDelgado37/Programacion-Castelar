import java.util.GregorianCalendar;
import java.util.Scanner;

public class App {
    static void multiplo() {
        System.out.println("\u001B[32mSeleccionaste la Opción 1 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");

        // Leer el número ingresado por el usuario
        int numero = scanner.nextInt();

        // Verificar si el número es múltiplo de 3
        if (numero % 3 == 0) {
            System.out.println(numero + "\u001B[33m es numero si es múltiplo de 3.");
        } else {
            System.out.println(numero + "\u001B[31m no es múltiplo de 3. \u001B[0m");
        }
    }

    static void mayor() {
        System.out.println("\u001B[34mSeleccionaste la Opción 2 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\u001B[30mIngresa un número: \u001B[0m");
        int numero1 = scanner.nextInt();

        System.out.print("\u001B[32mIngresa su segundo número: \u001B[0m");
        int numero2 = scanner.nextInt();

        System.out.print("\u001B[35mIngresa su tercer número: \u001B[0m");
        int numero3 = scanner.nextInt();

        int maximo = numero1;

        if (numero2 > maximo) {
            maximo = numero2;
        }

        if (numero3 > maximo) {
            maximo = numero3;
        }

        System.out.println("El número más grande de los 3 es: " + maximo);
    }

    static void hora() {
        System.out.println("\u001B[33mSeleccionaste la Opción 3 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la hora (0-23):");
        int hora = scanner.nextInt();

        System.out.println("Ingresa los minutos (0-59):");
        int minutos = scanner.nextInt();

        System.out.println("Ingresa los segundos (0-59):");
        int segundos = scanner.nextInt();

        boolean horaValida = (hora >= 0 && hora < 24) && (minutos >= 0 && minutos < 60)
                && (segundos >= 0 && segundos < 60);

        if (horaValida) {
            System.out.println("La hora que ingresaste es válida son las: " + hora + "H : " + minutos
                    + "M : " + segundos + "S");
        } else {
            System.out.println("La hora ingresada no es válida, intentalo de nuevo! :).");
        }
    }

    static void mes() {
        System.out.println("\u001B[31mSeleccionaste la Opción 4 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el numero de un mes del año ! :) ");
        int meses = scanner.nextInt();

        if (meses == 1) {
            System.out.println("el mes " + meses + " que es enero el cual has introducido tiene 31 dias! ");
        }

        if (meses == 3) {
            System.out.println("el mes " + meses + " que es marzo el cual has introducido tiene 31 dias! ");
        }

        if (meses == 5) {
            System.out.println("el mes " + meses + " que es mayo el cual has introducido tiene 31 dias! ");
        }

        if (meses == 7) {
            System.out.println("el mes " + meses + " que es julio el cual has introducido tiene 31 dias! ");
        }

        if (meses == 9) {
            System.out.println(
                    "el mes " + meses + " que es septiembre el cual has introducido tiene 31 dias! ");
        }

        if (meses == 11) {
            System.out.println(
                    "el mes " + meses + " que es noviembre el cual has introducido tiene 31 dias! ");
        }

        if (meses == 2) {
            System.out
                    .println("el mes " + meses + " que es febrero el cual has introducido tiene 28 dias! ");
        }

        if (meses == 4) {
            System.out.println("el mes " + meses + " que es abril el cual has introducido tiene 30 dias! ");
        }

        if (meses == 6) {
            System.out.println("el mes " + meses + " que es junio el cual has introducido tiene 30 dias! ");
        }

        if (meses == 8) {
            System.out
                    .println("el mes " + meses + " que es agosto el cual has introducido tiene 30 dias! ");
        }

        if (meses == 10) {
            System.out
                    .println("el mes " + meses + " que es octubre el cual has introducido tiene 30 dias! ");
        }

        if (meses == 12) {
            System.out.println(
                    "el mes " + meses + " que es Diciembre el cual has introducido tiene 30 dias! ");
        }

    }

    static void aprobu() {
        System.out.println("\u001B[31mSeleccionaste la Opción 5 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la nota de la primera evaluación:");
        double evaluacion1 = scanner.nextDouble();

        System.out.println("Introduce la nota de la segunda evaluación:");
        double evaluacion2 = scanner.nextDouble();

        System.out.println("Introduce la nota de la tercera evaluación:");
        double evaluacion3 = scanner.nextDouble();

        boolean aprobadas = evaluacion1 >= 5 && evaluacion2 >= 5 && evaluacion3 >= 5;

        if (aprobadas) {

            double notaFinal = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
            System.out.println("¡Felicidades! Has aprobado todas las evaluaciones eres una maquina!.");
            System.out.println("Tu nota final es: " + notaFinal);
        } else {

            if (evaluacion1 < 5) {
                System.out.println("Debes recuperar la primera evaluación, has cateado :( .");
            }
            if (evaluacion2 < 5) {
                System.out.println("Debes recuperar la segunda evaluación, has cateado :(.");
            }
            if (evaluacion3 < 5) {
                System.out.println("Debes recuperar la tercera evaluación, has cateado :(.");
            }
        }

    }

    static void trabajo() {
        System.out.println("\u001B[31mSeleccionaste la Opción 6 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas este mes: ");
        int horasTrabajadas = scanner.nextInt();

        double tarifaNormal = 10.0;
        double tarifaExtra = 20.0;

        double sueldoTotal;

        if (horasTrabajadas <= 150) {

            sueldoTotal = horasTrabajadas * tarifaNormal;
        } else {

            int horasNormales = 150;
            int horasExtras = horasTrabajadas - horasNormales;

            sueldoTotal = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);
        }

        System.out.println("El sueldo total es: " + sueldoTotal + " euros");

    }

    static void parimpar() {
        System.out.println("\u001B[31mSeleccionaste la Opción 7 ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("introduce un numero por aqui ! :) ");

        int number1 = scanner.nextInt();

        if (number1 % 2 == 0) {
            System.out.println("el numero " + number1 + " es par! :)");
        }

        else {
            System.out.println("el numero que has introducido es un numero impar! :)");
        }

    }

    static void nombredia() {
        System.out.println("\u001B[31mSeleccionaste la Opción 8 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10");

        int numerito = scanner.nextInt();

        if (numerito == 0) {

            System.out.println("tu numero introducido seria cero :) ");
        }

        if (numerito == 1) {

            System.out.println("tu numero introducido seria uno :) ");
        }

        if (numerito == 2) {

            System.out.println("tu numero introducido seria dos :) ");
        }

        if (numerito == 3) {
            System.out.println("tu numero introducido seria tres :) ");

        }

        if (numerito == 4) {
            System.out.println("tu numero introducido seria cuatro :) ");

        }

        if (numerito == 5) {

            System.out.println("tu numero introducido seria cinco :)");
        }

        if (numerito == 6) {
            System.out.println("tu numero introducido seria seis :) ");
        }

        if (numerito == 7) {

            System.out.println("tu numero introducido seria siete :) ");
        }

        if (numerito == 8) {

            System.out.println("tu numero introducido seria ocho :) ");
        }

        if (numerito == 9) {

            System.out.println("tu numero introducido seria nueve :) ");
        }

        if (numerito == 10) {

            System.out.println("tu numero introducido seria diez :) ");
        }
    }

    static void dianombre() {
        System.out.println("\u001B[31mSeleccionaste la Opción 9 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero del 1 al 10 en letras minusculas");

        String numerito1 = scanner.nextLine();

        if (numerito1.equals("cero")) {

            System.out.println("tu numero introducido seria 0 :) ");
        }

        if (numerito1.equals("uno")) {

            System.out.println("tu numero introducido seria 1:) ");
        }

        if (numerito1.equals("dos")) {

            System.out.println("tu numero introducido seria 2 :) ");
        }

        if (numerito1.equals("tres")) {
            System.out.println("tu numero introducido seria 3 :) ");

        }

        if (numerito1.equals("cuatro")) {
            System.out.println("tu numero introducido seria 4 :) ");

        }

        if (numerito1.equals("cinco")) {

            System.out.println("tu numero introducido seria 5 :)");
        }

        if (numerito1.equals("seis")) {
            System.out.println("tu numero introducido seria 6 :) ");
        }

        if (numerito1.equals("siete")) {

            System.out.println("tu numero introducido seria 7 :) ");
        }

        if (numerito1.equals("ocho")) {

            System.out.println("tu numero introducido seria 8 :) ");
        }

        if (numerito1.equals("nueve")) {

            System.out.println("tu numero introducido seria 9 :) ");
        }

        if (numerito1.equals("diez")) {

            System.out.println("tu numero introducido seria 10 :) ");
        }
    }

    static void bisiesto() {
        System.out.println("\u001B[31mSeleccionaste la Opción 10 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce un año para saber si es o no bisiesto");
        int anio = scanner.nextInt();
        GregorianCalendar calendar = new GregorianCalendar();

        if (calendar.isLeapYear(anio)) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("\u001B[32m  ooooo    oooooo  1 ¿multiplo de 3? compruebalo! \u001B[0m");
            System.out.println("\u001B[32m      o        o   2 Dame 3 numeros, te devolvere el mayor! \u001B[0m");
            System.out.println("\u001B[32m    ooo       o    3 Ingresa una hora    \u001B[0m");
            System.out.println("\u001B[32m      o      o     4 Ingresa un mes para saber los dias! \u001B[0m");
            System.out.println("\u001B[32m  ooooo     o      5 Ingresa la nota de tu curso (3 evaluaciones) \u001B[0m");
            System.out.println("\u001B[31m   (_        _)    6 Calculador de sueldo!    \u001B[0m");
            System.out.println("\u001B[33m     00    00      7 Calculador par e impar!    \u001B[0m");
            System.out.println("\u001B[33m                   8 conversor de numeros a letras   \u001B[0m");
            System.out.println("\u001B[31m      (º  º)       9 conversor de letras a numeros   \u001B[0m");
            System.out.println("\u001B[37m      ______       10 detector de años bisitestos   \u001B[0m");
            System.out.println("\u001B[37m     (______)      11 Salir   \u001B[0m");

            System.out.print("Elija una opción (1-11): ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    multiplo();
                    break;
                case 2:
                    mayor();
                    break;
                case 3:
                    hora();
                    break;
                case 4:
                    mes();
                    break;
                case 5:
                    aprobu();
                    break;
                case 6:
                    trabajo();
                    break;
                case 7:
                    parimpar();
                    break;
                case 8:
                    nombredia();
                    break;
                case 9:
                    dianombre();
                    break;
                case 10:
                    bisiesto();
                    break;
                case 11:
                    System.out.println("\u001B[36mSaliendo del programa. ¡Hasta luego! ");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo otro numero.");
                    break;
            }
            System.out.print("\u001B[0m");
        } while (opcion != 11);
        scanner.close();
    }

}