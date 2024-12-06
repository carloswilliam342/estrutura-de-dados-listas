package lista01;

public class Aluno {
    int codigo; // Código do aluno
    String nome; // Nome do aluno

    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String toString() {
        return "Aluno{" + "codigo=" + codigo + ", nome='" + nome + '\'' + '}';
    }
}
