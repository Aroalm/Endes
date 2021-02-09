package PrimerosPasos;

public class ClaseString2 {

	public static void main(String[] args) {
		
		String nombre="Javier Crespo";
		
		System.out.println("Mi nombre es: "+ nombre);
		
		System.out.println("Mi nombre tiene "+ nombre.length() + " letras");
		
		System.out.println("La primera letra de " +nombre+ " es la "+ nombre.charAt(0));
		
		int ultimaletra=nombre.length();
		
		System.out.println("Y la ultima letra " + nombre + " es la "+ nombre.charAt(ultimaletra-1));

	}

}
