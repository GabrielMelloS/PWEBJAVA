package com.aulapweb.demo;

public class Contato {

    public Contato() {

    }
    public Contato(String id, String nome, String telefone){
        this.id = id;
        this.nome = nome;
        this.telefone = telefone; 
    }
    
    private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String nome;
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private String telefone;
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
