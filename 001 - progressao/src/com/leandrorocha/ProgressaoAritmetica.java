package com.leandrorocha;

public class ProgressaoAritmetica extends Progressao {
	protected long incremento;

	/* contrutor default inicialliza com incremento de 1 */
	public ProgressaoAritmetica() {
		this(1);
	}
	
	ProgressaoAritmetica(long incremento){
		this.incremento = incremento;
	}
	
	protected long proximoValor() {
		valorAtual += incremento;
		return valorAtual;
	}
	

}
