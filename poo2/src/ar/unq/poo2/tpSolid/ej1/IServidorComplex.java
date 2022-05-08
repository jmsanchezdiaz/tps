package ar.unq.poo2.tpSolid.ej1;

public interface IServidorComplex extends IServidor {
	
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();
}
