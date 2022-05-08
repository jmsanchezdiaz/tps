package ar.unq.poo2.tpSolid.ej1;

import java.util.ArrayList;
import java.util.List;

public class ClienteEmail {
		
	private IServidor servidor;
	private String nombreUsuario;
	private String passusuario;
	private List<Correo> inbox;
	private List<Correo> borrados;
		
	public ClienteEmail(IServidor servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
		
	private String getNombreDeUsuario() {
		return this.nombreUsuario;
	}
		
	private String getPassDeUsuario() {
		return this.passusuario;
	}
		
	private List<Correo> getInbox(){
		return this.inbox;
	}
		
	private List<Correo> getBorrados(){
		return this.borrados;
	}
		
	private IServidor getServidor() {
		return this.servidor;
	}
		
	public void conectar(){
		this.getServidor().conectar(this.getNombreDeUsuario(),this.getPassDeUsuario());
	}
		
	public void borrarCorreo(Correo correo){
		this.getInbox().remove(correo);
		this.getBorrados().add(correo);
	}
		
	public int contarBorrados(){
		return this.getBorrados().size();
	}
		
	public int contarInbox(){
		return this.getInbox().size();
	}
		
	public void eliminarBorrado(Correo correo){
		this.getBorrados().remove(correo);
	}
		
	public void recibirNuevos(){
		this.getServidor().recibirNuevos(this.getNombreDeUsuario(), this.getPassDeUsuario());
	}
		
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.getServidor().enviar(correo);
	}
}
