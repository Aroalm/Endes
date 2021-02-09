package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

	int n; 
	int i, suma=0; 
	
	Scanner entrada=new Scanner(System.in);
	System.out.println("Introduzca n: ");
	n=entrada.nextInt();
	
	if(n<0) {
		System.out.println("El numero es negativo");
	}else {
		for(i=1; i<=n; i++) {
			
			suma+=i;
			}	
		
	System.out.println("La suma de los primeros numeros n es "+suma );
	}

	}

}
