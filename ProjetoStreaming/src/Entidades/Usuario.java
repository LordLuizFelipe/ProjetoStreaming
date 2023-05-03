package Entidades;

import Interfaces.Imprimivel;

public class Usuario implements Imprimivel {

    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {

        this.nome = nome;
        this.email = email;
        this.senha = String.valueOf(senha);
    }

    @Override
    public String getTitulo() {
        return null;
    }

    @Override
    public String getGenero() {
        return null;
    }

    @Override
    public double getAno() {
        return 0;
    }

    @Override
    public String getClassificacao() {
        return null;
    }

    @Override
    public String getSinopse() {
        return null;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public double getSenha() { return this.senha; }}
