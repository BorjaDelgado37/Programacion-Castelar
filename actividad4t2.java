import java.util.Scanner;

public class actividad4t2 {

    public static void multiplipos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer numero: ");
        float x = sc.nextInt();
        System.out.println("Escriba el segundo numero: ");
        float y = sc.nextInt();
        if (EsMultiplo(x, y) == 0)
            System.out.println("El número " + x + " es multiplo de " + y);
        else
            System.out.println("El número " + x + " no es multiplo de " + y);

    }

    public static float EsMultiplo(float x, float y) {
        return (x % y);

    }

    public static void TempMedia1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas medias quieres calcular");
        int calculosTotales = sc.nextInt();
        for (int i = 0; i < calculosTotales; i++) {
            System.out.println("Dame una temperatura máxima");
            float tempMax = sc.nextInt();
            System.out.println("Dame una temperatura mínima");
            float tempMin = sc.nextInt();
            System.out.println(
                    "En el día " + i + " tenemos una temperatura media de: " + calcularMedia(tempMax, tempMin));
        }
    }

    public static float calcularMedia(float temperaturaMin, float temperaturaMax) {
        return (temperaturaMax + temperaturaMin) / 2;
    }

    public static void espacio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String entrada = scanner.nextLine();
        String resultado = espacio1(entrada);

        System.out.println("" + resultado);
    }

    public static String espacio1(String texto) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            resultado.append(caracter).append(' ');
        }
        return resultado.toString();
    }

    public static double calcularArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static double calcularPerimetro(double radio) {
        return 2 * Math.PI * radio;
    }

    public static void areayperimetro() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double area = calcularArea(radio);
        double perimetro = calcularPerimetro(radio);

        System.out.println("El área de la circunferencia es: " + Math.round(area));
        System.out.println("El perímetro de la circunferencia es: " + Math.round(perimetro));
    }

    static int intentos = 0;

        public static boolean Login(String usuario, String contrasena) {
        
            if (usuario.equals("usuario1") && contrasena.equals("asdasd")) {
                return true;
            } else {
                intentos++;
                return false;
            }
        }

        public static void loginUC() {
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                System.out.print("Nombre de usuario: ");
                String usuario = scanner.nextLine();
                System.out.print("Contraseña: ");
                String contrasena = scanner.nextLine();

                if (Login(usuario, contrasena)) {
                    System.out.println("Inicio de sesión correcto");
                    break;
                } else {
                    System.out.println(
                            "Nombre de usuario o contraseña incorrectos. Intentos restantes: " + (3 - intentos));
                }
            }

            if (intentos == 3) {
                System.out.println("Se han agotado los intentos. Se ha cerrado sesión");
            }
        }

            public static int calcularMCD(int num1, int num2) {
                while (num2 != 0) {
                    int temp = num2;
                    num2 = num1 % num2;
                    num1 = temp;
                }
                return num1;
            }
        
            public static void mcd() {
                try {
                    
                    Scanner sc = new Scanner(System.in);
        
                    System.out.print("Ingresa el primer numero entero: ");
                    int numero1 = sc.nextInt();
                    System.out.print("Ingrese su segundo numero entero: ");
                    int numero2 = sc.nextInt();
                    
                    if (numero1 < 0 || numero2 < 0) {
                        System.out.println("Los números deben ser enteros");
                    } else {
                        int mcd = calcularMCD(numero1, numero2);
                        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcd);
                    }
                    
                    sc.close();
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Debes ingresar números enteros válidos");
                }
            }
        

            public static void tiempocalculo() {
                Scanner scanner = new Scanner(System.in);
                
                while (true) {
                    System.out.println("Elija una opción:");
                    System.out.println("1. Convertir a segundos");
                    System.out.println("2. Convertir a horas, minutos y segundos");
                    System.out.println("3. Salir del programa");
                    
                    int opcion = scanner.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            System.out.println("Introduzca las horas, minutos y segundos:");
                            int horas = scanner.nextInt();
                            int minutos = scanner.nextInt();
                            int segundos = scanner.nextInt();
                            int totalSegundos = tiempoASegundos(horas, minutos, segundos);
                            System.out.println("El tiempo en segundos es: " + totalSegundos + " segundos");
                            break;
                        case 2:
                            System.out.println("Cantidad de segundos:");
                            int tiempoEnSegundos = scanner.nextInt();
                            int[] resultado = segundosATiempo(tiempoEnSegundos);
                            System.out.println("El tiempo es: " + resultado[0] + " horas, " + resultado[1] + " minutos y " + resultado[2] + " segundos");
                            break;
                        case 3:
                            System.out.println("Saliendo del programa");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, elija una opción válida");
                    }
                }
            }
            
            public static int tiempoASegundos(int horas, int minutos, int segundos) {
                return horas * 3600 + minutos * 60 + segundos;
            }
            
            public static int[] segundosATiempo(int totalSegundos) {
                int horas = totalSegundos / 3600;
                int minutos = (totalSegundos % 3600) / 60;
                int segundos = totalSegundos % 60;
                int[] resultado = {horas, minutos, segundos};
                return resultado;
            }
        
        

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int opcion;
            
                do {
                    System.out.println("Menú:");
                System.out.println("\u001B[32m  ooooo    oooooo  1 Multiplos?  \u001B[0m");
                System.out.println("\u001B[32m      o        o   2 ¿frio o calor?   \u001B[0m");
                System.out.println("\u001B[32m    ooo       o    3 Creador de espaciado    \u001B[0m");
                System.out.println("\u001B[32m      o      o     4 Calcula Area y premietro \u001B[0m");
                System.out.println("\u001B[32m  ooooo     o      5 haz tu login    \u001B[0m");
                System.out.println("\u001B[32m                   6 Media masa corporal       \u001B[0m");
                System.out.println("\u001B[32m                   7 Calculo tiempo          \u001B[0m");
                System.out.println("\u001B[31m                   8 Salir               \u001B[0m");
                System.out.println("\u001B[33m  ooo        o    o       o        o         \u001B[0m");
                System.out.println("\u001B[33m  o  o      o o    o     o o      o         \u001B[0m");
                System.out.println("\u001B[33m  o   o    o   o    o   o   o    o         \u001B[0m");
                System.out.println("\u001B[33m  o   o   o     o    o  o    o  o          \u001B[0m");
                System.out.println("\u001B[33m  o o o  o       o    oo      oo           \u001B[0m");
                   
                System.out.print("Elija una opción (1-8): ");
            
                    opcion = scanner.nextInt();
                  switch (opcion) {
            case 1:
                            multiplipos();
                            break;
                        case 2:
                            TempMedia1();
                            break;
                        case 3:
                            espacio1();
                            break;
                        case 4:
                            areayperimetro();
                            break;
                        case 5:
                            loginUC();
                            break;
                        case 6:
                            mcd();
                            break;
                        case 7:
                        tiempocalculo();
                            break;
                        case 8:
                        System.out.println("\u001B[36mSaliendo del programa. ¡Hasta luego! ");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo otro numero.");
                break;
        }       
        }while (opcion != 8 );
    scanner.close();
    }
}


        
    