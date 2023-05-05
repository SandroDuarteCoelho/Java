package media2nums;

import java.util.Scanner; // carrega biblioteca para scanner

public class media2nums {
	
	public static void main(String[] arg) { //não entram argumentos externos
	
	int n1;
	int n2;
	int soma;
	float media;

	Scanner sc =new Scanner(System.in); //objeto sc
	System.out.println("Introduza n1");
	n1 = sc.nextInt();
	System.out.println("Introduza n2");
	n2 = sc.nextInt();
	soma = n1 + n2;
	media = soma / 2;
	
	System.out.println("A média é "+ media);
	
	}
}