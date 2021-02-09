package PrimerosPasos;

import java.util.*;

public class Condicionalif2 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad;
		edad=entrada.nextInt();
		
		if(edad<18) {
			System.out.println("Eres adolescente");
		
		}else if(edad<40){
			System.out.println("Eres joven");
			
		}else if(edad<65) {
			System.out.println("Eres maduro");
			
		}else{
			System.out.println("Cuidate");
	}

}
	}
	
