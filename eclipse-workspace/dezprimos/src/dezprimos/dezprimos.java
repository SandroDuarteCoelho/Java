package dezprimos;

import java.util.Scanner; // biblioteca do Scanner 

public class dezprimos {

public static void main(String[] arg) { //não entram argumentos externos
		
		int a, cont=0;
	    int[] num;  // declara o array de inteiros 
	    num = new int[10];  // atribui 10 posições no array 
		int [] teste= {2, 3, 5, 7, 11, 13}; // declara o array e atribui valores
		Scanner sc =new Scanner(System.in); //objeto sc
		
		for(int i=0; i<10; i++)
		{
		System.out.println("Introduza o "+(i+1)+"º valor");
		num[i] = sc.nextInt();
		}
	
		a=0;
		do	
		{
			for (int i=0; i<=6; i++)
			{
				if (num[a] % teste[i] != 0) 
				{
				//	System.out.println(num[a]+ " dividir por "+teste[i]+ "dá resto "+(num[a] % teste[i]));
					if (num[a] / teste[i] < teste[i])
					{System.out.println(num[a]+ " é primo");
					cont++;
					i=7;}
				}
				else 
				{System.out.println(num[a]+ " não é primo");
				i=7;}
			}	
		a++;		
		}
		while (a<10);
		System.out.println("Existem "+cont+" numeros primos.");
		}
		
}

