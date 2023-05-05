package cal2nums;

import java.util.Scanner;

public class cal2nums {

	public static void main(String[] arg) { //não entram argumentos externos
		
		int num1, num2, opção;
	    
		Scanner input =new Scanner(System.in); //objeto input
		
		System.out.println("Escolha uma opção");
		System.out.println("1. Soma");
		System.out.println("2. Subtração");
		System.out.println("3. Multiplicação");
		System.out.println("4. Divisão");
		System.out.println("0 .Sair");
		//System.out.println("Escolha uma opçã0");
		
		opção = input.nextInt();
		
		while (opção !=0) 
		{
			if (opção ==1)
			{
				System.out.println("Introduza primeiro numero");
				num1=input.nextInt();
				System.out.println("Introduza segundo numero");
				num2=input.nextInt();
				System.out.println("A soma é "+(num1+num2));
			}
			if (opção ==2)
			{
				System.out.println("Introduza primeiro numero");
				num1=input.nextInt();
				System.out.println("Introduza segundo numero");
				num2=input.nextInt();
				System.out.println("A subtração é "+(num1-num2));
			}
			if (opção ==3)
			{
				System.out.println("Introduza primeiro numero");
				num1=input.nextInt();
				System.out.println("Introduza segundo numero");
				num2=input.nextInt();
				System.out.println("A multiplicação é "+(num1*num2));
			}
			if (opção ==4)
			{
				System.out.println("Introduza primeiro numero");
				num1=input.nextInt();
				System.out.println("Introduza segundo numero");
				num2=input.nextInt();
				System.out.println("A divisão é "+(num1/num2));
			}
			opção=0;
		}
		System.out.println("Fim do programa");
}
}
