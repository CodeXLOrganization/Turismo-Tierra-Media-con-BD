package promociones;

import java.util.ArrayList;

import paquete.Atraccion;
import paquete.Promocion;
import paquete.TipoAtraccion;

public class PromocionesAbsolutas extends Promocion {
	
	private double costo;

	public PromocionesAbsolutas(ArrayList<Atraccion> packAbsoluta, String nombre, TipoAtraccion tipo, double costo) {
		super(packAbsoluta, nombre, tipo);
		this.costo = costo;
	}

	@Override
	public double getCosto() {
		return costo;
	}

	@Override
	public String getNombre() {
		String listaAtracciones = "";
		listaAtracciones = super.toString();
		return listaAtracciones;
	}



}
