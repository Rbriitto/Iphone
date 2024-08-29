package iphone;

import aparelhotelefonico.AparelhoTelefonico;
import aplicativomusica.AplicativoMusica;
import navegadorinternet.NavegadorInternet;

public class Iphone implements NavegadorInternet, AplicativoMusica, AparelhoTelefonico {
	
	
	
	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecionarMusica(String musica) {
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionddarNovaAba() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		
	}
		
 }


