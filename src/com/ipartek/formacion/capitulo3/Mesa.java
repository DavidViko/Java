//1. Definición paquete Package
package com.ipartek.formacion.capitulo3;

//2. Imports

//3. Definición de la clase
public class Mesa {

	// Por defecto de 4 patas, blanco, madera y 1 metro cuadrado

	// precios en €
	final int PRECIO_PATA = 1;
	final int PRECIO_M2 = 5;
	final int PRECIO_MATERAL_MADERA = 4;
	final int PRECIO_MATERAL_ACERO = 6;
	final int PRECIO_MATERAL_ALUMINIO = 5;
	final int PRECIO_MATERAL_PLASTICO = 2;
	final int PRECIO_COLOR_CUSTOM = 23;
	final String PRECIO_COLOR_NAME_CUSTOM = "custom";

	final int MATERIAL_MADERA = 1;
	final int MATERIAL_ACERO = 2;
	final int MATERIAL_ALUMINIO = 3;
	final int MATERIAL_PLASTICO = 4;

	// 4. Atributos. Siempre PRIVATE para mantener la encapsulación
	private int numeroPatas;
	private int dimension;// metros cuadrados
	private String color;
	private int material;

	/*
	 * 5. Métodos 5.1 Constructores 5.2 Getters y setters 5.3 Otros
	 */

	public Mesa() {
		super();
		setNumeroPatas(4);
		setColor("blanco");
		setDimension(1);
		setMaterial(1);
	}

	/**
	 * Sirve para documentar con Javadoc
	 * 
	 * @param numeroPatas
	 * @author Curso
	 */
	public Mesa(int numeroPatas) {
		super();
		// this.numeroPatas = numeroPatas;
		setNumeroPatas(numeroPatas);
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = (numeroPatas < 0) ? 0 : numeroPatas;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getMaterial() {
		return material;
	}

	public void setMaterial(int material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Mesa [PRECIO_PATA=" + PRECIO_PATA + ", PRECIO_M2=" + PRECIO_M2 + ", PRECIO_MATERAL_MADERA="
				+ PRECIO_MATERAL_MADERA + ", PRECIO_MATERAL_ACERO=" + PRECIO_MATERAL_ACERO
				+ ", PRECIO_MATERAL_ALUMINIO=" + PRECIO_MATERAL_ALUMINIO + ", PRECIO_MATERAL_PLASTICO="
				+ PRECIO_MATERAL_PLASTICO + ", PRECIO_COLOR_CUSTOM=" + PRECIO_COLOR_CUSTOM
				+ ", PRECIO_COLOR_NAME_CUSTOM=" + PRECIO_COLOR_NAME_CUSTOM + ", MATERIAL_MADERA=" + MATERIAL_MADERA
				+ ", MATERIAL_ACERO=" + MATERIAL_ACERO + ", MATERIAL_ALUMINIO=" + MATERIAL_ALUMINIO
				+ ", MATERIAL_PLASTICO=" + MATERIAL_PLASTICO + ", numeroPatas=" + numeroPatas + ", dimension="
				+ dimension + ", color=" + color + ", material=" + material + "]";
	}

	public int getPrecio() {
		int precio = 0;
		return precio;
	}
}
