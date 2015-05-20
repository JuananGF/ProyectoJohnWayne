package Controlador;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.Cliente;

public class ListaClientes {
	private ArrayList<Cliente> lCliente=new ArrayList<>();
	JTextField txtNombre;
	JTextField txtApellidos;
	JTextField txtDNI;
	JTextField txtEdad;
	JTextField txtColorPelo;
	JComboBox combo;
	
	public void cargarLista() {
		for (int i = 0; i < lCliente.size(); i++) {
			combo.addItem(lCliente.get(i).getNombre());
		}
	}

	public void escribirNewElemento() {
		lCliente.add(new Cliente(txtNombre.getText(), txtApellidos.getText(), txtDNI.getText(), Integer.parseInt(txtEdad.getText()), txtColorPelo.getText()));
	}

	public ArrayList<Cliente> getCliente() {
		return lCliente;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.lCliente = cliente;
	}
}
