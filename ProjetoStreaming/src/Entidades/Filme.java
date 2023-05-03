package Entidades;

import Interfaces.Imprimivel;

public class Filme implements Imprimivel {

    private String titulo;
    private String genero;
    private double ano;
    private String sinopse;
    private String classificacao;

    public Filme(String titulo, String genero, String sinopse, double ano, String classificacao) {

        this.titulo = titulo;
        this.genero = genero;
        this.sinopse = sinopse;
        this.ano = ano;
        this.classificacao = classificacao;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getGenero() {
        return this.genero;
    }

    @Override
    public double getAno() {
        return this.ano;
    }

    @Override
    public String getSinopse() {
        return this.sinopse;
    }

    @Override
    public String getClassificacao() {
        return this.classificacao;
    }}