package com.senati.eti;

import java.util.Scanner;

public class Caso21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el gasto: ");
		float gasto = sc.nextFloat();
		
		float res = gasto - ((gasto * 12) / 100);
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Gasto: " + gasto);
		System.out.println("Disminuido en 12 %: " + res);
		

	}

}
