package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca la operaci�n a realizar: \n1: Sumar dos n�meros \n2: Restar dos n�meros \n3: Multiplicar dos n�meros \n4: Dividir dos n�meros \n5: Hacer A mod B con los dos n�meros");
		int opcion=entrada.nextInt();		
		System.out.println("Introduce A");
		int A=entrada.nextInt();
		System.out.println("Introduce B");
		int B=entrada.nextInt();

		
switch (opcion) {
		
		case 1:
			System.out.println(A+B);
			break;
		case 2:
			System.out.println(A-B);
			break;
		case 3:
			System.out.println(A*B);
			break;
		case 4:
			System.out.println(A/B);
			break;
		case 5:
			System.out.println(A + "es " + B + "y " + B + "es " + A);

		}
		
	}

}
