package edu.dio.iphone.controller;

import edu.dio.iphone.interfaces.AparelhoTelefonico;
import edu.dio.iphone.interfaces.NavegadorInternet;
import edu.dio.iphone.interfaces.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    
    //Aparelho Telefonico
    public void atender() {
        System.out.println(">>  ALÔ!");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Você possui 5 mensagens de voz não ouvidas!\n");
    }

    public void ligar(String numero) {
        conferirSinal();
        System.out.println("Discando para " + numero +"\n .....\n   .....\n     Chamada efetuada!\n");
    }

    private void conferirSinal(){
        System.out.println("Você está dentro da área de cobertura!");
    }


    //Navegador de Internet
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página atual.");
    }

    public void exibirPagina(String url) {
        conferirConexao();
        System.out.println("A página " + url + " está sendo exibida agora.");
    }

    private void conferirConexao(){
        System.out.println("Você está conectado à internet");
    }


    //Reprodutor Musical
    public void tocar() {
        System.out.println("Reproduzindo sua música agora.");
    }    

    public void pausar() {
        System.out.println("\nSua música agora está em pausa.");
    }    

    public void selecionarMusica(String musica) {
        System.out.println("\nVocê selecionou a música \"" + musica + "\".");
    }    
}
