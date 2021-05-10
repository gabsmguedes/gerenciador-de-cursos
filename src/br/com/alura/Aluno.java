package br.com.alura;

public class Aluno {

    private String nome;
    private int nrMatricula;

    public Aluno(String nome, int nrMatricula){
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
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.nrMatricula + "]";
    }
}
