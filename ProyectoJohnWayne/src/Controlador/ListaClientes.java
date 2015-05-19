package Controlador;

import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JTextField;

import Modelo.Cliente;

public class ListaClientes {
	ArrayList<Cliente> cliente=new ArrayList<>();
	JTextField txtNombre;
	JTextField txtApellidos;
	JTextField txtDNI;
	JTextField txtEdad;
	JTextField txtColorPelo;
	JComboBox combo;
	public void cargarLista() {
		for (int i = 0; i < cliente.size(); i++) {
			combo.addItem(cliente.get(i).getNombre());
		}
	}

	public void escribirNewElemento() {
		
		cliente.add(new Cliente(txtNombre.getText(), txtApellidos.getText(), txtDNI.getText(), Integer.parseInt(txtEdad.getText()), txtColorPelo.getText()));
	}
}
