package org.example;

public class ConfiguracoesJogo {

    private ConfiguracoesJogo() {}
    private static ConfiguracoesJogo instance = new ConfiguracoesJogo();

    public static ConfiguracoesJogo getInstance() {
        return instance;
    }

    private String nomeJogador;
    private String nivelDificuldade;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }
}
