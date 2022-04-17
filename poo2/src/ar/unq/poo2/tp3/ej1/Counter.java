package ar.unq.poo2.tp3.ej1;

import java.util.ArrayList;
import java.util.List;

public class Counter {
 private List<Integer> numeros = new ArrayList<Integer>();
 
 private List<Integer> getNumeros (){
	 return numeros;
 }
 
 public int contarPares() {
	 int cantidadDePares = 0;
	 
	 for (Integer integer : this.getNumeros()) {
		if(integer % 2 == 0) cantidadDePares++;
	}
	 
	return cantidadDePares;
 }
 
 public int contarImpares() {
	 int cantidadDeImpares = 0;
	 
	 for (Integer integer : this.getNumeros()) {
		if(integer % 2 == 1) cantidadDeImpares++;
	}
	 
	return cantidadDeImpares;
 }

 public int contarMultiplo(int x) {
	 int cantidadDeMultiplo = 0;
	 
	 for (Integer integer : this.getNumeros()) {
		if(integer % x  == 0) cantidadDeMultiplo++;
	}
	 
	return cantidadDeMultiplo;
 }

 
 public void addNumber(int newNumber) {
	 this.getNumeros().add(newNumber);
 }
 
 public int calcularMayorNumeroConDigitosPar() {
	 int mayor = 0;
	 
	 for (Integer num : this.getNumeros()) {
		int cantidadActual = this.cantidadDigitosPar(num);
		
		if(cantidadActual > mayor) mayor = cantidadActual;
	}
	 
	 return mayor;
 }
 
 public int cantidadDigitosPar(int num) {
	 int cantidad = 0;
	 int numerosRestantes = num;
	 
	 while(numerosRestantes > 0) {	
		int digito = numerosRestantes % 10;
		
		if(digito % 2 == 0) cantidad++;
		
		numerosRestantes /= 10;
	 }
	 
	 return cantidad;
 }
 
 public int mayorMultiploEntreMil(int x, int y){
     int mayor = 0;
     for (int i = 1000; i > 0; i--) {
         if(i % x == 0 && i % y == 0){
             if(mayor < i) mayor = i;
         }
     }
     return mayor;
 }
}