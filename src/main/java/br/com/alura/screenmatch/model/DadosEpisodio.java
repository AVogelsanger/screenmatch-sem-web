package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosEpisodio(String titulo,
                            Integer numero,
                            String avaliacao,
                            String dataLancamento) {
}
