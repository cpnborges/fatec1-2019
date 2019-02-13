package controller;

public class Operacoes {

	public Operacoes() {
		super(); //ele entende que vai utilizar tudo o que a classe pede ou oferece, ele usa a "Superclasse object e tudo o que ela oferece

	}

	public void preencheString() {
		String str = "";
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			str = str + "x";
		}
		double tempoFinal = System.nanoTime();
		double duracao = tempoFinal - tempoInicial;
		duracao = duracao / Math.pow(10, 9);
		System.out.println("String==> " + duracao + "  segundos.");
	}

	public void preencherBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		for (int i = 0; i < 32768; i++) {
			buffer.append("x");
		}
		double tempoFinal = System.nanoTime();
		double duracao = tempoFinal - tempoInicial;
		duracao = duracao / Math.pow(10, 9);
		System.out.println("Buffer ==>" + duracao + " segundos.");
	}
	
	public void imprimeVetor(String [] vetString) {
		for (String palavra:vetString) {
			System.out.println(palavra);
		}
	}
}