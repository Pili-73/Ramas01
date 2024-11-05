package Ejercicios;

import java.util.Scanner;

public class ramas01 {

	public static void main(String[] args) {
		
		int contNotas = 0;
		double maxNota = 11, minNota = 0;
		
		Scanner sc = new Scanner(System.in);
		int opcion = Funciones.dimeEntero(
				"1. Agregar nota de un alumno.\n 2. Calcular promedio. \n3. Mostrar nota más alta. \n4. Mostrar nota más baja. \n0. Salir.", sc);
		/*
		if (opcion == 1) {
			agregarNota(double nota, sc);
		} else if (opcion == 2) {
			calcularPromedio(double nota);
		} else if (opcion == 3) {
			notaMaxima();
		}else if (opcion == 1) {
			notaMinima();
		}*/
	}

}

/*
public static void agregarNota(double nota, sc) {
	double nota = Funciones.dimeDouble("Escribe la nota", sc);
	
}
public static void calcularPromedio(int totalAlumnos) {
	
}
public static void notaMaxima() {
	
}
public static void notaMinima() {
	
}*/