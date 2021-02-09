package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		int numero;
		int mayor=0;


		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=entrada.nextInt();
		mayor=numero;
		
		 
	    while (numero!=0) {
	        System.out.println("Introduce otro numero");
	        numero=entrada.nextInt();
	        if (numero>mayor) {
	        	mayor=numero;
	        }
	    }
	    System.out.println("El mayor es: " + mayor);
    
	    
	}

}
