package Controlador;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Modelo.AccesoFichero;
import Modelo.Articulo;
import Modelo.Cliente;

public class ListaClientes {
	private ArrayList<Cliente> listaCli = new ArrayList<>();
	final String fichero = "clientes.dat";

	public void cargarLista() throws ClassNotFoundException, IOException {
		setListaCli((ArrayList<Cliente>) new AccesoFichero().leerObjeto(fichero));
	}

	public void escribirNewElemento(String nombre, String apellidos, String dni, String edad, String colorPelo)
			throws IOException, FileNotFoundException {
		Cliente cliente = new Cliente(nombre, apellidos, dni, Integer.parseInt(edad), colorPelo);
		if (cliente != null) {
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

	private void modificarElemento(Cliente cliente) {
		int posicionArticuloEnLaLista = getListaCli().indexOf(cliente);
		getListaCli().set(posicionArticuloEnLaLista, cliente);
		try {
			// Guarda la lista existente con el articulo modificado
			escribirNewElemento(null, null, null, null, null);
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
		// for (int i = 0; i < getListaCli().size(); i++) {
		// System.out.println(getListaCli().get(i).getNombre() + " " +
		// getListaCli().get(i).getApellidos() + " "
		// + getListaCli().get(i).getDni() + " " +
		// getListaCli().get(i).getEdad() + " "
		// + getListaCli().get(i).getColorPelo());
		// }
		System.out.println();
	}

	public Cliente buscarCliente(String cliente) throws ClassNotFoundException, IOException {
		cargarLista();
		Cliente clienteEncontrado = null;
		for (Cliente listaCli : listaCli) {
			if (listaCli.getDni().equals(cliente)) {
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
