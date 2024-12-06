package lista03;

public class SimpleList {
    private Node cabeca;

    public SimpleList() {
        this.cabeca = null;
    }


    public void adicionarInicio(int valor) {
        Node novo = new Node(valor);
        novo.proximo = cabeca; // O novo nó aponta para o antigo início
        cabeca = novo; // Atualiza a cabeça da lista
    }


    public void adicionarFim(int valor) {
        if (cabeca == null) {
            adicionarInicio(valor);
            return;
        }

        Node atual = cabeca;
        while (atual.proximo != null) { // Percorre até o último nó
            atual = atual.proximo;
        }

        atual.proximo = new Node(valor);
    }


    public int removerComeco() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return -1; // Valor indicando erro
        }

        int valorRemovido = cabeca.valor;
        cabeca = cabeca.proximo; // Atualiza a cabeça para o próximo nó
        return valorRemovido;
    }


    public int removerFinal() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return -1; // Valor indicando erro
        }

        if (cabeca.proximo == null) {
            int valorRemovido = cabeca.valor;
            cabeca = null; // A lista fica vazia
            return valorRemovido;
        }

        Node atual = cabeca;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }

        int valorRemovido = atual.proximo.valor;
        atual.proximo = null;
        return valorRemovido;
    }


    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        Node atual = cabeca;

        while (atual != null) {
            resultado.append(atual.valor);
            if (atual.proximo != null) {
                resultado.append(", ");
            }
            atual = atual.proximo;
        }

        resultado.append("]");
        return resultado.toString();
    }

    public int maiorValor() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return -1;
        }

        int maior = cabeca.valor;
        Node atual = cabeca.proximo;

        while (atual != null) {
            if (atual.valor > maior) {
                maior = atual.valor;
            }
            atual = atual.proximo;
        }

        return maior;
    }


    public int menorValor() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return -1;
        }

        int menor = cabeca.valor;
        Node atual = cabeca.proximo;

        while (atual != null) {
            if (atual.valor < menor) {
                menor = atual.valor;
            }
            atual = atual.proximo;
        }

        return menor;
    }


    public double mediaValores() {
        if (cabeca == null) {
            System.out.println("A lista está vazia.");
            return -1;
        }

        int soma = 0;
        int contador = 0;
        Node atual = cabeca;

        while (atual != null) {
            soma += atual.valor;
            contador++;
            atual = atual.proximo;
        }

        return (double) soma / contador;
    }
}
