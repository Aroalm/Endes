package PrimerosPasos;

public class ArrayForEach {

	public static void main(String[] args) {
		
		String [] paises=new String[8];
		
		paises[0]="Espa�a";
		paises[1]="M�xico";
	    paises[2]="Colombia";
	    paises[3]="Per�";
	    paises[4]="Chile";
	    paises[5]="Argentina";
	    paises[6]="Ecuador";
	    paises[7]="Venezuela";
	   
	    
	    for (int i=0; i<paises.length; i++) {
	    	System.out.println("Pa�s "+ (i+1) + ":" + paises[i]);
	    }
				

	}

}
