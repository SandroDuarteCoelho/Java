package calxxnums;

import java.util.Scanner;

public class calxxnums {
public static void main(String[] arg) { //não entram argumentos externos
		
		int i, x, opção, soma=0, sub=0, multi=1, div=1;
		int[] num;  // declara o array de inteiros 
		 
		Scanner input =new Scanner(System.in); //objeto input
		
		
		System.out.println("Escolha uma opção");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("0 .Sair");
	
		
		opção = input.nextInt();
		System.out.println("Quantos numeros vai inserir?");
		x=input.nextInt();
		num = new int[x]; // atribui x posições no array
				
		while (opção !=0) 
		{
			
			if (opção ==1) // Soma
			{
				i=0;
				do
				{
				System.out.println("Introduza o "+(i+1)+"º numero");
				num[i]=input.nextInt();
				soma=soma+num[i];
				i++;
				}
				while (i<x);
				System.out.println("A soma é "+soma);
			}
			if (opção ==2) // Subtração
			{
				i=0;
				do
				
				{
				System.out.println("Introduza o "+(i+1)+"º numero");
				num[i]=input.nextInt();
				if (i==0 && sub==0)  
					{sub=sub+num[i];} // primeiro numero, ainda não subtrai com ninguem
				else
					{sub=sub-num[i];}
				i++;
				}
				while (i<x);
				
				System.out.println("A subtração é "+sub);
				
			}
			if (opção ==3) // Multiplicação
			{
				i=0;
				do
				{
				System.out.println("Introduza o "+(i+1)+"º numero");
				num[i]=input.nextInt();
				multi=multi*num[i];
				i++;
				}
				while (i<x);
				System.out.println("A multiplicação é "+multi);
				
			}
			if (opção ==4) // Divisão
			{
				i=0;
				do
				{
				System.out.println("Introduza o "+(i+1)+"º numero");
				num[i]=input.nextInt();
				System.out.println("divisao = "+div);
				if (i==0 && div==1) 
				{div=num[i]/div;}  // primeiro numero, ainda não divide com ninguem
				else
				{div=div/num[i];}
				System.out.println("divisao = "+div);
				i++;
				}
				while (i<x);
				System.out.println("A divisão é "+div);
				
			}
			opção=0;
		}
		System.out.println("Fim do programa");
}
}

