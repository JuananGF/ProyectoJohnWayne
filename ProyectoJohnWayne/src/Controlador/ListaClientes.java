package Controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import Modelo.Cliente;

public class ListaClientes {
	private ArrayList<Cliente> listaCli = new ArrayList<>();

	public void cargarLista() {

	}

	public void escribirNewElemento(Cliente cliente) {
		if (cliente != null) {
			listaCli.add(cliente);
			Collections.sort(getlistaCli(), new Comparator<Cliente>() {
				@Override
				public int compare(Cliente o1, Cliente o2) {
					// Integer valor=new
					// Integer(o1.getNombre().compareTo(o2.getNombre()));
					// System.out.println("valor de la comparacion "+valor);
					// return valor;
					return new Integer(o1.getNombre().compareTo(o2.getNombre()));
				}
			});
		}
	}

	public ArrayList<Cliente> getlistaCli() {
		return listaCli;
	}

	public void setlCliente(ArrayList<Cliente> lCliente) {
		this.listaCli = lCliente;
	}
}
