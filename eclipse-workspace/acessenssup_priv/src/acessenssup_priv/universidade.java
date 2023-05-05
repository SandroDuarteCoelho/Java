package acessenssup_priv;

public class universidade {

	private int nota; 
	int opção; 
	private String curso;
	public String setCurso;
	
	
	
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
	System.out.println("O curso de "+this.getCurso()+" tem a nota de entrada de "+this.getNota());
	}
	
	void sera_que_entrou (int n) {
		
		if (this.getNota()<=n) 
			{
			System.out.println("Entrou");
			}
		else
		{	System.out.println("Não Entrou");
		}
	
	
		}

	

	public int getNota() {    //para ler um valor guardado
		return nota;
	}


	void setNota(int nota) {   // para guardar um valor
		this.nota = nota;
	}
	
	public String getCurso() {    
		return curso;
	}
	
	void setCurso(String curso) {   // para guardar um valor
		this.curso = curso;
	}
}

	
