package lista04;

public class Aluno {
    String nome;
    double primeiraNota;
    double segundaNota;

    // Construtor
    public Aluno(String nome, double primeiraNota, double segundaNota) {
        this.nome = nome;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
    }

    // Método toString
    @Override
    public String toString() {
        return "(" + nome + ", " + primeiraNota + ", " + segundaNota + ")";
    }
}
