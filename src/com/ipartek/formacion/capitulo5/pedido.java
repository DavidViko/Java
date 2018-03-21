package com.ipartek.formacion.capitulo5;

import java.util.Scanner;;

public class pedido {
	static String ingrediente;

	public static void main(String[] args) {
		Hamburguesa h1 = new Hamburguesa();
		Scanner sc = new Scanner(System.in);
		for (int i = 2; i < Hamburguesa.INGRE.length; i++) {
			System.out.println("¿Quieres " + Hamburguesa.INGRE[i] + "?");
			ingrediente = sc.next();
			if (ingrediente.equalsIgnoreCase("si")) {
				h1.ingredientes[i] = true;
			}
		}
		System.out.println("Tu pedido cuesta: " + h1.getPrecio() + "€");

	}

}
