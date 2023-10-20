package poo_java.projeto_iphone.exercicio_resolvido.main;

import poo_java.projeto_iphone.exercicio_resolvido.classe_IPhone.IPhone;

public class Smarthphone {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("\nFunções do telefone:");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("\nFunções do reprodutor musical:");
        iphone.selecionarMusica();
        iphone.tocar();
        iphone.pausar();

        System.out.println("\nFunções Navegador:");
        iphone.adicionarNovaAba();
        iphone.exibirPagina();
        iphone.atualizarPagina();
    }


}
