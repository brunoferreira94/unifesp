package concorrencia;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Concorrente c = new Concorrente();
		int[] n = new int[3];
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Entre com o início do intervalo de números primos: ");
		n[0] = reader.nextInt();
		
		System.out.println("Entre com o fim do intervalo de números primos: ");
		n[1] = reader.nextInt();
		
		do{
		System.out.println("Entre com número de threads que serão utilizadas (1 à 5): ");
		n[2] = reader.nextInt();
		if(n[2] > 0 && n[2] < 6)
			System.out.println("Você digitou um número fora do intervalo.");
		}
		while(n[2] < 1 && n[2] > 5);
		
		Thread[] t = new Thread[n[2]];
		
		int quant = n[1] - n[0];
		int cont = n[0];
		int a = 0;
		
		if(quant <= n[2]){
			while(cont < n[1] && a < n[2])
				t[a] = new Concorrente().ContaPrimo(cont, cont);
		}
		
		int quant

		
		
		c.ContaPrimo(2, 17);
		for(int a = 0; a < c.value().size(); a++)
			System.out.println(c.value().get(a));
	}

}
