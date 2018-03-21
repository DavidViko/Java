package com.ipartek.formacion.capitulo3;

public class EjercicioMesas {
	public static void main(String[] args) {
		System.out.println("Listado mesas");
		System.out.println("--------------------");

		/*
		 * 8p 6m negro madera 2p 5m verde madera 5p 7m plateado acero 3p 5m amarillo
		 * aluminio 1p 2m custom plastico
		 */

		Mesa mIzaskun = new Mesa();
		mIzaskun.setNumeroPatas(8);
		mIzaskun.setDimension(6);
		mIzaskun.setColor("negro");
		mIzaskun.setMaterial(Mesa.MATERIAL_MADERA);
		System.out.println(mIzaskun.toString());
		System.out.println("Precio mesa Izaskun: " + mIzaskun.getPrecio());

		Mesa mMikel = new Mesa();
		mMikel.setNumeroPatas(2);
		mMikel.setDimension(5);
		mMikel.setColor("verde");
		mMikel.setMaterial(Mesa.MATERIAL_MADERA);
		System.out.println(mMikel.toString());
		System.out.println("Precio mesa Mikel: " + mMikel.getPrecio());

		Mesa mAingeru = new Mesa();
		mAingeru.setNumeroPatas(5);
		mAingeru.setDimension(7);
		mAingeru.setColor("plateado");
		mAingeru.setMaterial(Mesa.MATERIAL_ACERO);
		System.out.println(mAingeru.toString());
		System.out.println("Precio mesa Aingeru: " + mAingeru.getPrecio());

		Mesa mJoseba = new Mesa();
		mJoseba.setNumeroPatas(3);
		mJoseba.setDimension(5);
		mJoseba.setColor("amarillo");
		mJoseba.setMaterial(3);
		System.out.println(mJoseba.toString());
		System.out.println("Precio mesa Joseba: " + mJoseba.getPrecio());

		Mesa mAnder = new Mesa();
		mAnder.setNumeroPatas(1);
		mAnder.setDimension(2);
		mAnder.setColor("custom");
		mAnder.setMaterial(Mesa.MATERIAL_PLASTICO);
		System.out.println(mAnder.toString());
		System.out.println("Precio mesa Ander: " + mAnder.getPrecio());

	}
}
