package pruebas;

import java.io.FileNotFoundException;
import java.io.IOException;

import Controlador.ListaClientes;
import Modelo.Cliente;

public class principal {
	public static void main(String[] args) {
		ListaClientes lc = new ListaClientes();
		try {
			lc.cargarLista();
			// lc.escribirNewElemento("Juan Antonio", "Garcia", "1", 19,
			// "Castaño");
			// lc.escribirNewElemento("Angel", "Valverde", "2", 23, "Castaño");
			Cliente cliente = lc.buscarCliente("2");
			System.out.println(cliente.getNombre());
			lc.listarCliente();
			
			cliente.setColorPelo("Negro");
			lc.modificarElemento(cliente);
			lc.listarCliente();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
