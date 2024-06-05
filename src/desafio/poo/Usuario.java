package desafio.poo;

import java.util.Scanner;
import desafio.poo.Iphone;

public class Usuario {


	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Iphone iphone = new Iphone();
		int operacao;
		
		do{
		System.out.println("Selecione a opção: ");
		System.out.println("1 - Tocar música");
		System.out.println("2 - Pausar música");
		System.out.println("3 - Escolher música");
		System.out.println("4 - Efetuar ligação");
		System.out.println("5 - Atender ligação");
		System.out.println("6 - Correio de voz");
		System.out.println("7 - Acessar internet");
		System.out.println("8 - Adicionar nova aba");
		System.out.println("9 - Atualizar página");
		System.out.println("0 - Desligar aparelho\n");
		
		operacao = sc.nextInt();
		
		switch (operacao) {
			case 1:
				iphone.tocar();
				break;
			case 2:
				iphone.pausar();
				break;
			case 3:
				System.out.println("Digite o nome da música:\n ");
				String musica = sc.next();
				iphone.selecionarMusica(musica);
				break;
			case 4:
				System.out.println("Digite o número de telefone:\n");
				String numero = sc.next();
				iphone.ligar(numero);
				break;
			case 5:
				iphone.atender();
				break;
			case 6: 
				iphone.iniciarCorreioVoz();
				break;
			case 7:
				System.out.println("Digite o endereço da pagina:\n");
				String url = sc.next();
				iphone.exibirPagina(url);
				break;
			case 8:
				iphone.adicionarNovaAba();
				break;
			case 9:
				iphone.atualizarPagina();
				break;
			case 0: 
				System.out.println("Desligando aparelho:\n ");
				break;
			default:
				System.out.println("Opção invalida.\n");
				break;
			}
		} while (operacao != 0);
	}	
}