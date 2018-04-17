package com;

import java.io.Console;

import com.brg.menu.Menu.PARAMETROS;

public class Principal {

	public static void main(String[] args) {
	Console console = System.console();
	String input = "";
	
	if(console  == null) {
		System.err.println("Debe ejecutarse desde consola");
		return;
	}
	
	input = console.readLine("Captura la opcion: ");
	System.out.println("Tu opcion fue:  " + input);
	
	for(PARAMETROS par : PARAMETROS.values()) {
		
		console.printf( par.getDescripcion(), par.getId());		
		
	}

	}

}
