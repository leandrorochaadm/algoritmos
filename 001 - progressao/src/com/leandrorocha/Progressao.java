package com.leandrorocha;

public class Progressao {

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
	 
	 public void imprimirProgressao(int n) {
		System.out.println(primeiroValor()); 
		for(int i = 2; i<=n;i++) {
			System.out.println(proximoValor());
		}
	 }
}
