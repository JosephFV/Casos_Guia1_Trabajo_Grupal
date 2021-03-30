package com.senati.eti;

import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#.00");
		
		float num = (float) Math.pow(3, 2);
		float val1 = (float) (17 * 2 + num - 6);
		float val2 = (float) (4.7 - 1.2 * 2);
		float val3 = (-2 * (val2));
		float val4 = (val1 / 5);
		float res = (val3 + val4) ;
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Respuesta......: " + df.format(res));

	}

}
