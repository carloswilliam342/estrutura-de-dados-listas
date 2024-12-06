package lista04;

public class DequeList {
    private Node primeiro;
    private Node ultimo;

    public DequeList() {
        this.primeiro = null;
        this.ultimo = null;
    }


    public void addLast(Aluno aluno) {
        Node novo = new Node(aluno);

        if (primeiro == null) { // Lista vazia
            primeiro = novo;
            ultimo = novo;
        } else {
            ultimo.proximo = novo;
            novo.anterior = ultimo;
            ultimo = novo;
        }
    }


    public Node getFirst() {
        if (primeiro == null) {
            System.out.println("A lista está vazia.");
            return null;
        }
        return primeiro;
    }


    public Node getLast() {
        if (ultimo == null) {
            System.out.println("A lista está vazia.");
            return null;
        }
        return ultimo;
    }


    public Aluno removeFirst() {
        Node atualPrimeiro = getFirst();

        if (atualPrimeiro == null) return null; // Lista vazia

        primeiro = primeiro.proximo; // Avança o ponteiro para o próximo nó
        if (primeiro != null) primeiro.anterior = null; // Remove referência para o nó antigo

        if (primeiro == null) ultimo = null; // Lista ficou vazia

        return atualPrimeiro.dado;
    }


    public Aluno removeLast() {
        Node atualUltimo = getLast();

        if (atualUltimo == null) return null; // Lista vazia

        ultimo = ultimo.anterior; // Recuar o ponteiro para o nó anterior
        if (ultimo != null) ultimo.proximo = null; // Remove referência para o nó antigo

        if (ultimo == null) primeiro = null; // Lista ficou vazia

        return atualUltimo.dado;
    }


    public Node search(String nome) throws Exception {
        Node atual = primeiro;

        while (atual != null) {
            if (atual.dado.nome.equals(nome)) {
                return atual;
            }
            atual = atual.proximo;
        }

        throw new Exception("Aluno com o nome '" + nome + "' não encontrado.");
    }


    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        Node atual = primeiro;

        while (atual != null) {
            resultado.append(atual.dado);
            if (atual.proximo != null) {
                resultado.append(", ");
            }
            atual = atual.proximo;
        }

        resultado.append("]");
        return resultado.toString();
    }
}
