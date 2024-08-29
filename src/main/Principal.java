
package main;

import iphone.Iphone;

public class Principal {
    public  static void main(String[] args){

        Iphone celular = new Iphone ();
        
        celular.selecionarMusica(" Beat it - Michael Jackson");
        celular.tocar();
        celular.pausar();

        celular.exibirPagina("www.google.com");
        celular.adicionddarNovaAba();
        celular.atualizarPagina();

        celular.ligar("21999999990");
        celular.atender();
        celular.iniciarCorreioVoz();
        

    }}
