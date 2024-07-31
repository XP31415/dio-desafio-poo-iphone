package edu.dio.iphone;

import java.util.Scanner;

import edu.dio.iphone.controller.Smartphone;
public class Iphone{
    public static void main(String[] args) {
        Smartphone smart = new Smartphone();
        Scanner scan = new Scanner(System.in);

        System.out.println("==========================\nAparelho Telefônico\n==========================");
        smart.iniciarCorreioVoz();
        smart.ligar("(11)94444-8888");
        smart.atender();
        
        System.out.println("\n==========================\nNavegador de Internet\n==========================");
        smart.adicionarNovaAba();
        smart.exibirPagina("https://web.dio.me/");
        smart.atualizarPagina();
        
        System.out.println("\n==========================\nReprodutor de Músicas\n==========================");
        System.out.print("Digite o nome da música que você deseja:\n  >> ");
        smart.selecionarMusica(scan.nextLine());
        smart.tocar();
        smart.pausar();

        scan.close();
    }
}
