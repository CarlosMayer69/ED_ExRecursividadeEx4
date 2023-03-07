package view;

import controller.ContarDigito;

public class Principal {

	public static void main(String[] args) {
		
		ContarDigito cd = new ContarDigito();
		
		//int numero1 = 523578;
		//int numero2 = 5;
		  int numero1 = 836363;
		  int numero2 = 3;
		//Verifica se o primeiro número está entre 10 e 999999
		if(numero1 > 9 && numero1 < 999999) {
			//Verifica se o segundo número está entre 0 e 9
			if(numero2 >= 0 && numero2 <= 9) {
				
				int resultado = cd.contarDigito(numero1, numero2);
				System.out.println("O número " + numero2 + " aparece " + resultado + " vezes no número " + numero1 + ".");
			}
		}

	}

}
