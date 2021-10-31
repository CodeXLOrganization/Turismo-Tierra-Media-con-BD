package paquetedao;

import java.util.List;

import paquete.TipoAtraccion;

public class Promocion {
	private int id;
	private List<Atraccion> atracciones;
	private TipoPromocion tipo;
	private String nombre;
	
	public Promocion(int id, List<Atraccion> atracciones, TipoPromocion tipo, String nombre) {
		this.id = id;
		this.atracciones = atracciones;
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	public void setAtracciones(List<Atraccion> atracciones) {
		this.atracciones = atracciones;
	}

}
