package ar.unq.poo2.tpSolid.ej2;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes;

	public Banco() {
		this.clientes = new ArrayList<Cliente>();
	}
	
	public void registrarCliente(Cliente cliente) {
		this.getClientes().add(cliente);
	}
	
	public void revisarSolicitud(SolicitudDeCredito solicitud) {
		if(solicitud.esValida()) {
			this.otorgarCredito(solicitud);
		}
	}

	public void otorgarCredito(SolicitudDeCredito solicitud) {
		solicitud.getCliente().recibirCreditoDe(solicitud.getMonto());
	}

	private List<Cliente> getClientes() {
		return this.clientes;
	}
}
