package controller;

import model.estrutura.Pilha;
import model.estrutura.No;

public class PilhaController{
	public PilhaController(){
		super();
	}
	
	public String teste() throws Exception{
		Pilha pilha = new Pilha();
		
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.pop();
		pilha.push(10);
		return pilha.toString();
	}
}