package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracoesJogoTest {

    @Test
    public void deveRetornarNomeJogador() {
        ConfiguracoesJogo.getInstance().setNomeJogador("Jogador 1");
        assertEquals("Jogador 1", ConfiguracoesJogo.getInstance().getNomeJogador());
    }

    @Test
    public void deveRetornarNivelDificuldade() {
        ConfiguracoesJogo.getInstance().setNivelDificuldade("Difícil");
        assertEquals("Difícil", ConfiguracoesJogo.getInstance().getNivelDificuldade());
    }
}
