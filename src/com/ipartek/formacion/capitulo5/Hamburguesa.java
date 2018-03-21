package com.ipartek.formacion.capitulo5;

public class Hamburguesa {
	public static String[] INGRE = { "pan", "carne", "tomate", "lechuga", "pepino", "queso" };
	public static float[] INGRE_PRECIO = { 0.30f, 0.70f, 0.50f, 0.25f, 0.30f, 0.70f };

	boolean[] ingredientes = new boolean[6];

	public Hamburguesa() {
		super();
		this.ingredientes[0] = true; // pan
		this.ingredientes[1] = true; // carne
	}

	public boolean[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(boolean[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	public float getPrecio() {
		float precio = 0;
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i] == true)
				precio = precio + INGRE_PRECIO[i];
		}
		return precio;

	}

}
