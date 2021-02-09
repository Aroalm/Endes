package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		    Scanner sc = new Scanner(System.in);
	        int[] numeros = new int[10];
	        int contadorpos = 0, contadorpares=0; //contadores
	        int i;
	       
	        //Leemos los valores por teclado y los guardamos en el array  
	        
	        System.out.println("Lectura de los elementos del array: ");
	       
	        
	        for (i = 0; i < numeros.length; i++) {
	            System.out.print("numeros[" + i + "]= ");
	            numeros[i] = sc.nextInt();
	        }
	  
	        //se recorre el array para contar positivos y pares
        	
	        
	        for (i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0) {
	                contadorpos++;
	            } 
	            if (numeros[i]%2==0) {
	            	contadorpares++;
	            }

	        }
	        //mostrar resultados
	        System.out.println("Positivos: " + contadorpos);                                                                  

	        System.out.println("Pares: " + contadorpares);
         
	}

}
