package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
	    int resultado=1;
	    int numero;
	    
	    Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un numero");
        numero=entrada.nextInt();
	    
	    for (int i=numero; i>0; i--) {
	    	
	    	resultado=resultado*i;
	    	
	    }
	    System.out.println("El factorial de "+ numero+ " es "+ resultado);
		}

	}

