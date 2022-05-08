package ar.unq.poo2.tpSolid.ej2;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	private double saldo;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMensual, double saldo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.saldo = saldo;
	}
	
	public double sueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 11;
	}

	public double getSueldoNetoMensual() {
		return this.sueldoNetoMensual;
	}
	
	public void solicitarCredito(Banco banco, SolicitudDeCredito solicitud) {
		banco.revisarSolicitud(solicitud);
	}
	
	public void recibirCreditoDe(double monto) {
		this.setSaldo(this.getSaldo() + monto);
		
	}

	private void setSaldo(double newSaldo) {
		this.saldo = newSaldo;
	}

	private double getSaldo() {
		return saldo;
	}

	public int getEdad() {
		return this.edad;
	}
}
