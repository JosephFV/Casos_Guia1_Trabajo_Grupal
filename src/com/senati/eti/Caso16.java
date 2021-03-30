package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese las horas trabajadas: ");
		float hor = sc.nextFloat();
		
		System.out.print("Ingrese la tarifa por hora: ");
		float tar = sc.nextFloat();
		
		float sueldo = (float) (hor * tar);		
		float bono = (float) (sueldo * 0.05);
		float total = (sueldo + bono);
		float equiv = (float) (total / 3.24);
		
		System.out.println("--------------------");
		System.out.println(">>>> Resultados <<<<");
		System.out.println("--------------------");
		System.out.println("Sueldo..............: " + df.format(sueldo));
		System.out.println("Bono................: " + df.format(bono));
		System.out.println("Total...............: " + df.format(total));
		System.out.println("Total en dólares....: " + df.format(equiv));

	}

}
