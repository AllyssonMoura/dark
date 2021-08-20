package com.allyssonmoura.cadastrotelas;

import java.io.Serializable;
import java.util.ArrayList;

public class Cadastro implements Serializable {

    public String nome;
    public byte idade;
    public String email;
    public String senha;
    private String confirmarSenha;
    private String genero;
    private ArrayList adicional;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public byte getIdade() {
        return idade;
    }
    public void setIdade(byte idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getConfirmarSenha() {
        return confirmarSenha;
    }
    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public ArrayList getAdicional() {
        return adicional;
    }
    public void setAdicional(ArrayList adicional) {
        this.adicional = adicional;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nIdade: " + idade +
                "\nEmail: " + email +
                "\nSenha: " + senha +
                "\nConfirmar Senha: " + confirmarSenha +
                "\nGênero: " + genero +
                "\nSuas Preferências: " + adicional;
    }
}
