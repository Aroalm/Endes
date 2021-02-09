package PrimerosPasos;

import java.util.Scanner;

import javax.swing.*;

public class CondicionalWhile12 {

	public static void main(String[] args) {

		String clave="Aroa";
		String password="";
		
		while(clave.equals(password)==false) {
			
		    password=JOptionPane.showInputDialog("Introduce contraseña");
			
			if(clave.equals(password)==false){
				System.out.println("Contraseña incorrecta");
			}
		}
		System.out.println("Contraseña Correcta.Acceso permitido");
	}
	

}
