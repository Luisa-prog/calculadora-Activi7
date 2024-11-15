import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Por favor, ingrese un número:");
        int numero1 = sc.nextInt();
        System.out.println("El número ingresado es: " + numero1);

        
        System.out.println("Por favor, ingrese otro número:");
        int numero2 = sc.nextInt();
        System.out.println("El número ingresado es: " + numero2);

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;

        if (numero2 != 0) {
            double division = (double) numero1 / numero2; 
            System.out.println("La división de los dos números es: " + division);
        } else {
            System.out.println("La división no se puede realizar porque el divisor es cero.");
        }

        System.out.println("La suma de los dos números es: " + suma);
        System.out.println("La resta de los dos números es: " + resta);
        System.out.println("La multiplicación de los dos números es: " + multiplicacion);

        sc.close();
    }
}