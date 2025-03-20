package es.examen.segundaparte;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;



public class EjercicioFicheros {

	public static void main(String[] args) {
		
		String nombreArchivo = "C:\\FicheroEjercicio2.txt";
		EjercicioFicheros ef = new EjercicioFicheros();
         try {
			System.out.println(ef.leerArchivo3(nombreArchivo));
		} catch (IOException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			ef.contarLineas(nombreArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			ef.buscarPalabra(nombreArchivo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  
        
    }
	
	//======================================METODOS=======================================================================

	public String leerArchivo3(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		StringBuilder sb = new StringBuilder();

		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			sb.append(linea + "\n");
		}

		return sb.toString();
	}

	public void contarLineas(String nombre) throws IOException {
		Path path = Paths.get(nombre);

		int contador = 0;
		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			contador++;

		}
		System.out.println("El archivo seleccionado tiene " + contador + " lineas");

	}
	public void buscarPalabra(String nombre) throws IOException {
		Path path = Paths.get(nombre);
		String palabra = "java";
		int contador = 0;
		List<String> lines = Files.readAllLines(path);
		for (String linea : lines) {
			String[] palabras = linea.split(" ");
			for (String palabraLinea : palabras) {
				if(palabraLinea.toLowerCase().contains(palabra))
				contador++;		
			}
		}
			
		System.out.println("El archivo seleccionado tiene "+contador+" veces la palabra "+palabra);
	
		}
	
}
