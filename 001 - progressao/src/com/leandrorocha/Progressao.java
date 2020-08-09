package com.leandrorocha;

import java.util.Arrays;

public class Progressao {
	
//	ArrayList<Long> list = new ArrayList<Long>();
	public static int tamanhoProgressao;
	protected long[] list = new long[tamanhoProgressao];
	protected long valorInicial;
	protected long valorAtual;
	
	Progressao(){
		valorAtual=valorInicial=0;
	}
	
	protected long primeiroValor() {
		valorAtual = valorInicial;
		return valorAtual;
	}
	
	 protected long proximoValor() {
		 return ++valorInicial;
	 }
	 
	 public void imprimirProgressao() {
//		System.out.println(primeiroValor()); 
		 list[0]= primeiroValor();
		for(int i = 2; i<=tamanhoProgressao;i++) {
//			System.out.println(proximoValor());
			list[i-1] = proximoValor();
		}
		System.out.println(Arrays.toString(list));

	 }
}
