package PrimerosPasos;

import javax.swing.JOptionPane;

public class Array3 {

	public static void main(String[] args) {
		
		String[] paises=new String [8];
		
		for (int i=0; i<8; i++) {
			paises[i]=JOptionPane.showInputDialog("Introduce país " +(i+1));
			
		}
		for (String elemento: paises) {
			System.out.println("País: " + elemento);
		}
	}

}
