package PrimerosPasos;

import java.util.Scanner;

public class CondicionalSwitchCase {

	public static void main(String[] args) {
		
		//Clcular �rea de un cuadrado, rectangulo, triangulo, y circulo
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opci�n: \n1: Cuadrado \n2: Rect�ngulo \n3: Tri�ngulo \n4: C�rculo");
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			System.out.println("Introduce un lado");
			int lado=entrada.nextInt();
			System.out.println("�rea cuadrado: "+ Math.pow(lado, 2)+ " cm cuadrados");
			//System.out.println("�rea cuadrado: "+ (lado*lado));
			break;
		case 2:
			System.out.println("Introduce una base");
			int baserect=entrada.nextInt();
			System.out.println("Introduce una altura");
			int alturarect=entrada.nextInt();
			System.out.println("�rea rect�ngulo: "+(baserect*alturarect)+ " cm cuadrados");
			break;
		case 3:
			System.out.println("Introduce una base");
			int basetri=entrada.nextInt();
			System.out.println("Introduce una altura");
			int alturatri=entrada.nextInt();
			System.out.println("�rea tri�ngulo: "+ ((basetri*alturatri)/2)+ " cm cuadrados");
			break;
		case 4:
			System.out.println("Introduce un radio");
			int radio=entrada.nextInt();
			System.out.printf("�rea c�rculo: "+"%1.2f",(Math.PI*Math.pow(radio, 2))+" cm cuadrados");
			break;
		}
		}

}
