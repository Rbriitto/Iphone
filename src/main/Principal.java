
package main;

import iphone.Iphone;

public class Principal {
    public static void main(String[] args){

        Iphone celular = new Iphone ();
        
        celular.selecionarMusica(" Beat it - Michael Jackson");
        celular.tocar(); 
        celular.pausar();

        System.out.println("\n");

        celular.exibirPagina("www.google.com");
        celular.adicionddarNovaAba();
        celular.atualizarPagina();

        System.out.println("\n");

        celular.ligar("2199999990");
        celular.atender();
        celular.iniciarCorreioVoz();
        

    }}
