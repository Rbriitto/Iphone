package iphone;

import aparelhotelefonico.AparelhoTelefonico;
import aplicativomusica.AplicativoMusica;
import navegadorinternet.NavegadorInternet;

public class Iphone implements NavegadorInternet, AplicativoMusica, AparelhoTelefonico {
	
	
	
	@Override
	public void ligar(String numero) {
		System.out.println("Fazendo ligaçao");
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("...iniciando correio de voz");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionar Musica");
		
	}

	@Override
	public void tocar() {
		System.out.println("Musica Tocando ♫");
		
	}

	@Override
	public void pausar() {
		System.out.println("Musica Pausada ");
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo pagina");
		
	}

	@Override
	public void adicionddarNovaAba() {
		System.out.println("Adicionar nova Aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
	}
		
 }


