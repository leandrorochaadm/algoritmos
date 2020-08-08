package com.leandrorocha;

public class ProgressaoGeometrica extends Progressao {
	
protected long base;

public ProgressaoGeometrica() {
	this(2);
}

ProgressaoGeometrica(long base){
	this.base = base;
	valorInicial = 1;
	valorAtual = valorInicial;
}

protected long proximoValor() {
	valorAtual *= base;
	return valorAtual;
}

}
