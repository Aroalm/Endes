package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		int numero1=0, numero2=0;
		int contadorpares=0, contadorimpares=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduzca 2 números");
		numero1=entrada.nextInt();
		numero2=entrada.nextInt();
		
		while(numero1!=2 && numero2!=0) {
			System.out.println("Introduzca 2 números");
			numero1=entrada.nextInt();
			numero2=entrada.nextInt();	
			}
		while(numero1==2|numero2==2) {
			
		  if(numero1==2){
			if (numero1%2==0) {
				contadorpares=contadorpares++;	
			}else {
				contadorimpares=contadorimpares++;
			}
		  if(numero2==2) {
		     if (numero2%2==0){
				contadorpares=contadorpares++;
			}else {
				contadorimpares=contadorimpares++;
			}		
		 
	    }	
		
		System.out.println(contadorpares);
		System.out.println(contadorimpares);
		}
}
		
}

}
