package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numero;
		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Introduce un numero");
		numero=entrada.nextInt();
		
		System.out.print("Los divisores de "+ numero + " son: ");
		
		for( int i=1; i<=numero; i++) {
			if(numero%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}

}
