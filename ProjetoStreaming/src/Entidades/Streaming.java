package Entidades;

import Interfaces.Imprimivel;

import java.util.ArrayList;

public class Streaming {

    private ArrayList<Imprimivel> listaStreaming;

    public Streaming(){
        this.listaStreaming = new ArrayList<>();
    }

    public void mostrarProdutos(){
        for (Imprimivel p : this.listaStreaming){
            System.out.println("O meu produto é: " + p.getNome());

        }
    }

    public void adicionarFilme(Imprimivel imprimivel) {
        this.listaStreaming.add(imprimivel);

    }
}