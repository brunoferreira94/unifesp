package concorrencia;

public class principal {

	public static void main(String[] args) {
		Concorrente c = new Concorrente();
		
		c.ContaPrimo(2, 15);
		
		for(int a = 0; a < c.lista.size(); a++)
			System.out.println(c.lista[0]);
	}

}
