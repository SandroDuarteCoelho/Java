package acessoesuperior;

import java.util.Scanner;

public class entrada {

public static void main(String[] arg) {
	
	universidade c1 = new universidade ();
	Scanner input = new Scanner (System.in);
	
	universidade n=new universidade(); // cria objeto "n" associada à classe "universidade"
	do
	{
	System.out.println("Introduza a nota de candidatura:");
	n.nota= input.nextInt(); // valor guardado em "n" vai ser guardado em "nota" na classe (deve ser do mesmo tipo dados)
	}
	while (c1.validar_nota(n.nota)==0); // chama metodo "validar_nota", e testa o valor inserido 
	
	System.out.println("Quer se candidatar a que curso?");
	System.out.println("1-Humanidades");
	System.out.println("2-Saúde");
	System.out.println("3-Gestão");
	n.opção= input.nextInt(); // valor guardado em "n" vai ser guardado em "opção" na classe (deve ser do mesmo tipo dados)
	
	c1.curso="Humanidades";
	c1.nota=15;
	c1.saida_ecran();
	universidade c2 = new universidade ();
	c2.curso="Saúde";
	c2.nota=18;
	c2.saida_ecran();
	universidade c3 = new universidade ();
	c3.curso="Gestão";
	c3.nota=17;
	c3.saida_ecran();	


	switch (n.opção)
	{
	case 1:
		c1.sera_que_entrou(n.nota); 
		break;
	case 2: 
		c2.sera_que_entrou(n.nota); 
		break;
	case 3: 	
		c3.sera_que_entrou(n.nota);
		break;
	}
	
	
	
	}
	
}
