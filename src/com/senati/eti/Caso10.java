package com.senati.eti;

import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("--------------------------");
		System.out.println(">>>> �REA DEL CIRCULO <<<<");
		System.out.println("--------------------------");
		System.out.print(">> Ingrese el radio: ");
		
		float radio = sc.nextFloat();
		float ar = (float) Math.pow(radio, 2);
		float area = (float) (ar * 3.1416);
		float per = (float) (2 * 3.1416 * radio);
		
		System.out.println("\n--------------------");
		System.out.println(">>>> RESULTADOS <<<<");
		System.out.println("--------------------");
		System.out.println(">> �rea del Circulo: " + area);
		System.out.println(">> Per�metro: " + per);
		
	}

}
