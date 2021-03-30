package com.senati.eti;

import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre de producto: ");
		String nom = sc.nextLine();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingrese cantidad: ");
		float can = sc.nextFloat();
		
		float importe = (precio * can);
		float igv = ((importe *  18) / 100);
		float descuento = ((importe * 13) / 100);
		float total = (importe - descuento + igv);
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Importe: " + importe);
		System.out.println("IGV: " + igv);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total: " + total);
		


	}

}
