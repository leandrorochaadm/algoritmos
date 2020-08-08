package com.leandrorocha;

import java.util.Scanner;


public class Principal {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o tamanho da progressão: ");
		final int i = SCANNER.nextInt();
		
		System.out.println("Progressao Aritmetica");
		var ari = new ProgressaoAritmetica();
		ari.imprimirProgressao(i);
		
		
		System.out.println("\nProgressao Geometrica");
		var geo = new ProgressaoGeometrica();
		geo.imprimirProgressao(i);
		
		
		System.out.println("\nProgressao Fibonacci");
		var fib =  new ProgressaoFibonacci(1,2);
		fib.imprimirProgressao(i);
		
		SCANNER.close();
	}

}
