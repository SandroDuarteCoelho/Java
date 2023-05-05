package interface_produto;

/*
Alterar o código para ler ref artigo/preço numa classe, criar uma 
outra classe para novo preço e no No programa principal ler e imprimir 
uma compra com n linhas.
*/

import javax.swing.JOptionPane;

public class interface_produto {
public static void main(String[] args) { 

//	int codigoTaxaAumento; 
//	float valorProduto; 
	produto p = new produto();
	novopreco np = new novopreco();
//	String artigo[] = new String[6];
//	float preço [] = new float[6];
	int opção, i=0, esc;	

	int codigoTaxaAumento; 
	float total=0; 
	
	
	do
	{
	opção = Integer.parseInt(JOptionPane.showInputDialog(null,"1 - Inserir artigo\n2 - Alterar preço\n3 - Finalizar compra",null,JOptionPane.QUESTION_MESSAGE));

	if (opção==1)
	{
		p.ler_artigo(i);
		p.ler_preço(i);

		codigoTaxaAumento = Integer.parseInt(JOptionPane.showInputDialog(null,"Código","Código de taxa do aumento",JOptionPane.QUESTION_MESSAGE));
		switch (codigoTaxaAumento) { 
		case 1: p.preço[i]=p.preço[i]+(p.preço[i]*10/100);
		JOptionPane.showMessageDialog(null,"€" + p.preço[i],"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
		break;
		case 3: p.preço[i] = p.preço[i]+ (p.preço[i] * 25 / 100);
		JOptionPane.showMessageDialog(null,"€" + p.preço[i],"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE);
		break; 
		case 4: p.preço[i] = p.preço[i] + (p.preço[i] * 30 / 100);
		JOptionPane.showMessageDialog(null,"€ " + p.preço[i],"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE); 
		break;
		case 8: p.preço[i] = p.preço[i] + (p.preço[i] * 50 / 100);
		JOptionPane.showMessageDialog(null,"€ " + p.preço[i],"Valor do produto com taxa de aumento",JOptionPane.PLAIN_MESSAGE); 
		break;
		default: JOptionPane.showMessageDialog(null,"Código" + codigoTaxaAumento,"Código de taxa de aumento desconhcido",JOptionPane.PLAIN_MESSAGE);
		break;
		} 

		i++;
	}
	else
	{
		if (opção==2)
		{
			
			JOptionPane.showMessageDialog(null,"1 - "+p.artigo[0]+"  -->  "+ p.preço[0]+" €\n2 - "+p.artigo[1]+"  -->  "+p.preço[1]+" €\n3 - "+p.artigo[2]+"  -->  "+p.preço[2]+" €\n4 - "+p.artigo[3]+"  -->  "+p.preço[3]+" €\n5 - "+p.artigo[4]+"  -->  "+p.preço[4]+" €\n6 - "+p.artigo[5]+"  -->  "+p.preço[5]+" €\n\nQual o artigo a alterar?","Lista produtos",JOptionPane.PLAIN_MESSAGE);
			esc=Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o artigo a alterar?",JOptionPane.QUESTION_MESSAGE));
			np.alterar_preço();
		}
	}
	}
	while (opção!=3);
	for (int a=0; a<i; a++)
	{
	total=total+p.preço[a];
	}
	JOptionPane.showMessageDialog(null,"1 - "+p.artigo[0]+"  -->  "+ p.preço[0]+" €\n2 - "+p.artigo[1]+"  -->  "+p.preço[1]+" €\n3 - "+p.artigo[2]+"  -->  "+p.preço[2]+" €\n4 - "+p.artigo[3]+"  -->  "+p.preço[3]+" €\n5 - "+p.artigo[4]+"  -->  "+p.preço[4]+" €\n6 - "+p.artigo[5]+"  -->  "+p.preço[5]+" €\n\nTotal a pagar:"+total,"Lista produtos",JOptionPane.PLAIN_MESSAGE);
	
	System.exit(0);
}


	}
