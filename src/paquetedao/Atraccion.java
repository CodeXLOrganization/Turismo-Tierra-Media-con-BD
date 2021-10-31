package paquetedao;

import paquete.TipoAtraccion;

public class Atraccion {
	
	private int id;
	private String nombre;
	private TipoAtraccion tipo;
	private double tiempo;
	private double costo;
	private int cupo;
	
	public Atraccion(int id, String nombre, TipoAtraccion tipo, double tiempo, double costo, int cupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.tiempo = tiempo;
		this.costo = costo;
		this.cupo = cupo;
	}

	@Override
	public String toString() {
		return "Atraccion [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", tiempo=" + tiempo + ", costo="
				+ costo + ", cupo=" + cupo + "]";
	}

	public int getCupo() {
		return cupo;
	}

	public int getId() {
		return id;
	}
	

}
