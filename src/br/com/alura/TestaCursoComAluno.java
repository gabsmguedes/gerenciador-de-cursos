package br.com.alura;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        Aluno aluno1 = new Aluno("Gabriel Moura", 4545);
        Aluno aluno2 = new Aluno("Jandira Moura", 1234);
        Aluno aluno3 = new Aluno("José Carlos", 6544);

        javaColecoes.matricula(aluno1);
        javaColecoes.matricula(aluno2);
        javaColecoes.matricula(aluno3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);

        System.out.println("O aluno " + aluno1 + "esta matriculado?");
        System.out.println(javaColecoes.estMatriculado(aluno1));

        Aluno turini = new Aluno("Gabriel Moura", 4545);
        System.out.println("O aluno " + turini + "esta matriculado?");
        System.out.println(javaColecoes.estMatriculado(turini));

        System.out.println("O a1 é equals ao Gabriel Moura");
        System.out.println(aluno1.equals(turini));

        System.out.println(aluno1.hashCode() == turini.hashCode());
    }
}
