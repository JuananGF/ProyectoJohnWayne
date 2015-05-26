package Controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Modelo.AccesoFichero;
import Modelo.Cliente;

public class ListaClientes {
	private ArrayList<Cliente> listaCli = new ArrayList<>();
	final String fichero = "clientes.dat";

	public void cargarLista() throws ClassNotFoundException, IOException {
		setListaCli((ArrayList<Cliente>) new AccesoFichero().leerObjeto(fichero));
	}

	public void escribirNewElemento(String nombre, String apellidos, String dni, int edad, String colorPelo)
			throws IOException, FileNotFoundException {
		Cliente cliente = new Cliente(nombre, apellidos, dni, edad, colorPelo);
		//idea buscarcliente
		if (cliente.getNombre() != null) {
			listaCli.add(cliente);
			Collections.sort(getListaCli(), new Comparator<Cliente>() {
				@Override
				public int compare(Cliente o1, Cliente o2) {

					return new Integer(o1.getApellidos().compareTo(o2.getApellidos()));
				}
			});
		}
		new AccesoFichero().escribirObjeto(fichero, getListaCli());
	}

	public void modificarElemento(Cliente cliente) {
		int posicionLista = getListaCli().indexOf(cliente);
		getListaCli().set(posicionLista, cliente);
		try {
			// Guarda la lista existente con el articulo modificado
			escribirNewElemento(null, null, null, 0, null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void listarCliente() {
		for (Cliente cliente : listaCli) {
			System.out.println(cliente.getNombre() + " " + cliente.getApellidos() + " " + cliente.getDni() + " "
					+ cliente.getEdad() + " " + cliente.getColorPelo());
		}
		System.out.println();
	}

	public Cliente buscarCliente(String dni) throws ClassNotFoundException, IOException {
		cargarLista();
		Cliente clienteEncontrado = null;
		for (Cliente listaCli : listaCli) {
			if (listaCli.getDni().equals(dni)) {
				clienteEncontrado = listaCli;
			}
		}
		return clienteEncontrado;
	}

	public ArrayList<Cliente> getListaCli() {
		return listaCli;
	}

	public void setListaCli(ArrayList<Cliente> lCliente) {
		this.listaCli = lCliente;
	}
}
