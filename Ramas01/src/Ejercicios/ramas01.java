package Ejercicios;

import java.util.Scanner;

public class ramas01 {

	public static void main(String[] args) {

		int totalAlumnos = 0, opcion = -1;
		double maxNota = -1, minNota = 11, sumNota = 0;

		do {
			Scanner sc = new Scanner(System.in);
			opcion = Funciones.dimeEntero(
					"1. Agregar nota de un alumno.\n2. Calcular promedio. \n3. Mostrar nota m�s alta. \n4. Mostrar nota m�s baja. \n0. Salir.",
					sc);

			if (opcion == 1) {
				agregarNota(totalAlumnos, sumNota, maxNota, minNota, sc);

			} else if (opcion == 2) {
				calcularPromedio(totalAlumnos, sumNota);

			} else if (opcion == 3) {
				notaMaxima(maxNota);

			} else if (opcion == 4) {
				notaMinima(minNota);

			} else if (opcion != 0) {
				System.out.println("Entre 0 y 4");
			}
		} while (opcion != 0);
	}

	public static void agregarNota(int totalAlumnos, double sumNota, double maxNota, double minNota, Scanner sc) {
		double nota;
		do {
			nota = Funciones.dimeDouble("Escribe la nota", sc);
			if (nota >= 0 && nota <= 10) {
				totalAlumnos++;
				sumNota += nota;
				maxNota = Math.max(maxNota, nota);
				minNota = Math.min(minNota, nota);
			}
		} while (nota > 10 || nota < 0);
	}

	public static void calcularPromedio(int totalAlumnos, double sumNota) {
		System.out.println(sumNota / totalAlumnos);
	}

	public static void notaMaxima(double maxNota) {
		System.out.println(maxNota);
	}

	public static void notaMinima(double minNota) {
		System.out.println(minNota);
	}
}