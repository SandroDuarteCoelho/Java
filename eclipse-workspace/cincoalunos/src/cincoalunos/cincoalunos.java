package cincoalunos;

import java.io.IOException;
import java.util.Scanner;

public class cincoalunos {

public static void main(String[] arg)throws IOException { //não entram argumentos externos
		
		int i=0, f, max=0, min=20, moda=0;
		char opção;
		int[] notas;  // declara o array de inteiros
		int[] rep;
		rep= new int [5];
		notas = new int[5];  // atribui 5 posições no array 
		float media=0;
		Scanner sc =new Scanner(System.in); //objeto sc
		
		do 
		{
		System.out.println("Introduza nota do "+(i+1)+" aluno (1a20)?");
		notas[i] = sc.nextInt();	
		if (notas[i]>=1 && notas [i]<=20) 
			{
			if (notas[i]>max) max=notas[i];
			if (notas[i]<min) min=notas[i];
			rep[i]=0;
			i++;
			}
		}
		while (i<5);
	
		System.out.println("A. Média das notas");
		System.out.println("B. Nota máxima");
		System.out.println("C. Nota mínima");
		System.out.println("D. Moda das notas");
		opção = (char)System.in.read();
		
		media=(notas[0]+notas[1]+notas[2]+notas[3]+notas[4])/5;
		switch (opção)
		{
		case 'A': System.out.println("A média das nótas é "+media); // Média
		break;
		case 'B': System.out.println("A nota máxima é "+max); // Nota máxima
		break;
		case 'C': System.out.println("A nota minima é "+min); // Nota minima
		break;
		case 'D': // Moda
			for (i=0;i<5;i++)
			{
				for (f=0;f<5;f++) if (notas[i]==notas[f]) rep[i]=rep[i]+1;
//				System.out.println("moda "+i+" é "+rep[i]);	
			}
			for (i=0;i<5;i++) if (rep[i]>moda) moda=i;

			System.out.println("A moda é "+notas[moda]);
		break;
		default: System.out.println("Fim do programa");		
		}
		System.out.println("Fim do programa");		
		}
}

