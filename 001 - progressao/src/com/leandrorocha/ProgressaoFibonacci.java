package com.leandrorocha;

public class ProgressaoFibonacci extends Progressao {
	long valorAnterior;

	ProgressaoFibonacci() {
		this(0, 1);
	}

ProgressaoFibonacci(long value1, long value2){
	valorInicial = value1;
	valorAnterior = value2 - value1;
}

protected long proximoValor() {
	long temp = valorAnterior;
	valorAnterior = valorAtual;
	valorAtual += temp;
	return valorAtual;
}

}
