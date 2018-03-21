package com.ipartek.formacion.capitulo5;

import static org.junit.Assert.fail;

import org.junit.Test;

public class HamburguesaTest {

	@Test
	public void testHamburguesa() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetIngredientes() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrecio() {
		Hamburguesa viuda = new Hamburguesa();
		assertEquals(1.0f, viuda.getPrecio(), 0.01);

	}

}
