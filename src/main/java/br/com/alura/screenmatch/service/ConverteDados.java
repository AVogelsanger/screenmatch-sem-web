package br.com.alura.screenmatch.service;

import tools.jackson.databind.ObjectMapper;

public class ConverteDados implements IConveteDados {
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public <T> T oberterDados(String json, Class<T> classe) {
        return mapper.readValue(json, classe);
    }
}
