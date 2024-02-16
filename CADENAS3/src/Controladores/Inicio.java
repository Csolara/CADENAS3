package Controladores;

import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una cadena: ");
		String cadena = sc.nextLine();

		System.out.println("Introduzca un caracter: ");
		char caracter = sc.next().charAt(0);
			
		int numeroDeVeces = contar(cadena, caracter);
		System.out.println("El caracter " + caracter + " aparece " + numeroDeVeces + " veces");
	}

	public static int contar(String cadena, char caracter) {
		int posicion, contador = 0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
			contador++;
			posicion = cadena.indexOf(caracter, posicion + 1);
		}
		return contador;
	}
}
