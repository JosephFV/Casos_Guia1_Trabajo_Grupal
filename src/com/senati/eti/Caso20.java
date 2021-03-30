package com.senati.eti;

import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese el valor de venta: ");
		float val = sc.nextFloat();
		
		float res = ((val * 42) / 100) + val;
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Valor de venta: " + val);
		System.out.println("Aumento de 42 %: " + res);



	}

}
