package trabalho15strings;

import java.util.Scanner;

public class trabalho15strings {
	
public static void main(String[] arg) {
	
	int i=0, f;
	String[] nome = new String [5];
	Scanner sc =new Scanner(System.in); //objeto sc
	
	do 
	{
		System.out.println("Introduza o "+(i+1)+"º nome completo");
		nome[i] = sc.nextLine(); 
		i++;
	}
    while (i<5);

	for (int m=0; m<5; m++) // percorre todos os nomes do 1º ao 5º
	{
		f = nome[m].indexOf(' '); // posição onde encontra o 1º espaço
		i = nome[m].lastIndexOf(' '); // posição onde encontra o ultimo espaço
	
		for (int a=0;a<f;a++) // percorre caracteres da string até ao 1º espaço
		{
			System.out.printf("%c", nome[m].charAt(a));
		}
		
		System.out.println(" "+nome[m].substring(i+1, nome[m].length())); // escreve o resto da string do ultimo espaço para a frente
	}
}
}
