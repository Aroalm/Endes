package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		int numero=0; 
	    boolean numeroprimo = true;
	    Scanner entrada=new Scanner (System.in);
	    System.out.println("Introduce un numero");
	    numero=entrada.nextInt();
		for (int i = 2; i < numero; i++) {
		        if (numero % i == 0) {
		            numeroprimo = false;
		            break;
		        }
		    }
		    if (numeroprimo)
		        System.out.println("El número es primo.");
		    else
		        System.out.println("El número no es primo.");
		}
	}


