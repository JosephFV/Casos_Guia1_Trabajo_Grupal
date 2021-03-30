package com.senati.eti;

import java.util.Scanner;

public class Caso24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese monto 1: ");
		float mon1 = sc.nextFloat();
		
		System.out.print("Ingrese monto 2: ");
		float mon2 = sc.nextFloat();
		
		System.out.print("Ingrese monto 3: ");
		float mon3 = sc.nextFloat();
		
		float res1 = (mon1 / 5) + ((mon2 * 20) / 100);
		float res2 = ((mon3 * 60) / 100) / 2;
		float res3 = ((mon1 + mon2 + mon3) * 8) / 100;
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Resultado 1: " + res1);
		System.out.println("Resultado 2: " + res2);
		System.out.println("Resultado 3: " + res3);
		
		

	}

}
