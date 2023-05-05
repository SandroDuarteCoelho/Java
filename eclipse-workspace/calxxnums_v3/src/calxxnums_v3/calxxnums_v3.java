package calxxnums_v3;

import java.util.Scanner;

import java.util.Random;

public class calxxnums_v3 {

public static void main(String[] arg) { //não entram argumentos externos
		
		int i, x, opção=0, soma=0, sub=0, multi=1, div=1;
		int[] num;  // declara o array de inteiros 
		Scanner input =new Scanner(System.in); //objeto input
				
		System.out.println("Escolha uma opção");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("0 .Sair");
		opção = input.nextInt();
				
		while (opção !=0) 
		{
			System.out.println("Quantos numeros vai usar?");
			x=input.nextInt();
			num = new int[x]; // atribui x posições no array
			System.out.println("Numeros automáticos = 1     Inserir manual = 2");
			i = input.nextInt();
			Random gerador = new Random(); // objeto gerador
			
			for (int a = 0; a < x; a++) 
			{
				if (i==1)
				{
					num[a]=gerador.nextInt(10)+1; // guarda numero aleatório entre 1 e 10
					System.out.println("Numeros:"+ num[a]);
				}
				else
				{
					System.out.println("Introduza o "+(a+1)+"º numero");
					num[a]=input.nextInt();
				}
				soma=soma+num[a];
				multi=multi*num[a];
				if ((a==0 && sub==0)  || (a==0 && div==1) )
				{sub=sub+num[a]; // primeiro numero, ainda não subtrai com ninguem
				 div=num[a]/div;}  // primeiro numero, ainda não divide com ninguem
				else
				{sub=sub-num[a];
				div=div/num[a];}
			 }
			
			switch (opção)
			{
			case 1:	System.out.println("A soma é "+soma); break;
			case 2: System.out.println("A subtração é "+sub); break;
			case 3: System.out.println("A multiplicação é "+multi);	break;
			case 4: System.out.println("A divisão é "+div);	break;
			}
			opção=0;
		}
		System.out.println("Fim do programa");
}
}
