package PrimerosPasos;

import java.util.Scanner;

import javax.swing.*;

public class CondicionalWhile12 {

	public static void main(String[] args) {

		String clave="Aroa";
		String password="";
		
		while(clave.equals(password)==false) {
			
		    password=JOptionPane.showInputDialog("Introduce contrase�a");
			
			if(clave.equals(password)==false){
				System.out.println("Contrase�a incorrecta");
			}
		}
		System.out.println("Contrase�a Correcta.Acceso permitido");
	}
	

}
