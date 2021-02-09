package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		/*Empleado empleado1=new Empleado("Paco Gomez", 85000, 1990,12,17);
		
		Empleado empleado2=new Empleado("Ana Lopez", 95000, 1995,6,2);
		
		Empleado empleado3=new Empleado("Maria Martin", 105000, 2002, 3,15);
		
		empleado1.subesueldo(5);
		empleado2.subesueldo(5);
		empleado3.subesueldo(5);
		
		System.out.println("Nombre:"+ empleado1.dameNombre()+ " Sueldo:" + empleado1.damesueldo()+ " Fecha de alta:"+ empleado1.Damefechacontrato());
		
		System.out.println("Nombre:"+ empleado2.dameNombre()+ " Sueldo:"+empleado2.damesueldo()+ " Fecha de alta:"+ empleado2.Damefechacontrato());
		
		System.out.println("Nombre:"+ empleado3.dameNombre()+ " Sueldo:" + empleado3.damesueldo()+ " Fecha de alta:"+ empleado3.Damefechacontrato());
	}

}*/
	
	Jefatura  jefe_RRHH=new Jefatura("Juan", 55000, 2006, 9, 25 );
	
	jefe_RRHH.estableceincentivo(2570);
	
	Empleado[] misEmpleados=new Empleado[6];
			
	misEmpleados[0]=new Empleado("Paco Gomez", 85000, 1990, 12, 17);
	misEmpleados[1]=new Empleado("Ana Lopez", 95000, 1995, 6, 2);
	misEmpleados[2]=new Empleado("Maria Martin", 105000, 2002, 3, 15);
	misEmpleados[3]=new Empleado("Antonio Fernandez", 47500, 2009, 11, 9);
	misEmpleados[4]=jefe_RRHH; //Polimorfismo. Principio de sustitución.
	misEmpleados[5]=new Jefatura("Sandra", 95000, 1999, 5, 26);
	
	Jefatura jefa_finanzas=(Jefatura) misEmpleados[5];
	
	jefa_finanzas.estableceincentivo(55000);
	
	
	
	/* 
	 *  for (Empleado e: misEmpleados){
	 * 
	 *   e.subesueldo(5);
	 *   }
	 *   
	 *   for (Empleado e: misEmpleados){
	 *   System.out.printlm(" Nombre: "+ e.damenombre()
	 *                      +" Sueldo: "+ e.damesueldo()
	 *                      + " Fecha de alta: " + e.damefechacontrato());
	 *  }
	 *  
	 *   */
	
	for(int i=0; i<6; i++) {
		misEmpleados[i].subesueldo(5);
	}
	for(int i=0;i<6;i++) {
		System.out.println("Nombre: "+ misEmpleados[i].dameNombre()+ " Sueldo: "+ misEmpleados[i].damesueldo()+ " Fecha de alta: " + misEmpleados[i].Damefechacontrato());
	}
}

}
	

class Empleado{
	
	public Empleado(String nom, double sue,int año, int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		GregorianCalendar calendario=new GregorianCalendar(año, mes-1, dia);
		
		altacontrato=calendario.getTime();
		
		++Idsiguiente;
		
		Id=Idsiguiente;
		
		
	}
	
	public Empleado(String nom) {
	
		this(nom,30000, 2000, 01, 01);
	}
	
	public String dameNombre() { //getter
		
		return nombre + " Id: "+ Id;
	}
	
	public double damesueldo() {  //getter
		
		return sueldo;
	}
	
	public Date Damefechacontrato() {  //getter
		
		return altacontrato;
	}
	
	public void subesueldo(double porcentaje) {  //setter
		
		double aumento=sueldo*porcentaje/100;
		
		sueldo+=aumento;
		
	}
	
	private String nombre;
	private double sueldo;
	private Date altacontrato;
	private int Id; //Al añadir static hacemos que un unico campo id es compartido por todos los objetos para poder incrementarla de uno en uno.
	private static int Idsiguiente;
}


final class Jefatura extends Empleado{
	
	public Jefatura(String nom, double sue, int año, int mes, int dia) {
		
		super(nom, sue, año, mes, dia); //llama a la clase padre
	}
	public void estableceincentivo(double b) {  //setter
		
		incentivo=b;
	}
	
	public double damesueldo() {
		
		double sueldojefe=super.damesueldo();
		
		return sueldojefe+incentivo;
	}
	
	private double incentivo;
		
}

/*class Director extends Jefatura{ No puede heredar de la clase Jefatura ya que esta
 *                                tiene añadida la clave final
	
	public Director(String nom, double sue, int año, int mes, int dia ) {
		
		super(nom, sue, año, mes, dia);*/



