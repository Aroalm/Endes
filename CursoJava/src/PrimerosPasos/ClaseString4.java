package PrimerosPasos;

public class ClaseString4 {

	public static void main(String[] args) {
		
		String alumno1, alumno2;
		
		alumno1="David";
		alumno2="David";
		
		//true
		
		
		/*alumno1="David";
		*alumno2="david";
		*false
		*/
		
		System.out.println(alumno1.equals(alumno2));
		
		
		//utilizando IgnoreCase no tiene en cuenta las mayusculas
		
		alumno1="David";
		alumno2="david";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));
		
			
		

	}

}
