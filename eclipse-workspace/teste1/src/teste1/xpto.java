package teste1;

import java.util.Scanner;

public class xpto {

	public static void main(String[] arg) {
		
		Scanner input = new Scanner (System.in);
		vendedor n, eu;
		int total=0, k=0;
		n = new vendedor();
		eu = new vendedor();
		
		
		System.out.println("introduz limite");
		eu.limite= input.nextDouble();
		System.out.println("introduz vendas");
		n.vendas= input.nextInt();
		eu.vendas= input.nextInt();
		total=n.vendas+eu.vendas;
				
		
		if (eu.vlimite(total)==0)
			{
			System.out.println("excedeu o credito");
			}
			else
			{
			System.out.println("pode vender "+(eu.limite-total));
			}
		
		
		System.out.println("as vendas são "+n.vendas+"   "+eu.vendas+"  o limite é "+n.limite);
		}
		private static int  vlimite (int total) {
			return total;
		}
}
