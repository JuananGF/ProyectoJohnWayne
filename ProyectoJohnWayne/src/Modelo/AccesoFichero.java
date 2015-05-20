package Modelo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class AccesoFichero {

	public static ArrayList<Object> leerFichero(String ruta) throws IOException{
		String cadena = new String("");
		
		FileInputStream archivoR = new FileInputStream(cadena.concat(ruta + ".obj"));
		BufferedInputStream buffer = new BufferedInputStream(archivoR);
		DataInputStream adaptadorR = new DataInputStream(buffer);
		
		//ArrayList<Object> listaR = ;
		
		
		System.out.println("El valor almacenado es: ");	
		
		return null;
		
	}
	
	public static void escribirFichero(String ruta, Object obj) throws IOException{
		
		String cadena = new String("");
		
		FileOutputStream archivoW = new FileOutputStream(cadena.concat(ruta + ".obj"));
		
		BufferedOutputStream bufferW = new BufferedOutputStream(archivoW);
		
		DataOutputStream conversorW = new DataOutputStream(bufferW);
		
		
		
	}
}
