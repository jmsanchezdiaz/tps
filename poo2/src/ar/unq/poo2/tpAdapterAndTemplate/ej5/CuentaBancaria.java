package ar.unq.poo2.tpAdapterAndTemplate.ej5;

import java.util.ArrayList;
import java.util.List;

// Clase abstracta
public abstract class CuentaBancaria{
    private String titular;
    private int saldo;
    private List<String>movimientos;
    
    public CuentaBancaria(String titular){
        this.titular=titular;
        this.saldo=0;
        this.movimientos=new ArrayList<String>();
    }
    
    public String getTitular(){
    	return this.titular;
    }
        
   public int getSaldo(){
	   return this.saldo;
   }
   
   //Concrete
   protected void setSaldo(int monto){
	   this.saldo=monto;
   }
   
   //Concrete
   public void agregarMovimientos(String movimiento){
	   this.movimientos.add(movimiento);
   }
   
   //Native
   public abstract boolean validarMonto(double monto);
   
   //Template
   public void extraer(int monto) {
	   if(this.validarMonto(monto)) {
		   this.setSaldo(this.getSaldo() - monto);
		   this.agregarMovimientos("Extraccion");
	   }
   };
}