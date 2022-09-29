package br.com.jeofton.compilador.main;

import br.com.jeofton.compilador.exceptions.LexicalsException;
import br.com.jeofton.compilador.lexico.NossoScanner;
import br.com.jeofton.compilador.lexico.Token;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		NossoScanner ns = new NossoScanner("input.isi");
		Token token = null;
		do {
			 token = ns.nextToken();
			 	if(token !=null) {
			 		System.out.println(token);
			 	}
		}while(token != null);
		}catch (LexicalsException ex){
			System.out.println("Lexical ERROR" + ex.getMessage());
		}catch (Exception ex){
			System.out.println("Generic Error");
		}
	}		
}
