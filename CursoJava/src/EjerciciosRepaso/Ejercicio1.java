package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca la operación a realizar: \n1: Sumar dos números \n2: Restar dos números \n3: Multiplicar dos números \n4: Dividir dos números \n5: Hacer A mod B con los dos números");
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
