package Aparelho;

import Aplicativos.AparelhoTelefonico;
import Aplicativos.NavegadorInternet;
import Aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
		System.out.println("Tocando música via Iphone");
	}
	public void pausar() {
		System.out.println("Pausando música via Iphone");
	}

	public void selecionarMusica() {
		System.out.println("Selecionando música via Iphone");
	}

	public void ligar() {
		System.out.println("Ligando via Iphone");
	}

	public void atender() {
		System.out.println("Atendendo via Iphone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("iniciando correio de voz via Iphone");
	}

	public void exibirPagina() {
		System.out.println("Exibindo página via Iphone");
	}

	public void addicionarNovaAba() {
		System.out.println("Adiccionando nova aba via Iphone");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página via Iphone");
	}
}

