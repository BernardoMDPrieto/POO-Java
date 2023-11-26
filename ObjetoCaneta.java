package orientacaoAObjetos;

public class ObjetoCaneta {
	public static void main(String[]args) {
		Caneta caneta01 = new Caneta();
		caneta01.marca = "bic";
		caneta01.cor = "azul";
		caneta01.preco = 4.56d;
		caneta01.ponta = 0.5f;
		
		Caneta caneta02 = new Caneta();
		caneta02.marca = "Faber Castel";
		caneta02.cor = "preta";
		caneta02.preco = 7.89d;
		caneta02.ponta = 0.5f;
		
		caneta01.escrever();
		System.out.println(caneta01.escrita);
		
		
		
		
		
		
	}
}
