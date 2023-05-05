package empresaXPTO;

import java.util.Scanner;

public class empresaXPTO {
	
public static void main(String[] arg) {
	
	int i=0, f, opção, total=0;
	int[] vendas;  // declara o array de inteiros        
	vendas = new int[10];  // atribui 10 posições no array 
	
	Scanner sc =new Scanner(System.in); //objeto sc
	
	do 
	{
	System.out.println("Quais as vendas do "+(i+1)+" vendedor (max 200.000 euros)?");
	vendas[i] = sc.nextInt();
	
	if (vendas[i]>=0 && vendas [i]<=200000) 
		{
		total=total+vendas[i];
		i++; 
		}
	}
	while (i<10);
	
	do
	{
	System.out.println("1. Alterar as vendas de um vendedor");
	System.out.println("2. Calcular o total de vendas");
	System.out.println("3. Calcular o iva a pagar das vendas efetuadas");
	System.out.println("4. Definir margem de lucro");
	System.out.println("5. Listar todos os vendedores e as suas vendas");
	System.out.println("Outro. Sair");
	opção = sc.nextInt();
	
	switch (opção) 
	{
	case 1:
		System.out.println("Qual o vendedor a alterar?");
		f = sc.nextInt();
		System.out.println("Qual o valor das vendas?");
		vendas[f-1]= sc.nextInt();
		break;
	case 2: System.out.println("O total de vendas é "+total);
	break;
	case 3: System.out.println("O iva a pagar das vendas é "+((total*1.23)-total));
	break;
	case 4: 
	System.out.println("Qual a percentagem de lucro? (percentagem)");
	f = sc.nextInt();
	System.out.println("A margem de lucro é "+(f*total)/100); 
	break;
	case 5:
	for (i=0;i<10;i++) System.out.println("Vendedor "+(i+1)+" teve vendas de "+vendas[i]+" euros"); 
	break;
	default: System.out.println("Fim do programa");
	}
	}
	while (opção==1 || opção==2 || opção==3 || opção==4 || opção==5);
}
}
