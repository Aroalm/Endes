package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		int [] numeros=new int[10];
		
		
		int suma=0;
		int i=0;
		int mayor=0;
		int menor=0;
		
		Scanner entrada=new Scanner(System.in);
		
	
		//Suma
		
		for (int n=0; i<10; i++) {
		
		System.out.println("Introduce numero");	
		numeros[i]=entrada.nextInt();
		suma+=numeros[i];
		}
		System.out.println(suma);
	
		
		//Media

	    
	    //Mayor
	    for (int n=0; i<10; i++) {
			
	   	 if (numeros[i]>mayor) {
	        	mayor=numeros[i];
	        }
		
			
		 if(numeros[i]<menor) {
			 menor=numeros[i];
			 
	    
			}
			
	}	
	    
	    System.out.print(suma/10);
	    System.out.println(mayor);
	    System.out.println(menor);
	    System.out.println(numeros[4]);
	}
}
/*

		
		
		
		
		
		*/		
		

	


