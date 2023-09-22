package com.mycompany.lista;

/**
 *
 * @author salomao.flima
 */
public class ListaEncadeada<Tipo> {

    //Atributos da classe
    private No inicio;
    private No fim;
    private int tamanho;

    //Metodo Construtor
    public ListaEncadeada() {
        this.tamanho = 0;
    }

    //Aqui temos os metodos de acesso
    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }

    public No getFim() {
        return fim;
    }

    public void setFim(No fim) {
        this.fim = fim;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
// Metodo para exibir as informações

    @Override
    public String toString() {
        return "ListaEncadeada{" + "inicio=" + inicio + '}';
    }

    public void adiciona(Tipo elemento) {
        No<Tipo> celula = new No<Tipo>(elemento);
        if (this.inicio == null && this.fim == null) {
            this.inicio = celula;
            this.fim = celula;
        } else {
            this.fim.setProximo(celula);
            this.fim = celula;
        }
        this.tamanho++;

    }

    public No get(int posicao) {
        No atual = this.inicio;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public void remove(Tipo elemento) {
        No anterior = null;
        No atual = this.inicio;

        for (int i = 0; i < this.getTamanho(); i++) {
            if (this.tamanho == 1) {
                this.inicio = null;
                this.fim = null;
            } else if (atual == inicio) {
                this.inicio = atual.getProximo();
                atual.setProximo(null);
            } else if (atual == fim) {
                this.fim = anterior;
                anterior.setProximo(null);
            } else {
                anterior.setProximo(atual.getProximo());
                atual = null;
                this.tamanho--;
                break;
            }
            
        
        anterior = atual;
        atual = atual.getProximo();

    }

}
}
