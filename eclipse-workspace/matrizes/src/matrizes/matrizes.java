package matrizes;

import java.util.Random;
import java.util.Scanner;

public class matrizes {

public static void main(String[] arg) { //não entram argumentos externos
		
		int i, opção=0;
		int esq[][] = new int[3][3]; // declara matriz bidimensional esquerda
		int drt[][] = new int[3][3]; // declara matriz bidimensional direita
		int res[][] = new int[3][3]; // declara matriz bidimensional resultado
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
			System.out.println("Numeros automáticos = 1     Inserir manual = 2");
			i = input.nextInt();
			Random gerador = new Random(); // declara objeto "gerador" para gerar numeros aleatorios
			
			for (int a = 0; a < 3; a++) // percorre as linhas 1 a 3 (0a2)
			{
				if (i==1)   // bloco numeros automáticos
				{
					for (int b=0; b < 3; b++) // percorre as colunas 1 a 3 (0a2)
					{esq[a][b]=gerador.nextInt(10)+1; // guarda numero aleatório entre 1 e 10 matriz esq
					drt[a][b]=gerador.nextInt(10)+1; // guarda numero aleatório entre 1 e 10 matriz drt					
					
					if (opção==1) {res[a][b]=esq[a][b]+drt[a][b];} // Soma
					if (opção==2) {res[a][b]=esq[a][b]-drt[a][b];} // Subtração
				
					// ------------ Multiplicação ---------------
					if (opção==3 && a==0 && b==0)  
					{	res[a][b]=0;	// resultado da posição linha1,coluna1
						res[a][b]=res[a][b]+(esq[a][b]*drt[a][b]);
					}
					if (opção==3 && a==1 && b==0)  // já ha valores nas matrizes para calcular
					{
						res[0][0]=res[0][0]+(esq[0][1]*drt[1][0]);
						res[1][0]=0;	// resultado da posição linha2,coluna1
						res[1][0]=res[1][0]+(esq[1][0]*drt[0][0]);
						res[0][1]=0;	// resultado da posição linha1, coluna2
						res[0][1]=res[0][1]+(esq[0][0]*drt[0][1]);
						res[1][1]=0;	// resultado da posição linha2, coluna2
						res[1][1]=res[1][1]+(esq[1][0]*drt[0][1]);
						res[0][2]=0;	// resultado da posição linha1, coluna3
						res[0][2]=res[0][2]+(esq[0][0]*drt[0][2]);
						res[1][2]=0;		// resultado da posição linha2, coluna3
						res[1][2]=res[1][2]+(esq[1][0]*drt[0][2]);
					}
					if (opção==3 && a==2 && b==0)  // já ha valores nas matrizes para calcular
					{
						res[0][0]=res[0][0]+(esq[0][2]*drt[2][0]);
						res[1][0]=res[1][0]+(esq[1][1]*drt[1][0]);
						res[1][0]=res[1][0]+(esq[1][2]*drt[2][0]);
						res[2][0]=0;	// resultado da posição linha3,coluna1
						res[2][0]=res[2][0]+(esq[2][0]*drt[0][0]);
						res[0][1]=res[0][1]+(esq[0][1]*drt[1][1]);
						res[1][1]=res[1][1]+(esq[1][1]*drt[1][1]);
						res[2][1]=0;	// resultado da posição linha3, coluna2
						res[2][1]=res[2][1]+(esq[2][0]*drt[0][1]);
						res[0][2]=res[0][2]+(esq[0][1]*drt[1][2]);
						res[1][2]=res[1][2]+(esq[1][1]*drt[1][2]);
						res[2][2]=0;		// resultado da posição linha3, coluna3
						res[2][2]=res[2][2]+(esq[2][0]*drt[0][2]);
					}
					if (opção==3 && a==2 && b==1)  // já ha valores nas matrizes para calcular
					{
						res[2][0]=res[2][0]+(esq[2][1]*drt[1][0]);
						res[0][1]=res[0][1]+(esq[0][2]*drt[2][1]);
						res[1][1]=res[1][1]+(esq[1][2]*drt[2][1]);
						res[2][1]=res[2][1]+(esq[2][1]*drt[1][1]);
						res[2][2]=res[2][2]+(esq[2][1]*drt[1][2]);
					}					
					if (opção==3 && a==2 && b==2)  // já ha valores nas matrizes para calcular
					{
						res[2][0]=res[2][0]+(esq[2][2]*drt[2][0]);
						res[2][1]=res[2][1]+(esq[2][2]*drt[2][1]);
						res[0][2]=res[0][2]+(esq[0][2]*drt[2][2]);
						res[1][2]=res[1][2]+(esq[1][2]*drt[2][2]);
						res[2][2]=res[2][2]+(esq[2][2]*drt[2][2]);
					}
					
					// Faltou fazer a divisão entre matrizes
					
					}
				}
				else  // bloco inserir numeros manuais
				{

				}
	
			 }
			System.out.println(esq[0][0]+"	"+esq[0][1]+"	"+esq[0][2]+"		"+drt[0][0]+"	"+drt[0][1]+"	"+drt[0][2]);
			System.out.println(esq[1][0]+"	"+esq[1][1]+"	"+esq[1][2]+"		"+drt[1][0]+"	"+drt[1][1]+"	"+drt[1][2]);
			System.out.println(esq[2][0]+"	"+esq[2][1]+"	"+esq[2][2]+"		"+drt[2][0]+"	"+drt[2][1]+"	"+drt[2][2]);
			System.out.println("Resultado:");
			System.out.println(res[0][0]+"	"+res[0][1]+"	"+res[0][2]);
			System.out.println(res[1][0]+"	"+res[1][1]+"	"+res[1][2]);
			System.out.println(res[2][0]+"	"+res[2][1]+"	"+res[2][2]);
		
		}
		System.out.println("Fim do programa");
}
}


