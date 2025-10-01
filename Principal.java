public class Principal{
    public static void main(String[] args) {
 
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
        choice = (char) System.in.read();
 
        System.out.println("\n");
 
        switch(choice) {
            case '1':
                Calculadora;
            break;
            case '2':
                Calculadora;
            break;
            case '3':
                Calculadora;
            break;
            case '4':
                Calculadora;
            break;
            case '5':
                Calculadora;
            break;
            case '6':
                Calculadora;
            break;
            default:
                System.out.print ("La opción elegida no se encuentra en el menú.");
        }
    }
}