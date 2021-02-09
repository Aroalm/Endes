package poo;

public class Pruebas {

	public static void main(String[] args) {
		
		Empleados trabajador1=new Empleados("Paco");
		
		Empleados trabajador2=new Empleados("Ana" );
		
		Empleados trabajador3=new Empleados("Maria" );
		
		trabajador1.cambiaseccion("RRHH");
		//trabajador1.cambiaNombre("Maria");

		System.out.println(trabajador1.devuelvedatos());
		
		System.out.println(trabajador2.devuelvedatos());
		
		System.out.println(trabajador3.devuelvedatos());
	
		System.out.println(trabajador1.devuelvedatos()+ "\n"  + trabajador2.devuelvedatos() + "\n" + trabajador3.devuelvedatos());
		
		System.out.println(Empleados.dameIdsiguiente());
	}

}


class Empleados{
	
	public Empleados(String nom){ 
		
		nombre=nom;
		seccion="administracion";
		Id=Idsiguiente;
		Idsiguiente++;
		
	
	}
	
	public void cambiaseccion(String seccion) {   //setter
		
		this.seccion=seccion;
	}
	
	/*public void cambiaNombre(String nombre) {
		this.nombre=nombre;
	}*/
	public String devuelvedatos() {     //getter
		return "El nombre es "+ nombre+ " y la seccion es "+ seccion + " y el Id= "+ Id;
	}
	
	public static String dameIdsiguiente() {
		return "El IdSiguiente es: "+ Idsiguiente ;
	}
	private final String nombre;  //Final lo convierte en una constante y el valor de nombre no puede ser cambiado.
	private String seccion;
	private int Id; //Al añadir static hacemos que un unico campo id es compartido por todos los objetos para poder incrementarla de uno en uno.
	private static int Idsiguiente=1;
}
