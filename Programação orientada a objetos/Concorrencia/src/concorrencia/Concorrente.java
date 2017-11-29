package concorrencia;

import java.util.ArrayList;
import java.util.List;

public class Concorrente {
	List lista = new ArrayList();
	int div = 0;
	public synchronized void ContaPrimo(int inicio, int fim){
		if(inicio < 0)
			inicio = 1;
		if(fim < 0)
			fim = 1;
		
		for(int a = inicio; a < fim; a++){
			for(int b = 1; b < a; b++){
				if(a%b==0){
					div++;
					if(div > 2)
						break;
				}
			}
			if(div <= 2)
				lista.add(a);
		}
	}
}
