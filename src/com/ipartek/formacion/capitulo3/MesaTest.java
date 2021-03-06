package com.ipartek.formacion.capitulo3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MesaTest {

	@Test
	public void testMesa() {
		Mesa mesa = new Mesa();
		assertEquals("Patas deber�an ser 4 por defecto", 4, mesa.getNumeroPatas());
		assertEquals("blanco", mesa.getColor());
		assertEquals(1, mesa.getDimension());
		assertEquals(Mesa.MATERIAL_MADERA, mesa.getMaterial());
	}

	@Test
	public void testMesaInt() {
		final int MATERIAL_NO_EXISTENTE = -1;

		Mesa mesa = new Mesa(MATERIAL_NO_EXISTENTE);
		assertEquals(MATERIAL_NO_EXISTENTE, mesa.getMaterial());
	}

	@Test
	public void testSetNumeroPatas() {
		Mesa mesa = new Mesa();
		mesa.setNumeroPatas(5);
		assertEquals(5, mesa.getNumeroPatas());

		mesa.setNumeroPatas(0);
		assertEquals(1, mesa.getNumeroPatas());

		mesa.setNumeroPatas(-5);
		assertEquals(1, mesa.getNumeroPatas());

	}

	@Test
	public void testGetPrecio() {
		final int PRECIO_BASE = 13;
		int precio = 0;

		Mesa mesa = new Mesa();
		assertEquals(PRECIO_BASE, mesa.getPrecio());

		// Comprobacion de colores
		mesa.setColor(Mesa.PRECIO_COLOR_NAME_CUSTOM);
		assertEquals((PRECIO_BASE + Mesa.PRECIO_COLOR_CUSTOM), mesa.getPrecio());
		mesa.setColor("rojo");
		assertEquals((PRECIO_BASE), mesa.getPrecio());

		// Comprobacion de materiales
		mesa.setMaterial(Mesa.MATERIAL_ACERO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ACERO;
		assertEquals(precio, mesa.getPrecio());

		mesa.setMaterial(Mesa.MATERIAL_ALUMINIO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_ALUMINIO;
		assertEquals(precio, mesa.getPrecio());

		mesa.setMaterial(Mesa.MATERIAL_PLASTICO);
		precio = PRECIO_BASE - Mesa.PRECIO_MATERIAL_MADERA + Mesa.PRECIO_MATERIAL_PLASTICO;
		assertEquals(precio, mesa.getPrecio());

		// Comprobacion de dimension
		mesa = new Mesa();
		int nuevaDimension = 5;
		mesa.setDimension(nuevaDimension);
		precio = PRECIO_BASE + (mesa.PRECIO_M2 * mesa.getDimension()) - (1 * Mesa.PRECIO_M2);
		assertEquals(precio, mesa.getPrecio());

		// Comprobacion de numero de patas
		mesa = new Mesa();
		int numeroPatas = 8;
		mesa.setNumeroPatas(numeroPatas);
		precio = PRECIO_BASE + (mesa.PRECIO_PATA * mesa.getNumeroPatas()) - (4 * Mesa.PRECIO_PATA);
		assertEquals(precio, mesa.getPrecio());

		mesa = new Mesa();
		numeroPatas = -4;
		mesa.setNumeroPatas(numeroPatas);
		precio = PRECIO_BASE - 3 * Mesa.PRECIO_PATA; // Se le quitan 3, porque por defecto son 4 patas y con numero
														// negativo es 1 pata
		assertEquals(precio, mesa.getPrecio());

	}

}
