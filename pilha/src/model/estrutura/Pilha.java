package model.estrutura;

import java.lang.Exception;
import model.estrutura.No;

public class Pilha<T>{
	private No<T> ultimo = null;
	
	public void push(T elemento) {
		No<T> novo = new No<>(elemento);
		if(this.ultimo != null){
			No<T> anterior = this.ultimo;
			novo.setAnterior(anterior);
		}
		this.ultimo = novo;
	}
	public No<T> pop() throws Exception{
		if(this.ultimo == null) return null;
		No<T> elemento = this.ultimo;
		this.ultimo = elemento.getAnterior();
		return elemento;
	}
	@Override
	public String toString(){
		if(this.ultimo == null){
			return "[]";
		}
		StringBuilder builder = new StringBuilder("[");
		No<T> memoria = this.ultimo;
		builder.append(memoria.getValor());
		while(memoria.getAnterior() != null){
			builder.append(", ");
			memoria = memoria.getAnterior();
			builder.append(memoria.getValor());
		}
		builder.append("]");
		return builder.toString();
	}
	
}