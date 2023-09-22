package com.mycompany.lista;
public class Lista {

    public static void main(String[] args) {
        ListaEncadeada <String> lista = new ListaEncadeada<>();
        
        System.out.println("Tamanho da Lista =" + lista.getTamanho());
        
        lista.adiciona("Cladio");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista=" + lista.getTamanho());
        System.out.println("Inicio da lista=" + lista.getInicio().getElemento());
        System.out.println("Fim da lista=" + lista.getFim().getElemento());
        
        
        lista.adiciona("Camila");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista=" + lista.getTamanho());
        System.out.println("Inicio da lista=" + lista.getInicio().getElemento());
        System.out.println("Fim da lista=" + lista.getFim().getElemento());
         
        
        lista.adiciona("Felipe");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista=" + lista.getTamanho());
        System.out.println("Inicio da lista=" + lista.getInicio().getElemento());
        System.out.println("Fim da lista=" + lista.getFim().getElemento());
        
        lista.adiciona("Ana");
        
        System.out.println(lista);
        System.out.println("Tamanho da lista=" + lista.getTamanho());
        System.out.println("Inicio da lista=" + lista.getInicio().getElemento());
        System.out.println("Fim da lista=" + lista.getFim().getElemento());
    }
}
