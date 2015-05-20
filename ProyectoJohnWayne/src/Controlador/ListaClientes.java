package Controlador;

import java.util.ArrayList;

import Modelo.Cliente;

public class ListaClientes {
	private ArrayList<Cliente> lCliente = new ArrayList<>();

	public void cargarLista() {
		
	}

	public void escribirNewElemento(Cliente cliente) {
		lCliente.add(cliente);
	}

	public ArrayList<Cliente> getlCliente() {
		return lCliente;
	}

	public void setlCliente(ArrayList<Cliente> lCliente) {
		this.lCliente = lCliente;
	}
}
