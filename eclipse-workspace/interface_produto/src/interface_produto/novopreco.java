package interface_produto;

import javax.swing.JOptionPane;

public class novopreco {

	int escolha;
	float novovalor;
	
	int alterar_preço() 
	{
		escolha=Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o artigo a alterar?",JOptionPane.QUESTION_MESSAGE));
	//	escolha=JOptionPane.showInputDialog(null,"1 - "+p.artigo[0]+"  -->  "+ p.preço[0]+" €\n2 - "+p.artigo[1]+"  -->  "+p.preço[1]+" €\n3 - "+p.artigo[2]+"  -->  "+p.preço[2]+" €\n4 - "+p.artigo[3]+"  -->  "+p.preço[3]+" €\n5 - "+p.artigo[4]+"  -->  "+p.preço[4]+" €\n6 - "+p.artigo[5]+"  -->  "+p.preço[5]+" €\n\nQual o preço a alterar?","Lista produtos",JOptionPane.QUESTION_MESSAGE);
	//	System.out.println("O curso de "+this.curso+" tem a nota de entrada de "+this.nota);
		novovalor=Float.parseFloat(JOptionPane.showInputDialog(null,"€","Valor do produto",JOptionPane.QUESTION_MESSAGE));
		return escolha;
	}
}
