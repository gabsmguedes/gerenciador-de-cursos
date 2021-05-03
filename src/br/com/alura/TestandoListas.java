package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println("Listas aulas: " + aulas);

        aulas.remove(0);

        System.out.println("Removendo a primeira aula:" + aulas);

        for (String aula : aulas) {
            System.out.println("Mostrando aula por linha: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("Mostrando a primeira aula: " + primeiraAula);

        for(int i = 0; i < aulas.size(); i++){
            System.out.println("Aula: " + aulas.get(i));
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: " + aula);
        });

        aulas.add("Aumentando nosso conhecimento");
        Collections.sort(aulas);

        System.out.println("Lista ordenada: " + aulas);
    }
}
