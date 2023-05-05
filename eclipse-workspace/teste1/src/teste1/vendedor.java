package teste1;

public class vendedor {
	
	int nFunc;
	String nome;
	int vendas;
	double limite;
	
	int vlimite (int total) {
		
		if (total>this.limite) {
			return 0;
		}
		return total;
	}

}
