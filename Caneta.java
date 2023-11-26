package orientacaoAObjetos;

import java.util.Scanner;
public class Caneta {
	Scanner leia = new Scanner(System.in);
	String marca;
	String cor;
	String escrita;
	double preco;
	boolean tampada;
	float ponta;
	
	void rabiscar() {
		if(this.tampada == true) {
			System.out.println("Não pode escrever!");
		} else {
			System.out.println("Pode escrever!");
		}
	}
	void tampar() {
		this.tampada = true;
	}
	void destampar() {
		this.tampada = false;
	}
	void escrever() {
		if(this.tampada == true) {
			System.out.println("A caneta está destampada!");
		} else {
			System.out.println("O que quer escrever?");
			this.escrita = leia.next();
		}
	}

	
	
	
}
