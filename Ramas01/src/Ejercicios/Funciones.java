package Ejercicios;

import java.util.Scanner;

public class Funciones {
	
	public static boolean esInt (String texto) {
		try {
			Integer.parseInt(texto);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean esDouble (String texto) {
		try {
			Double.parseDouble(texto);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static int dimeEntero (String texto, Scanner sc) {
		int num = 0;
		do {
			try {
				System.out.println(texto);
				String s = sc.nextLine();
				num = Integer.parseInt(s);
				return num;
			} catch (Exception e) {
				System.out.println("Formato inválido");
			}
		} while (true);
	}
	
	public static double dimeDouble (String texto, Scanner sc) {
		double num = 0;
		try {
			System.out.println(texto);
			String s = sc.nextLine();
			num = Double.parseDouble(s);
		} catch (Exception e) {
			System.out.println("Formato inválido");
		}
		return num;
	}
	
	public static int factorial (int num) {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact *= num;
		}
		return fact;
	}
	public static boolean esPrimo (int num) {
		for (int i = 2; i  < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void divisores (int num) {
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					System.out.print(i);
					if (i != num) {
						System.out.print(", ");
					}
				}
			}
		}
		System.out.println();
	}
	
	public static void escalera (int num) {
		if (num == 0) {
			System.out.println("__");
		}
		else if (num > 0) {
			for (int j = 0; j < num; j++) {
				System.out.print(" ");
			}
			System.out.println("_");
			for (int i = num-1; i >= 0; i--) {
				for (int k = 0; k < i; k++) {
					System.out.print(" ");
				}
				System.out.println("_|");
			}
		}
		else if (num < 0) {
			num = num*(-1);
			System.out.println("_");
			for (int j = 1; j <= num; j++) {
				for (int k = 0; k < j; k++) {
					System.out.print(" ");
				}
				System.out.println("|_");
			}
		}
	}
}
