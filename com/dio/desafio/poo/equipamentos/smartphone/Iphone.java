package com.dio.desafio.poo.equipamentos.smartphone;

import com.dio.desafio.poo.equipamentos.celular.AparelhoTelefonico;
import com.dio.desafio.poo.equipamentos.navegador.NavegadorInternet;
import com.dio.desafio.poo.equipamentos.reprodutormusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando via iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo via iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio voz via iphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina via iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba via iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina via iphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música via iphone");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música via iphone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música via iphone");
    }
}
