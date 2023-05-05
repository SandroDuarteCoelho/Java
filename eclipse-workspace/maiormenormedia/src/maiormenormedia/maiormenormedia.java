package maiormenormedia;

import java.util.Scanner;

public class maiormenormedia {
	
	public static void main(String[] arg) { //não entram argumentos externos
		
		int n1, n2, n3;
		float media;
				
		Scanner sc =new Scanner(System.in); //objeto sc
		System.out.println("Introduza n1");
		n1 = sc.nextInt();
		System.out.println("Introduza n2");
		n2 = sc.nextInt();
		System.out.println("Introduza n3");
		n3 = sc.nextInt();
// Testa o maior
		if ((n1>n2 && n1>n3) || (n1>=n2 && n1>n3) || (n1>n2 && n1>=n3)) 
		{System.out.println("O maior é "+n1);}
			else
			{ if ((n2>n1 && n2>n3) || (n2>=n1 && n2>n3) || (n2>n2 && n2>=n3))
			{System.out.println("O maior é "+n2);}
				else
				{ if ((n3>n1 && n3>n2) || (n3>=n1 && n3>n2) || (n3>n1 && n3>=n2))
				{System.out.println("O maior é "+n3);}
		
				}
			}
// Testa o menor		
		if ((n1<n2 && n1<n3) || (n1<=n2 && n1<n3) || (n1<n2 && n1<=n3)) 
		{System.out.println("O menor é "+n1);}
			else
			{ if ((n2<n1 && n2<n3) || (n2<=n1 && n2<n3) || (n2<n2 && n2<=n3))
			{System.out.println("O menor é "+n2);}
				else
				{ if ((n3<n1 && n3<n2) || (n3<=n1 && n3<n2) || (n3<n1 && n3<=n2))
				{System.out.println("O menor é "+n3);}
		
				}
			}
// Quando iguais		
		if (n1==n2 && n1==n3)
		{System.out.println("Não existe maior nem menor e a média é igual a "+n3);}
		else
		{media = (n1 + n2 + n3) / 3;		
		System.out.println("A média é "+ media);
		}
	}
}
