package poo;

public class Uso_vehiculo {

	public static void main(String[] args) {
		
		Coche micoche1=new Coche();
		
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgoneta1=new Furgoneta(7, 580);
		
		mifurgoneta1.setColor("azul");
		
		mifurgoneta1.setAsientoscuero("Si");
		
		System.out.println(micoche1.datosgenerales()+ " " + micoche1.getColor());
		
		
		System.out.println(mifurgoneta1.datosgenerales()+ mifurgoneta1.dimedatosfurgoneta());
		

	}

}
