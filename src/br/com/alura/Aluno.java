package br.com.alura;

import java.util.Objects;

public class Aluno {

    private String nome;
    private int nrMatricula;

    public Aluno(String nome, int nrMatricula){
        if(nome == null) {
            throw new NullPointerException("nome nao pode ser null");
        }
        this.nome = nome;
        this.nrMatricula = nrMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNrMatricula() {
        return nrMatricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNrMatricula(int nrMatricula) {
        this.nrMatricula = nrMatricula;
    }

    @Override
    public boolean equals(Object o) {
        Aluno outro = (Aluno) o;
        return this.nome.equals(outro.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.nrMatricula + "]";
    }
}
