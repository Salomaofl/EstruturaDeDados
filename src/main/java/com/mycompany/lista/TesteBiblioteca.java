package com.mycompany.lista;
import java.util.LinkedList;

public class TesteBiblioteca {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<String>();
        lista.add("Claudio");
        lista.add("Ana");
        lista.add("Pedro");
        lista.add("Mariana");
        
        
        System.out.println(lista);
        System.out.println("Tamanho da lista=" + lista.size());
        System.out.println("Inicio da lista=" + lista.getFirst());
        System.out.println("Fim da lista=" + lista.getLast());
        
    }
    
}
