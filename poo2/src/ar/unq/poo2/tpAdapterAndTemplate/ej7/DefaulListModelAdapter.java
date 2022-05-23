package ar.unq.poo2.tpAdapterAndTemplate.ej7;

import javax.swing.DefaultListModel;

public class DefaulListModelAdapter extends DefaultListModel<String> {

	private ListaDePalabrasOrdenadas list;
	private static final long serialVersionUID = -3519925679910054901L;

	public DefaulListModelAdapter(ListaDePalabrasOrdenadas list){
		this.list = list;
	}
	
	@Override
	public void addElement(String element) {
		this.list.agregarPalabra(element);
	}
	
	@Override
	public String get(int index) {
		return this.list.getPalabraDePosicion(index);
	}
	
}
