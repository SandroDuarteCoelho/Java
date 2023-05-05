package acessoesuperior;

public class universidade {

	int nota, opção; 
	String curso;
	
	
	int validar_nota (int n) {
		
		if (n>20 || n<0) 
			{
			System.out.println("Nota inválida");
			return 0;
			}
			else
			{	return n;
			}
		}
	
	
	void saida_ecran() 
	{
	System.out.println("O curso de "+this.curso+" tem a nota de entrada de "+this.nota);
	}
	
	void sera_que_entrou (int n) {
		
		if (this.nota<n) 
			{
			System.out.println("Entrou");
			}
		else
		{	System.out.println("Não Entrou");
		}
	
	
		}

	}

	


