package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int base;
		int exponente;
		int resultadopotencia=1;
		int i;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una base");
		base=entrada.nextInt();
		System.out.println("Introduce un exponente");
		exponente=entrada.nextInt();
		
		
		resultadopotencia=(int)(Math.pow(base, exponente));
		
	
	}
	}


