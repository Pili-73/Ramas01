package Ejercicios;

import java.util.Scanner;

public class ramas01 {

	public static void main(String[] args) {

		int totalAlumnos = 0, opcion = -1;
		double maxNota = -1, minNota = 11, sumNota = 0;

		do {
			Scanner sc = new Scanner(System.in);
			opcion = Funciones.dimeEntero(
					"1. Agregar nota de un alumno.\n2. Calcular promedio. \n3. Mostrar nota más alta. \n4. Mostrar nota más baja. \n0. Salir.",
					sc);

			if (opcion == 1) {
				double nota = Funciones.dimeDouble("Escribe la nota", sc);
				agregarNota(nota, sc);
				totalAlumnos++;
				sumNota += nota;
				maxNota = Math.max(maxNota, nota);
				minNota = Math.min(minNota, nota);

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

	public static void agregarNota(double nota, Scanner sc) {
		while (nota > 10 || nota < 0) {
			System.out.println("");
			nota = Funciones.dimeDouble("Debe ser entre 0 y 10", sc);
		}
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