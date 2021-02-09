package poo;

import java.io.IOException;
import java.util.Scanner;

public class Aparcamiento {

	
	
class Cliente{

	public void setDNI(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setNombre(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setApellidos(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setEdad(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setDireccion(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setEmail(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setHorallegada(String next) {
		// TODO Auto-generated method stub
		
	}

	public void setDiasestancia(String next) {
		// TODO Auto-generated method stub
		
	}
	
class Flotacoches{
	
}

public void setV(Coche micoche) {
	// TODO Auto-generated method stub
	
}
	
}



private Object  gmail;
	
public void darAltaCliente() {
	
	Scanner sc=new Scanner(System.in);
	Cliente c=new Cliente();
	System.out.println("DNI del cliente");
	c.setDNI(sc.next());
	System.out.println("Nombre: ");
	c.setNombre(sc.next());
	System.out.println("Apellidos: ");
	c.setApellidos(sc.next());
	System.out.println("Edad: ");
	c.setEdad(sc.next());
	System.out.println("Direccion: ");
	sc.nextLine();
	c.setDireccion(sc.next());
	System.out.println("Email: ");
	c.setEmail(sc.next());
	System.out.println("Hora de llegada: ");
	c.setHorallegada(sc.next());
	System.out.println("Dias de estancia: ");
	c.setDiasestancia(sc.next());
	System.out.println(c);
	System.out.println("¿Qué tipo de vehículo tienes?");
	
	String cadena=sc.next();
	if(cadena.equalsIgnoreCase("Coche")) {
		Coche micoche=new Coche();
		System.out.println("Matricula");
	/*	micoche.setMatricula(sc.next());
		System.out.println("Marca");
		micoche.setMatricula(sc.next());
		System.out.println("Modelo");
		micoche.setModelo(sc.next());
		System.out.println("Numero de puertas");
		micoche.setNumeropuertas(sc.next());*/

		//Asigno el vehiculo al cliente
		
		c.setV(micoche);
			
	//this.clientes.add(c);
	}
	if(cadena.equalsIgnoreCase("Moto")) {
		
	}
	
	if(cadena.equalsIgnoreCase("Furgoneta")) {
	}
	}

public void GuardarClientes() {
	
	//Cliente c=new Cliente("111111H", "Marta", "Lopez", 38, "Mayor" ,marta@gmail.com, 3, 3, c1);
	
	/*Cliente[] misclientes=new Cliente[10];
	misclientes[0]=new Cliente("3298746M", "Sandra", "Perez", 6, "Mayor", aroa@gmail.com, 3, 3, c2 );
	misclientes[1]=new Cliente("734864H", "Ana", "Sanchez", 6, "Menor", aroa@gmail.com, 3, 3, c2 );
	misclientes[2]=new Cliente("382756F", "Juan", "Diaz", 6, "Menor", aroa@gmail.com, 3, 3, c2 );
	misclientes[3]=new Cliente("328476R", "Marcos", "Martin", 6, "Mayor", aroa@gmail.com, 3, 3, c2 );

	
public static void main(String[] args) throws IOException{
	
	Aparcamiento aparcamiento=new Aparcamiento();
	
	boolean salir=false;
	
	Scanner sc=new Scanner(System.in);
	
	int opcion;
	
	
	
}
	
}*/
	
	
	
	
	
	
	
}	
	
}
