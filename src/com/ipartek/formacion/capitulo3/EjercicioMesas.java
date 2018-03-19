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
		mIzaskun.setDimension(5);
		mIzaskun.setColor("negro");
		mIzaskun.setMaterial(1);

		Mesa mMikel = new Mesa();
		mMikel.setNumeroPatas(8);
		mMikel.setDimension(5);
		mMikel.setColor("negro");
		mMikel.setMaterial(1);

		Mesa mAingeru = new Mesa();
		mAingeru.setNumeroPatas(8);
		mAingeru.setDimension(5);
		mAingeru.setColor("negro");
		mAingeru.setMaterial(1);

		Mesa mJoseba = new Mesa();
		mJoseba.setNumeroPatas(8);
		mJoseba.setDimension(5);
		mJoseba.setColor("negro");
		mJoseba.setMaterial(1);

		Mesa mAnder = new Mesa();
		mAnder.setNumeroPatas(8);
		mAnder.setDimension(5);
		mAnder.setColor("negro");
		mAnder.setMaterial(1);

	}
}
