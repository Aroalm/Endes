package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		int numero=0;
		int suma=0;
		int contador=0;
		
		Scanner entrada=new Scanner(System.in);
		
		for (int i=0; i<10;i++) {	
		System.out.println("Introduzca un numero");
		numero=entrada.nextInt();
		suma=suma+numero;
		if(suma>100) {
			System.out.println("La suma es mayor que 100");
		}
		}
		System.out.println("Se han introducido 10 numeros");
	    }
	
}


	

	

	
