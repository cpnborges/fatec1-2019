package view;

import controller.Operacoes;

public class Principal {

	public static void main(String[] args) {

		Operacoes op = new Operacoes();
//		op.preencheString();
//		op.preencherBuffer();
		String str = "Está chovendo lá fora de novo !";
		String [] vetString = str.split(" ");
		op.imprimeVetor(vetString);
	}

}
