package lista01;

public class cadastrarAlunos {
    private Aluno[] alunos;
    private int tamanho;
    private int quantidade;


    public cadastrarAlunos(int tamanho) {
        this.tamanho = tamanho;
        this.alunos = new Aluno[tamanho];
        this.quantidade = 0;
    }


    public void adicionarNoFinal(Aluno aluno) {
        if (quantidade < tamanho) {
            alunos[quantidade] = aluno;
            quantidade++;
        } else {
            System.out.println("Vetor cheio. Não é possível adicionar.");
        }
    }


    public void adicionarNoInicio(Aluno aluno) {
        if (quantidade < tamanho) {

            for (int i = quantidade; i > 0; i--) {
                alunos[i] = alunos[i - 1];
            }
            alunos[0] = aluno;
            quantidade++;
        } else {
            System.out.println("Vetor cheio. Não é possível adicionar.");
        }
    }


    public void removerNoFinal() {
        if (quantidade > 0) {
            alunos[quantidade - 1] = null;
            quantidade--;
        } else {
            System.out.println("Vetor vazio. Não é possível remover.");
        }
    }


    public void removerNoInicio() {
        if (quantidade > 0) {

            for (int i = 0; i < quantidade - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[quantidade - 1] = null;
            quantidade--;
        } else {
            System.out.println("Vetor vazio. Não é possível remover.");
        }
    }


    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < quantidade && alunos[indice] != null;
    }


    public String removerComIndice(int indice) {
        if (verificarIndice(indice)) {
            String nomeRemovido = alunos[indice].nome;


            for (int i = indice; i < quantidade - 1; i++) {
                alunos[i] = alunos[i + 1];
            }
            alunos[quantidade - 1] = null;
            quantidade--;

            return nomeRemovido;
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }


    public void ordenarVetor() {
        for (int i = 0; i < quantidade - 1; i++) {
            for (int j = 0; j < quantidade - i - 1; j++) {
                if (alunos[j].codigo > alunos[j + 1].codigo) {
                    // Trocar os elementos
                    Aluno temp = alunos[j];
                    alunos[j] = alunos[j + 1];
                    alunos[j + 1] = temp;
                }
            }
        }
    }


    public void exibirAlunos() {
        System.out.print("[");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(alunos[i]);
            if (i < quantidade - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
