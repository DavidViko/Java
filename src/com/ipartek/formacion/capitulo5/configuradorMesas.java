package com.ipartek.formacion.capitulo5;

import java.util.Scanner;

import com.ipartek.formacion.capitulo3.Mesa;

public class configuradorMesas {
	static int patas;
	static String color;
	static String material;
	static int materialInt;
	static int dimension;

	public static void main(String[] args) {
		Mesa mesa = new Mesa();
		System.out.println("Configurador de mesas");
		System.out.println("---------------------------");

		pedirDatos(mesa);
		asignarDatos(mesa);
		imprimirTicket(mesa);
	}

	private static void pedirDatos(Mesa mesa) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Número de patas?");
		patas = sc.nextInt();

		System.out.println("¿De qué color?");
		color = sc.next();
		color.toLowerCase();

		System.out.println("¿Material de la mesa?");
		System.out.println("1- Madera");
		System.out.println("2- Acero");
		System.out.println("3- Aluminio");
		System.out.println("4- Plástico");

		material = sc.next();
		material.toLowerCase();

		switch (material) {
		case "madera":
		case "1":
			materialInt = Mesa.MATERIAL_MADERA;
			break;
		case "acero":
		case "2":
			materialInt = Mesa.MATERIAL_ACERO;
			break;
		case "aluminio":
		case "3":
			materialInt = Mesa.MATERIAL_ALUMINIO;
			break;
		case "plastico":
		case "4":
			materialInt = Mesa.MATERIAL_PLASTICO;
			break;
		default:
			System.out.println("No existe la opción de ese material ");
			break;
		}

		System.out.println("¿De cuántos metros cuadrados la quieres?");
		dimension = sc.nextInt();
	}

	private static void asignarDatos(Mesa mesa) {
		mesa.setNumeroPatas(patas);
		mesa.setColor(color);
		mesa.setMaterial(materialInt);
		mesa.setDimension(dimension);
	}

	private static void imprimirTicket(Mesa mesa) {
		System.out.println("FACTURA");
		System.out.println("____________________________");
		System.out.println("Nº de patas " + patas);
		System.out.println("Color " + color);
		System.out.println("Dimensiones " + dimension);
		System.out.println("Material " + material);
		System.out.println("____________________________");
		System.out.println("PRECIO = " + mesa.getPrecio() + "€");
	}

}
