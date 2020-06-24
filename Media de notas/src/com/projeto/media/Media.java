package com.projeto.media;

import javax.swing.JOptionPane;

public class Media {

	public static void main(String[] args) {

		int nota1,nota2,nota3, nota4 ;
		
		
		nota1 =  Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
		if(nota1 < 0 || nota1 >10) {
			throw new RuntimeException("Nota digitada é inválida");    // EXCEPTION INTERROMPE O PROGRAMA EM CASO DE ERRO
		}
		 
		nota2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
		if(nota2 < 0 || nota2 >10) {
			throw new RuntimeException("Nota digitada é inválida");
		}

		
		nota3 =  Integer.parseInt(JOptionPane.showInputDialog("Digite sua terceira nota"));
		if(nota3 < 0 || nota3 >10) {
			throw new RuntimeException("Nota digitada é inválida");
		}
		
		nota4 =  Integer.parseInt(JOptionPane.showInputDialog("Digite sua quarta nota"));
		if(nota4 < 0 || nota4 >10) {
			throw new RuntimeException("Nota digitada é inválida");
		}

		
		
		double media = (nota1+nota2+nota3+nota4)/4;
		
		if(media < 6 ){
			JOptionPane.showMessageDialog(null," Sua média é : " +media + "    Você foi reprovado");
		}
		else if(media >= 6 ){
			JOptionPane.showMessageDialog(null," Sua média é : " +media + "    Você foi aprovado");
		}

	}

}
