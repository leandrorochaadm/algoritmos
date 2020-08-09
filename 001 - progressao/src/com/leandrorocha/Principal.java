package com.leandrorocha;

import java.util.Scanner;


public class Principal {

	private static final Scanner SCANNER = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Digite o tamanho da progressão: ");
		Progressao.tamanhoProgressao = SCANNER.nextInt();
		
		
		System.out.println("Digite o valor inteiro do incremento: ");
		int inc = SCANNER.nextInt();
		
		System.out.println("Progressao Aritmetica");
		ProgressaoAritmetica ari = new ProgressaoAritmetica(inc);
		ari.imprimirProgressao();
		
		
		System.out.println("\nProgressao Geometrica");
		ProgressaoGeometrica geo = new ProgressaoGeometrica(inc);
		geo.imprimirProgressao();
		
		
		System.out.println("\nProgressao Fibonacci");
		ProgressaoFibonacci fib =  new ProgressaoFibonacci(1,2);
		fib.imprimirProgressao();
		
		SCANNER.close();
	}

}
