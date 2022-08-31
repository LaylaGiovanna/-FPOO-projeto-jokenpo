package br.senai.sp.jandira;

//importando as ferramentas
import java.util.Random;
import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class Jokenpo {

	public static void main(String[] args) {
    //import random é para aleatorizar variaveis e o scanner é para pegar o que foi escrito no teclado
		
        //declarando a variavel
		int movimentoDoUsuario;
		
		//adicionando o scanner e o random
		Scanner leitor = new Scanner(System.in);
		Random random = new Random();
		
		//cirando o movimento do computador
		int movimentoDoComputador = random.nextInt(3) + 1; // ou (1,4)
				
		//mensagem para o usuario
		System.out.println("********BEM-VINDO(A) AO JOKENPO********");
		System.out.println();
		
		System.out.print("Para começamos o jogo, será necessário que você digite o número que corresponde ao movimento desejado: \n\n 1) Pedra \n 2) Papel \n 3) Tesoura \n \n digite aqui a sua escolha de 1 a 3:");
		
		movimentoDoUsuario = leitor.nextInt();
		
		
		//colocando as condições do jogo
		if (movimentoDoUsuario == 1 && movimentoDoComputador == 1) {System.out.print(" Você escolheu PEDRA! \n O computador escolheu PEDRA! \n********EMPATE!********"); }
		
		if (movimentoDoUsuario == 1 && movimentoDoComputador == 2) {System.out.print(" Você escolheu PEDRA! \n O computador escolheu PAPEL! \n********O COMPUTADOR VENCEU!********"); }
		
		if (movimentoDoUsuario == 1 && movimentoDoComputador == 3) {System.out.print(" Você escolheu PEDRA! \n O computador escolheu TESOURA! \n********VOCÊ VENCEU!********"); }
		
		if (movimentoDoUsuario == 2 && movimentoDoComputador == 1) {System.out.print(" Você escolheu PAPEL! \n O computador escolheu PEDRA! \n********VOCÊ VENCEU!********"); }
		
		if (movimentoDoUsuario == 2 && movimentoDoComputador == 2) {System.out.print(" Você escolheu PAPEL! \n O computador escolheu PAPEL! \n********EMPATE!********"); }
		
		if (movimentoDoUsuario == 2 && movimentoDoComputador == 3) {System.out.print(" Você escolheu PAPEL! \n O computador escolheu TESOURA! \n********O COMPUTADOR VENCEU!********"); }
		
		if (movimentoDoUsuario == 3 && movimentoDoComputador == 1) {System.out.print(" Você escolheu TESOURA! \n O computador escolheu PEDRA! \n********O COMPUTADOR VENCEU!********"); }
		
		if (movimentoDoUsuario == 3 && movimentoDoComputador == 2) {System.out.print(" Você escolheu TESOURA! \n O computador escolheu PAPEL! \n********VOCÊ VENCEU!********"); }
		
		if (movimentoDoUsuario == 3 && movimentoDoComputador == 3) {System.out.print(" Você escolheu TESOURA! \n O computador escolheu PAPEL! \n********TESOURA!********"); }
		
		if (movimentoDoUsuario < 0 || movimentoDoUsuario > 3) {System.out.print("Jogador escolheu opção incorreta. Jogo cancelado!!");}
		
		System.out.println("\n");
		System.out.println("Aperte a tecla F11 para jogar novamente");
		
		}
			
}	

