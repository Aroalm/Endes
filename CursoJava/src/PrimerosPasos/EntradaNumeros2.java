package PrimerosPasos;

import javax.swing.*;

public class EntradaNumeros2 {

	public static void main(String[] args) {
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		double num1double=Double.parseDouble(num1);
		System.out.print("La raiz de "+num1double+ " es ");
		System.out.printf("%1.2f", Math.sqrt(num1double));

	}

}
