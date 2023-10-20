package poo_java.projeto_iphone.exercicio_resolvido.classe_IPhone;

import poo_java.projeto_iphone.exercicio_resolvido.interfaces.Navegador;
import poo_java.projeto_iphone.exercicio_resolvido.interfaces.ReprodutorMusical;
import poo_java.projeto_iphone.exercicio_resolvido.interfaces.Telefone;

public class IPhone implements ReprodutorMusical, Telefone, Navegador {
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador do Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador do Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página no navegador do Iphone");
    }

    public void tocar() {
        System.out.println("Tocando música no Iphone");
    }

    public void pausar() {
        System.out.println("Pausando música no Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música no Iphone");
    }

    public void ligar() {
        System.out.println("Ligando pelo Iphone");
    }

    public void atender() {
        System.out.println("Atendendo pelo Iphone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo Iphone");
    }
}
