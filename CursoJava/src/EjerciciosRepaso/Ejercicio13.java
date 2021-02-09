package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		

		int numero;
		int menor;


		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=entrada.nextInt();
		menor=numero;
		
		 
	    while (numero!=0) {
	        System.out.println("Introduce otro numero");
	        numero=entrada.nextInt();
	        if (numero!=0 && numero<menor) {
	        	menor=numero;
	        }
	    }
	    System.out.println("El menor es: " + menor);

	    
	}

}
