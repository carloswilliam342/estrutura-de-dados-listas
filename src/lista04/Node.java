package lista04;

public class Node {
    Aluno dado;
    Node proximo;
    Node anterior;


    public Node(Aluno dado) {
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
    }
}
