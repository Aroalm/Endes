package PrimerosPasos;

import javax.swing.*;

public class EntradaDatos2 {

	public static void main(String[] args) {
		
		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
		
		String edad=JOptionPane.showInputDialog("Introduce la edad");
		
		int edad_usuario=Integer.parseInt(edad);
		
		//Para incrementar en 1
		//edad_usuario++;
		
		System.out.println("Hola "+ nombre_usuario+ " , el año que viene tendrás "+ (edad_usuario+1) + " años");
		
		

	}

}
