package com.wbg.tallerApp;

import java.util.Iterator;

public class TallerApp {
	public static void main(String[] args) {

		String[] productos = new String[5];
		productos[0] = "celular";
		productos[1] = "tablet";
		productos[2] = "portatil";
		productos[3] = "computador";
		productos[4] = "televisor ";

		double[] valores = new double[5];

		valores[0] = 5.0;
		valores[1] = 5.0;
		valores[2] = 5.0;
		valores[3] = 5.0;
		valores[4] = 5.0;
		
		Factura factura = new Factura ();
		factura.getFactura(productos, valores);
		
		
		
		Arreglos arreglos = new Arreglos ();
		arreglos.tesArreglos(productos, valores);
		
 
	}

}
