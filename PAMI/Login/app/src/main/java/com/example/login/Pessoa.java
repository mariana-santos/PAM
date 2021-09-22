package com.example.login;

public class Pessoa {
    private String nome, email, telefone, assunto, mensagem;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public int getId(){ return id; }

    public void setId(int id){ this.id = id; }

    @Override
    public String toString(){
        String retorno = String.format("Id: %d\nNome: %s\nE-mail: %s\nTelefone: %s\nAssunto: %s\nMensagem: %s", id, nome, email, telefone, assunto, mensagem);
        return retorno;
    }
}

