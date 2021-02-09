package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorpares=0, contadorimpares=0; //contadores
        int i;
        
       System.out.println("Introduce 10 numeros: ");
       
       for (i = 0; i < numeros.length; i++) {
           System.out.print("numeros[" + i + "]= ");
           numeros[i] = sc.nextInt();
       }
       
       for (i = 0; i < numeros.length; i++) {

           if (numeros[i]%2==0) {
           	contadorpares++;
           } else {
        	contadorimpares++;
           }

       }

		System.out.println("Numeros pares: "+contadorpares);
		System.out.println("Numeros impares: "+contadorimpares);
		

	}

}
