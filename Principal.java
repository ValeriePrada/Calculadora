import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();
 
        //Menú por consola
       
        char choice;
 
        System.out.println ("Menú:");
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicación");
        System.out.println(" 4. División");
        System.out.println(" 5. Potencia");
        System.out.println(" 6. Raíz cuadrada");
        System.out.print ("Elige una de las anteriores opciones: ");
        choice = scanner.next().charAt(0);

        System.out.println("\n");
 
try {
            switch (choice) {
                case '1': {
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    int resultado = calc.sumar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                case '2': {
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    int resultado = calc.restar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                case '3': {
                    System.out.print("Ingrese el primer número: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");
                    int b = scanner.nextInt();
                    int resultado = calc.multiplicar(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                case '4': {
                    System.out.print("Ingrese el dividendo: ");
                    int a = scanner.nextInt();
                    System.out.print("Ingrese el divisor: ");
                    int b = scanner.nextInt();
                    double resultado = calc.dividir(a, b);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                case '5': {
                    System.out.print("Ingrese la base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese el exponente: ");
                    double exponente = scanner.nextDouble();
                    double resultado = calc.potencia(base, exponente);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                case '6': {
                    System.out.print("Ingrese el número: ");
                    double a = scanner.nextDouble();
                    double resultado = calc.raizCuadrada(a);
                    System.out.println("Resultado: " + resultado);
                    break;
                }
                default:
                    System.out.println("La opción elegida no se encuentra en el menú.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}