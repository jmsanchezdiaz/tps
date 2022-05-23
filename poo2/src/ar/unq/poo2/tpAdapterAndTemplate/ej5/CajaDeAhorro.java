package ar.unq.poo2.tpAdapterAndTemplate.ej5;

public class CajaDeAhorro extends CuentaBancaria{
    private int limite;
    
    public CajaDeAhorro(String titular,int limite){
        super(titular);
        this.limite=limite;
    }
    
    public int getLimite(){
        return this.limite;
    }

	@Override
	public boolean validarMonto(double monto) {
		return this.getSaldo()>=monto && this.getLimite()>=monto;
	}
    
}