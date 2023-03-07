package controller;

public class ContarDigito {

	public ContarDigito() {
		super();
	}
	
	//Fun��o recursiva que conta quantas vezes o n�mero2 aparece no n�mero1
		public static int contarDigito(int numero1, int numero2) {
			//Condi��o de parada
			if(numero1 == 0) {
				return 0;
			}
			
			//Rela��o de chamada dos passos
			int digitoAtual = numero1 % 10;
			
			if(digitoAtual == numero2) {
				return 1 + contarDigito(numero1/10, numero2);
			} else {
				return 0 + contarDigito(numero1/10, numero2);
			}
		}

}
