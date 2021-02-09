package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		

	    int numero, suma=0;
	    
	    Scanner entrada=new Scanner(System.in);
	    System.out.println("Introduce un numero");
	    numero=entrada.nextInt();
	    
	    while (numero!=0) {
	        suma+=numero;
	        System.out.println("Introduce otro numero");
	        numero=entrada.nextInt();
	        }    
	    System.out.println("La suma vale: " + suma);
	    


	}

}
