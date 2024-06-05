package desafio.poo;

import desafio.poo.AparelhoTelefonico;
import desafio.poo.NavegadorWeb;
import desafio.poo.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical {
	
	//metodos reprodutor musica
	
	public void tocar() {
		System.out.println("Tocando musica.\n");
	}
	public void pausar() {
		System.out.println("Música pausada.\n");
	}
	public void selecionarMusica(String musica) {
		System.out.println("Musica selecionada: " + musica + "\n");
	}
	
	//metodos navegar web
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina: " + url + "\n");
	}

	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada.\n");
	}

	public void atualizarPagina() {
		System.out.println("Pagina atualizada.\n");
	}	
	
	//metodos aparelho telefonico
	public void ligar(String numero) {
		System.out.println("Ligando para o numero " + numero + "\n");
	}

	public void atender() {
		System.out.println("Atendendo ligação...\n");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado.\n");
	}
	
	
	
	
}
