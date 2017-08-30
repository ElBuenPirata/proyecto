package com.proyecto.entity;

public class Descarga {

	private String link;
	private String nombre_pagina;
	public Descarga(String link, String nombre_pagina) {
		
		this.link = link;
		this.nombre_pagina = nombre_pagina;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getNombre_pagina() {
		return nombre_pagina;
	}
	public void setNombre_pagina(String nombre_pagina) {
		this.nombre_pagina = nombre_pagina;
	}
	@Override
	public String toString() {
		return "Descarga [link=" + link + ", nombre_pagina=" + nombre_pagina + "]";
	}
	
	
	
}
