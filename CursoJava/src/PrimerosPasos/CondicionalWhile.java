package PrimerosPasos;

import java.util.*;

public class CondicionalWhile {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		String clave="Aroa";
		String password="";
		
		while(clave.equals(password)==false) {
			
			System.out.println("Introduce contraseņa");
			password=entrada.next();
			
			if(clave.equals(password)==false){
				System.out.println("Contraseņa incorrecta");
			}
		}
		System.out.println("Contraseņa Correcta.Acceso permitido");
	}
	

}
