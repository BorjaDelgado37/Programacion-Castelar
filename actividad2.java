import java.util.Scanner;

public class actividad2 {


static void cuadrado(){

System.out.println("bienvenido a la opcion 1 haremos el cuadrado de tu numero :) ");
while (true) {
System.out.println("introduce por aqui abajo tu numero");
Scanner scanner = new Scanner(System.in);
int numero = scanner.nextInt();
    
    if (numero < 0) {
        System.out.println("Programa terminado. Has introducido un número negativo.");
        break;
    }
    
    int cuadrado = numero * numero;
    System.out.println("El cuadrado de " + numero + " es: " + cuadrado);
}
}

static void media(){
    Scanner scanner = new Scanner(System.in);

    int suma = 0;
    int contador = 0;

    while (true) {
        System.out.print("Introduce tus número (un negativo como ultimo): ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            break;
        }

        suma += numero;
        contador++;
    }

    if (contador == 0) {
        System.out.println("No se ingresaron números válidos.");
    } else {
        double media = (double) suma / contador;
        System.out.println("La media de los números ingresados es: " + media);
    }
}

static void mostrarN(){
    
    for (int i = 100; i >= 0; i -= 7) {
        System.out.println(i);
    }
}

static void impares(){
    int producto = 1;
    int contador = 0;
    
    for (int i = 1; contador < 10; i++) {
        if (i % 2 != 0) { 
            producto *= i; 
            contador++; 
        }
    }

    System.out.println("El producto de los 10 primeros números impares es: " + producto);
}


static void media2(){
    Scanner sc = new Scanner(System.in);
    double sumaPositivos = 0;
    double sumaNegativos = 0;
    int cantidadCeros = 0;

    for (int i = 0; i < 10; i++) {
        System.out.print("Ingresa un numero hasta llegar a 10 introducidos: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            sumaPositivos += numero;
        } else if (numero < 0) {
            sumaNegativos += numero;
        } else {
            cantidadCeros++;
        }
    }

    int totalNumerosPositivos = 10 - cantidadCeros;
    int totalNumerosNegativos = 10 - cantidadCeros;

    if (totalNumerosPositivos > 0) {
        double mediaPositivos = sumaPositivos / totalNumerosPositivos;
        System.out.println("La media de los números positivos introducidos es: " + mediaPositivos);
    } else {
        System.out.println("No se ingresaron números positivos.");
    }

    if (totalNumerosNegativos > 0) {
        double mediaNegativos = sumaNegativos / totalNumerosNegativos;
        System.out.println("La media de los números negativos es: " + mediaNegativos);
    } else {
        System.out.println("No se ingresaron números negativos.");
    }

    System.out.println("La cantidad de ceros introduciddso es: " + cantidadCeros);

}

static void tabla(){
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("ingresa un número entre 0 y 10 y te dare su tabla de multiplicar: ");
    int numero = scanner.nextInt();
    
    if (numero >= 0 && numero <= 10) {
        System.out.println("Tabla de multiplicar del " + numero + ":");
        
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    } else {
        System.out.println("El número ingresado no está entre 1 y 10... :O    ");
    }
}

static void sueldoM(){
Scanner scanner = new Scanner(System.in);

System.out.println("Introduce el numero de sueldos de este trabajo");
int sueldo = scanner.nextInt();

if (sueldo == 1){
System.out.println("ingresa tu sueldo aqui ---> ");
int sueldo1 = scanner.nextInt();
System.out.println("tu sueldo mas grande es " + sueldo1 );
}

if (sueldo == 2){
System.out.println("ingresa tu primer sueldo aqui ---> ");
int sueldo2 = scanner.nextInt();
System.out.println("ingresa tu segundo sueldo aqui ---> ");
int segundos = scanner.nextInt();
 if (sueldo2 > segundos) {
System.out.println("tu sueldo mas grande es " + sueldo2 );
 } else {
System.out.println("tu sueldo mas grande es " + segundos);
}

}



















}

static void adivinaza(){

}

static void primos(){

}

static void cajaF(){

}







public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
        System.out.println("Menú:");
        System.out.println("\u001B[32m  ooooo    oooooo  1 Haz el cuadrado de tu numero :) \u001B[0m");
        System.out.println("\u001B[32m      o        o   2 Ingresa un numeros y te hare la media \u001B[0m");
        System.out.println("\u001B[32m    ooo       o    3 te mostrare del 100 a 0 \u001B[0m");
        System.out.println("\u001B[32m      o      o     4 te hare el producto de 10 primeros impares \u001B[0m");
        System.out.println("\u001B[32m  ooooo     o      5 Ingresa numeros y te hare la media \u001B[0m");
        System.out.println("\u001B[31m  (___       ___)   6 Ingresa un numero y te dare su tabla :)    \u001B[0m");
        System.out.println("\u001B[33m (´  (O)   (O)  `)  7 saber cuanto es el suledo maximo  \u001B[0m");
        System.out.println("\u001B[31m    (         )     8 adivina adivinanza :)   \u001B[0m");
        System.out.println("\u001B[31m     (       )      9 Detector de numeros primos  \u001B[0m");
        System.out.println("\u001B[33m      (º   º)       10 Caja fuerte :)   \u001B[0m");
        System.out.println("\u001B[31m     (-------)      11 Salir   \u001B[0m");
        System.out.println("\u001B[31m     (-------)                          \u001B[0m");
        System.out.print("Elija una opción (1-11): ");

        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                cuadrado();
                break;
            case 2:
                media();
                break;
            case 3:
               mostrarN();
                break;
            case 4:
               impares();
                break;
            case 5:
               media2();
                break;
            case 6:
                tabla();
                break;
            case 7:
               sueldoM();
                break;
            case 8:
                adivinaza();
                break;
            case 9:
                primos();
                break;
            case 10:
               cajaF();
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