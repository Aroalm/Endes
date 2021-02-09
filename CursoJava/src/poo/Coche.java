package poo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoplataforma;
	private String color="azul";
	private int pesototal;
	private boolean asientoscuero;
	private boolean climatizador;
	
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoplataforma=500;
		
	}


	/*Para prescindir de la clase uso coche se puede crear el metodo main en la clase coche
	public static void main(String[] args) {
		
		Coche Renault=new Coche(); // Instanciar una clase.Ejemplar de clase.
		
		System.out.println("Este coche tiene "+ Renault.ruedas+ " ruedas");
	}*/
	
	public String datosgenerales() {
		return "La plataforma del vehículo tiene "+ ruedas+ " ruedas. Mide " 
				+ largo/1000+ " metros con un ancho de "+ ancho+ 
				" cm y un peso de platadorma de " +pesoplataforma+ " kilos.";
	}
	
	
	public String getLargo() {
		return "El largo del coche es "+ largo;
	}


	public void setColor(String color) {
		//this.color = "azul";
		this.color=color;
	}

	public String getColor() {
		return "El color del coche es "+color;
	}


	public String isAsientoscuero() {
		
		if(asientoscuero==true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie";
		}
	}

	public void setAsientoscuero(String asientoscuero) {
		
		if(asientoscuero=="si") {
			this.asientoscuero=true;
		}else {
			this.asientoscuero=false;
		}	
	}


	public void setMatricula(String next) {
		// TODO Auto-generated method stub
		
	}


	public void setModelo(String next) {
		// TODO Auto-generated method stub
		
	}


	public void setNumeropuertas(String next) {
		// TODO Auto-generated method stub
		
	}


		
	}	

