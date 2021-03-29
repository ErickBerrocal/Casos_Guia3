package com.senati.eti;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		// Factorial
		// 1 x 2 x 3 x . . . x n

		int factorial = 1;
		int n;
		
		System.out.println("Ingrese número: ");
		n = valor.nextInt();
		for (int i = n; i > 0; i--) {
			factorial = factorial * i;
		}
		System.out.println("El factorial de " + n + " es: " + factorial);;
		
		
	} 

}
