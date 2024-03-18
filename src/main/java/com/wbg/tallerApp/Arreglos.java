package com.wbg.tallerApp;

import java.util.Iterator;

public class Arreglos {

	public void tesArreglos(String[] productos, double[] valores) {
//		System.out.println("productos 0 = " + productos [0] + " valor productos 0 = " + valores[0]);
//		System.out.println("productos 1 = " + productos[1] + " valor productos 1 = " + valores[1]);
//		System.out.println("productos 2 = " + productos[2] + " valor productos 2 = " + valores[2]);
//		System.out.println("productos 3 =  " + productos[3] + " valor producto 3 = " + valores[3]);
//		System.out.println("productos 4 = " + productos[4] + " valor productos 4 = " + valores[4]);
		double subtotal = 0;

		for (int indice = 0; indice < productos.length; indice++) {
			System.out.println(" productos " + indice + " = " + productos[indice] + " valor productos " + indice
					+ "  = " + valores[indice]);
			subtotal = subtotal + valores[indice];

		}

		System.out.println("subtotal = " + subtotal);
	}

}
