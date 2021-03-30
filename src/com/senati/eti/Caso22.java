package com.senati.eti;

import java.util.Scanner;

public class Caso22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nota 1: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Ingrese nota 2: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Ingrese nota 3: ");
		float n3 = sc.nextFloat();
		
		float prom = ((n1 * 20) / 100) + ((n2 * 30) / 100) + ((n3 * 50) / 100); 
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Nota 1: " + n1);
		System.out.println("Nota 2: " + n2);
		System.out.println("Nota 3: " + n3);
		System.out.println("--------------------");
		System.out.println("Promedio: " + prom);


	}

}
