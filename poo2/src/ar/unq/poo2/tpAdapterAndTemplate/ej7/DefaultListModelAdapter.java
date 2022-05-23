package ar.unq.poo2.tpAdapterAndTemplate.ej7;

import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

public class DefaultListModelAdapter<E> extends DefaultListModel<String>  {

	private ListaDePalabrasOrdenadas list;
	private static final long serialVersionUID = -3519925679910054901L;

	public DefaultListModelAdapter(ListaDePalabrasOrdenadas list){
		this.list = list;
	}
	
	@Override
	public void addElement(String element) {
		this.list.agregarPalabra(element);
		
	}
	
	@Override
	public String getElementAt(int index) {
		return this.list.getPalabraDePosicion(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.list.cantidadDePalabras();
	}

	
	
	
}
