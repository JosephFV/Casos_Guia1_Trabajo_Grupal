package com.senati.eti;

import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Ingrese la altura: ");
		float altura = sc.nextFloat();
		
		System.out.print("Ingrese la base: ");
		float base = sc.nextFloat();
		
		float area = (base * altura) / 2;
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Altura: " + altura);
		System.out.println("Base: " + base);
		System.out.println("--------------------");
		System.out.println("Área: " + area);

	}

}
