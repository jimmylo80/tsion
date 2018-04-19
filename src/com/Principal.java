package com;

import java.io.Console;
import java.util.List;

import com.brg.dto.InfoOpcionDTO;
import com.brg.menu.MenuConsola.MenuPrincipal;
import com.brg.menu.MenuConsola.Parametros;

public class Principal {

	public static void main(String[] args) {
		Console console = System.console();
		String input = "";

		if (console == null) {
			System.err.println("Debe ejecutarse desde consola");
			return;
		}
		
		
		do {
			showOptios(console, MenuPrincipal.TITULO.getListValues());
			input = console.readLine("Captura la opcion: ");
			
		}while(1==1);
		
		
		

		 input = console.readLine("Captura la opcion: ");
		 
		 showOptios(console, Parametros.TITULO.getListValues());
		 
		 
		 
		// System.out.println("Tu opcion fue: " + input);
		// String fmt = "%1$4s %2$10s %3$10s%n";		
		// console.printft(fmt, "Items", "Quanity", "Price");
		// console.printft(fmt, "-----", "-----", "-----");
		// console.printft(fmt, "Tomato", "1Kg", "15");
		// console.printft(fmt, "Potato", "5Kg", "50");
		// console.printft(fmt, "Onion", "2Kg", "30");
		// console.printft(fmt, "Apple", "4Kg", "80");		

	}

	private static void showOptios(Console console, List<InfoOpcionDTO> list) {
		for (InfoOpcionDTO infoOpcionDTO : list) {
			if (infoOpcionDTO.getId() != 0) {
				console.printf(infoOpcionDTO.getId() == 1 ? "%n%s.- %s%n " : "%s.- %s%n ", infoOpcionDTO.getId(), infoOpcionDTO.getDescripcion());
			} else {
				console.printf("%n**** %s **** %n%n", infoOpcionDTO.getDescripcion());

			}
		}
	}

}
