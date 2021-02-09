package PrimerosPasos;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in); 
		System.out.println("Introduce tu nombre");
		String nombre_usuario=entrada.nextLine();
		System.out.println("Introduce edad");
		int edad=entrada.nextInt();
		
		System.out.println("Hola "+ nombre_usuario+" ,el año que viene tendrás "+ (edad+1)+ " años");
	 
	}

  }


