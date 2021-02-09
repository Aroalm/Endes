package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		  int i;
		  int suma = 0;
		  int numero;
		  
	        Scanner entrada = new Scanner(System.in);
	        System.out.println("Introduce un número: ");
	        numero = entrada.nextInt();
	        for (i = 1; i < numero; i++) {  // i son los divisores. Se divide desde 1 hasta n-1                            
	            if (numero % i == 0) {
	                suma = suma + i;   // si es divisor se suma
	            }
	        }
	        if (suma == numero) {           // si el numero es igual a la suma de sus divisores es perfecto                
	            System.out.println(" Es un número perfecto");
	        } else {
	            System.out.println("No es un número perfecto");

	        }
	    }

	}

