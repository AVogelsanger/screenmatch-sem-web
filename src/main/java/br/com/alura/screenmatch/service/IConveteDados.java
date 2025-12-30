package br.com.alura.screenmatch.service;

public interface IConveteDados {

    <T> T oberterDados(String json, Class<T> classe);
}
