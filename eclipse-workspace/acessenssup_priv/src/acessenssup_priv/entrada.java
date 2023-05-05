package acessenssup_priv;

import java.util.Scanner;

public class entrada {

	public static void main(String[] arg) {
		
		/* São criados vários objetos para a classe "universidade" para 
		distinguir e poder comprara valores diferentes a serem usados*/
		
		universidade c1 = new universidade ();
		Scanner input = new Scanner (System.in);
		universidade n = new universidade ();
		do
		{
		System.out.println("Introduza a nota de candidatura:");
		n.setNota(input.nextInt()); // criou-se metodo "setNota" na classe universidade porque a variavel "nota" é privada
	//	n.nota(input.nextInt()); // caso a variavel "nota" fosse definida como publica
		}
		while (n.validar_nota(n.getNota())==0); // chama metodo "validar_nota", e testa o valor inserido, sendo a variavel privada, usa-se método "getNota"
		
		System.out.println("Quer se candidatar a que curso?");
		System.out.println("1-Humanidades");
		System.out.println("2-Saúde");
		System.out.println("3-Gestão");
		n.opção= input.nextInt(); // valor vai ser guardado em "opção" na classe "universidade" (c1) (deve ser do mesmo tipo dados)
		
		c1.setCurso("Humanidades");
		c1.setNota(15);
		c1.saida_ecran();
		universidade c2 = new universidade ();
		c2.setCurso("Saúde");
		c2.setNota(18);
		c2.saida_ecran();
		universidade c3 = new universidade ();
		c3.setCurso("Gestão");
		c3.setNota(17);
		c3.saida_ecran();	


		switch (n.opção)
		{
		case 1:
			c1.sera_que_entrou(n.getNota()); 
			break;
		case 2: 
			c2.sera_que_entrou(n.getNota()); 
			break;
		case 3: 	
			c3.sera_que_entrou(n.getNota());
			break;
		}
	
		
		}
		
}
