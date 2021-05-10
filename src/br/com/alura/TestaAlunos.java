package br.com.alura;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Gabriel Moura");
        alunos.add("Gabriel Moura");
        alunos.add("Jandira Moura");
        alunos.add("Naiara Alves");
        alunos.add("Larissa Medeiros");
        alunos.add("José Carlos");
        alunos.add("Renan Oliveira");

        boolean pauloEstaMatriculado = alunos.contains("Gabriel Moura");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}
