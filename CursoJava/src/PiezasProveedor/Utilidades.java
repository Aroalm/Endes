package PiezasProveedor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class Utilidades {
	//Texto
	private PrintWriter salida;
	private File ficheroTexto;
	private Scanner entrada;
	//Objetos
	private FileOutputStream ficherOutput;
	private FileInputStream ficheroInput;
	private ObjectOutputStream salidaObjetos;
	private ObjectInputStream entradaObjetos;
	
	
	//Fichero csv de piezas
	public void crearCsvPiezas(String nombre) throws FileNotFoundException {
		this.ficheroTexto=new File(nombre);
		this.salida=new PrintWriter(ficheroTexto);
		
	}
	/*public void guardarPieza(Pieza p) {
		if(this.salida!=null)
			this.salida.println(p.getCod_pieza()+";"+p.getNombre()+";"+p.getCod_proveedor()+";"+p.getPeso());
	}
	public void cerrarCsvPiezas() {
		salida.close();
	}
	
	public ArrayList<Pieza> leerPiezas(String file) throws FileNotFoundException {
		this.ficheroTexto=new File(file);
		this.entrada=new Scanner(ficheroTexto);
		Pieza p=null;
		String cadena;
		String []linea;
		ArrayList<Pieza> lista=new ArrayList<Pieza>();
		//Leo una línea
		cadena=entrada.nextLine();
		
		while(cadena!=null) {
						
			linea=cadena.split(";");
			lista.add(new Pieza(Integer.parseInt(linea[0]),linea[1],Integer.parseInt(linea[2]), Double.parseDouble(linea[3])));
			try {
				cadena=entrada.nextLine();
			}catch(Exception e) {
				cadena=null;
			}
		}
		entrada.close();
		
		return lista;
		
	}
	
	public ArrayList<Proveedor> listaProveedor(String file) throws IOException{
		ArrayList<Proveedor> lista=new ArrayList<>();
		this.ficheroInput=new FileInputStream(file);
		this.entradaObjetos=new ObjectInputStream(ficheroInput);
		Proveedor p=new Proveedor(0,"", "");
		do {
			
			try {
				p=(Proveedor)entradaObjetos.readObject();
				
			}catch(Exception e) {
				//System.out.println("Fin de fichero");
				p=null;
			}
			if(p!=null)
				lista.add(p);
		}while(p!=null);
		
		return lista;
	}
	
	
	public void crearFicheroProveedor(String nombre) throws IOException {
		this.ficherOutput=new FileOutputStream(nombre);
		this.salidaObjetos=new ObjectOutputStream(ficherOutput);
	}
	
	public void guardarProveedor(Proveedor p) throws IOException {
		if(p!=null)
			salidaObjetos.writeObject(p);
	}
	
	public void cerrarFicheroProveedor() throws IOException {
		if(salidaObjetos!=null)
			salidaObjetos.close();
	}
	
	public static void main(String[] args) throws IOException {
		Pieza p=new Pieza(100, "Tornillo", 10, 3);
		Pieza p1=new Pieza(200, "Tuerca", 11, 2);
		Pieza p2=new Pieza(300, "Clavo", 10, 5);
		Pieza p3=new Pieza(400, "Arandela", 11, 1);
		
		Utilidades u=new Utilidades();
		
		//Crear un fichero de texto
		u.crearCsvPiezas("piezas.csv");
		u.guardarPieza(p);
		u.guardarPieza(p1);
		u.guardarPieza(p2);
		u.guardarPieza(p3);
		u.cerrarCsvPiezas();
		
		//Crear un fichero de objetos		
		Proveedor pro=new Proveedor(10, "Suministros Ribera", "Talavera");
		Proveedor pro1=new Proveedor(11, "Ferretería Talavera", "Talavera");
		u.crearFicheroProveedor("proveedor.prov");
		u.guardarProveedor(pro);
		u.guardarProveedor(pro1);
		u.cerrarFicheroProveedor();
		
		
		//Leer de un fichero de texto y obtener un AL de piezas
		ArrayList<Pieza> listapiezas=new ArrayList<>();
		listapiezas=u.leerPiezas("piezas.csv");
		System.out.println(listapiezas);
		
		ArrayList<Proveedor> listaprov=new ArrayList<>();
		listaprov=u.listaProveedor("proveedor.prov");
		System.out.println(listaprov);
	
		
		
		for (Proveedor prov : listaprov) {
			System.out.println(prov.getNombre_proveedor()+" suministra: ");
			for (Pieza pi : listapiezas) {
				if(prov.getCod_proveedor()==pi.getCod_proveedor())
					System.out.println("\t"+pi.getCod_pieza()+" "+pi.getNombre());
			}
		}
	}*/
}

