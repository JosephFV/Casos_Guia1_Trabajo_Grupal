package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el primer lado: ");		
		float num1 = sc.nextInt();
		
		System.out.print("Ingrese el segundo lado: ");
		float num2 = sc.nextInt();
		
		float area = num1 * num2;
		float per = (num1 * 2) + (num2 * 2);
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("�rea del rect�ngulo....: " + area);
		System.out.println("Per�metro..............: " + per);


	}

}
