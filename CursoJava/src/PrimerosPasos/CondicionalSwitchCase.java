package PrimerosPasos;

import java.util.Scanner;

public class CondicionalSwitchCase {

	public static void main(String[] args) {
		
		//Clcular área de un cuadrado, rectangulo, triangulo, y circulo
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura=entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			System.out.println("Introduce un lado");
			int lado=entrada.nextInt();
			System.out.println("Área cuadrado: "+ Math.pow(lado, 2)+ " cm cuadrados");
			//System.out.println("Área cuadrado: "+ (lado*lado));
			break;
		case 2:
			System.out.println("Introduce una base");
			int baserect=entrada.nextInt();
			System.out.println("Introduce una altura");
			int alturarect=entrada.nextInt();
			System.out.println("Área rectángulo: "+(baserect*alturarect)+ " cm cuadrados");
			break;
		case 3:
			System.out.println("Introduce una base");
			int basetri=entrada.nextInt();
			System.out.println("Introduce una altura");
			int alturatri=entrada.nextInt();
			System.out.println("Área triángulo: "+ ((basetri*alturatri)/2)+ " cm cuadrados");
			break;
		case 4:
			System.out.println("Introduce un radio");
			int radio=entrada.nextInt();
			System.out.printf("Área círculo: "+"%1.2f",(Math.PI*Math.pow(radio, 2))+" cm cuadrados");
			break;
		}
		}

}
