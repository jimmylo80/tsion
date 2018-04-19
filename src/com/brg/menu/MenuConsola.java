package com.brg.menu;

import java.util.ArrayList;
import java.util.List;

import com.brg.dto.InfoOpcionDTO;

public class MenuConsola {
	
	public enum MenuPrincipal {
		TITULO(0, 0, "Accion"), 
		AGREGAR(1, 1, "Agregar"), 
		ELIMINAR(2, 2, "Eliminar"),
		SALIR(-1, -1,"Salir");
		

		Integer id;
		Integer opcion;
		String descripcion;
		List<InfoOpcionDTO> list;

		MenuPrincipal(Integer id, Integer opcion ,String descripcion) {
			this.id = id;
			this.descripcion = descripcion;
			this.opcion = opcion;
		}
		
		public Integer getId() {
			return id;
		}

		public String getDescripcion() {
			return descripcion;
		}
		
		public Integer getOpcion() {
			return opcion;
		}

		public List<InfoOpcionDTO> getListValues() {
			list = new ArrayList<InfoOpcionDTO>(); 
			for(MenuPrincipal par: MenuPrincipal.values()) {
				InfoOpcionDTO dto = new InfoOpcionDTO();
				dto.setId(par.getId());
				dto.setDescripcion(par.getDescripcion());
				list.add(dto);
			}
			return list;			
		}
	}
	
	public enum MenuA {
		
		PARAMETROS(1, "Parametros"),
		SALIR(-1,"Salir");;

		Integer id;
		String descripcion;
		List<InfoOpcionDTO> list;
		
		MenuA(Integer id, String descripcion) {
			this.id = id;
			this.descripcion = descripcion;			
		}
		
		public Integer getId() {
			return id;
		}

		public String getDescripcion() {
			return descripcion;
		}
		
		public List<InfoOpcionDTO> getListValues() {
			list = new ArrayList<InfoOpcionDTO>(); 
			for(MenuA par: MenuA.values()) {
				InfoOpcionDTO dto = new InfoOpcionDTO();
				dto.setId(par.getId());
				dto.setDescripcion(par.getDescripcion());
				list.add(dto);
			}
			return list;			
		}		
	}

	public static enum Parametros{
		TITULO(0, "Tipo"),
		ELABORO(1, "Elaboro"), 
		LIDER_DESARROLLO(2, "Lider Desarrollo"),
		GERENTE_AREA(3, "Gerente del Area"),
		USUARIO(4, "Usuario"),
		PERSONA_AUTORIZA(5, "Persona Autorizo"),
		RESPONSABLE(6, "Responsable"),
		LIDER_PRUEBAS(7, "Lider Pruebas"),
		CONTROL_CALIDAD(8, "Control de Calidad"),
		ARQUITECTURA(9, "Arquitectura"),
		EXAMINADOR(10, "Examinador"),
		VENTANILLA(11, "Ventanilla"),
		JAVA(12, "Java"),
		ASESOR(13, "Asesor"),
		ID_PROYECTO(14, "Id Proyecto"),
		NOMBRE_PROYECTO(15, "Nombre del proyecto"),
		CONTROL_DE_CAMBIOS(16, "Control de cambios"),
		SALIR(-1,"Salir");

		String descripcion;
		Integer id;
		List<InfoOpcionDTO> list;

		Parametros( Integer id, String descripcion) {
			this.descripcion = descripcion;
			this.id = id;
		}
		
		public String getDescripcion() {
			return this.descripcion;
		}
		
		public Integer getId() {
			return this.id;			
		}
		
		public List<InfoOpcionDTO> getListValues() {
			list = new ArrayList<InfoOpcionDTO>(); 
			for(Parametros par: Parametros.values()) {
				InfoOpcionDTO dto = new InfoOpcionDTO();
				dto.setId(par.getId());
				dto.setDescripcion(par.getDescripcion());
				list.add(dto);
			}
			return list;			
		}		
	}
	
	


}
