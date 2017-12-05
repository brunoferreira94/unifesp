package concorrencia;

import java.util.ArrayList;
import java.util.List;

public class ContaPrimo implements Runnable{
	private List<Integer> lista = new ArrayList<Integer>();
	private int div = 0, inicio, fim;
	
	ContaPrimo(int inicio, int fim){
		this.inicio = inicio;
		this.fim = fim;
	}
	
	public synchronized List<Integer> valor(){
		return lista;
	}

	public void run() {
		if(inicio < 0)
			inicio = 1;
		if(fim < 0)
			fim = 1;
		
		for(int a = inicio; a <= fim; a++){
			for(int b = 1; b < a; b++){
				if(a%b==0){
					div++;
					if(div > 2){
						b = a;
					}
				}
			}
			if(div < 2)
				lista.add(a);
			div = 0;
		}		
	}
}
