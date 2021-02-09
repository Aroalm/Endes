package poo;

public class UsoCoche {

	public static void main(String[] args) {
		
		Coche micoche=new Coche(); // Instanciar una clase.Ejemplar de clase.
		
		micoche.getLargo();
		System.out.println(micoche.getLargo());
		
		System.out.println(micoche.datosgenerales());
		
		micoche.setColor("rojo");
		System.out.println(micoche.getColor());
		
		micoche.setAsientoscuero("si");
		
		System.out.println(micoche.isAsientoscuero());
	}

}
