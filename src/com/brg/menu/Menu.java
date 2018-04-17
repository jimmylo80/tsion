package com.brg.menu;

public class Menu {

	public static enum PARAMETROS {
		ELABORO("Elaboro", 1), 
		LIDER_DESARROLLO("Lider Desarrollo", 2),
		GERENTE_AREA("Gerente del Area", 3),
		USUARIO("Usuario",4),
		PERSONA_AUTORIZA("Persona Autorizo", 5),
		RESPONSABLE("Responsable", 6),
		LIDER_PRUEBAS("Lider Pruebas",7),
		CONTROL_CALIDAD("Control de Calidad", 8),
		ARQUITECTURA("Arquitectura", 9),
		EXAMINADOR("Examinador",10),
		VENTANILLA("Ventanilla", 11),
		JAVA("Java", 12),
		ASESOR("Asesor", 13),
		ID_PROYECTO("Id Proyecto",14),
		NOMBRE_PROYECTO("Nombre del proyecto", 15),
		CONTROL_DE_CAMBIOS("Control de cambios", 16);

		String descripcion = "";
		Integer id = 0;

		PARAMETROS(String descripcion, Integer id) {
			this.descripcion = descripcion;
			this.id = id;
		}
		
		public String getDescripcion() {
			return this.descripcion;
		}
		
		public Integer getId() {
			return this.id;
		}
	}

}
