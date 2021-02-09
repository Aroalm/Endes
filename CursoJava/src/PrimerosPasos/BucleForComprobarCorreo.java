package PrimerosPasos;

import javax.swing.JOptionPane;

public class BucleForComprobarCorreo {

	public static void main(String[] args) {
		
		boolean arroba=false;
		
		String email=JOptionPane.showInputDialog("Introduce mail");
		
		for (int i=0; i<email.length(); i++) {
			
			if (email.charAt(i)=='@') {
				
				arroba=true;
			}
		}
		if (arroba==true) {
			System.out.println("Es correcto");
		}else {
			System.out.println("No es correcto");
		}
	}

}
