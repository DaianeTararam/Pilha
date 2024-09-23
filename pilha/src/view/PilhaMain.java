package view;

import controller.PilhaController;

public class PilhaMain{
	public static void main(String[] args){
		try{
			PilhaController obj = new PilhaController();
			System.out.println(obj.teste());
		}catch( Exception e){
			e.printStackTrace();
		}
	}
}