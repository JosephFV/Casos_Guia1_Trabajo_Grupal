package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Ingrese el primer número: ");		
		float num1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo número: ");
		float num2 = sc.nextInt();
		
		float res1 = (float) (num1 + num2) / 2;
		float res2 = (float)(num1 * 0.2) + num1;
		float res3 = (float) (num2 - (num2 * 0.3));
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Resultado 1.......: " + res1);
		System.out.println("Resultado 2.......: " + res2);
		System.out.println("Resultado 3.......: " + res3);

	}

}
