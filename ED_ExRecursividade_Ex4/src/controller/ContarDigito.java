package controller;

public class ContarDigito {

	public ContarDigito() {
		super();
	}
	
	//Função recursiva que conta quantas vezes o número2 aparece no número1
		public static int contarDigito(int numero1, int numero2) {
			//Condição de parada
			if(numero1 == 0) {
				return 0;
			}
			
			//Relação de chamada dos passos
			int digitoAtual = numero1 % 10;
			
			if(digitoAtual == numero2) {
				return 1 + contarDigito(numero1/10, numero2);
			} else {
				return 0 + contarDigito(numero1/10, numero2);
			}
		}

}
