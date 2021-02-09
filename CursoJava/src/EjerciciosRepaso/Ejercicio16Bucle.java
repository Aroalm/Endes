package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio16Bucle {

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
		
for (i=1; i<=exponente; i++) {
			
			resultadopotencia=resultadopotencia*base;
					
		}
		System.out.println(resultadopotencia);
		}
		

	}


