package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		float lado1 = sc.nextFloat();
		
		System.out.print("Ingrese lado 2: ");
		float lado2 = sc.nextFloat();
		
		System.out.print("Ingrese lado 3: ");
		float lado3 = sc.nextFloat();
		
		float per = lado1 + lado2 + lado3;
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Lado 1: " + lado1);
		System.out.println("Lado 2: " + lado2);
		System.out.println("Lado 3: " + lado3);
		System.out.println("--------------------");
		System.out.println("Perímetro: " + per);

	}

}
