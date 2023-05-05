package interface_produto;

import javax.swing.JOptionPane;

public class produto {
	
	float valorProduto;
	String artigo[] = new String[6];
	float preço [] = new float[6];
	int pos;
	
	int codigoTaxaAumento;
	
	int validar_codigo (int np) {
		
		if (np!=1 && np!=3 && np!=4 && np!=8) 
			{
			JOptionPane.showMessageDialog(null, "Código inválido (Insira 1, 3, 4 ou 8)",null, JOptionPane.PLAIN_MESSAGE);		
			return 0;
			}
			else
			{	return np;
			}
		}
	
	
	
	void ler_artigo(int i) 
	{
		artigo[i]=JOptionPane.showInputDialog(null,"Nome do produto",JOptionPane.QUESTION_MESSAGE);
	}
	
	
	void ler_preço(int i) 
	{
		preço[i]=Float.parseFloat(JOptionPane.showInputDialog(null,"€","Valor do produto",JOptionPane.QUESTION_MESSAGE));
	}	

}
