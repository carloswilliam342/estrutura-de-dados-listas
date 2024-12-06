package lista01;

public class TestarAlunos {
    public static void main(String[] args) {
       
        cadastrarAlunos cadastro = new cadastrarAlunos(5);

       
        cadastro.adicionarNoFinal(new Aluno(3, "João"));
        cadastro.adicionarNoFinal(new Aluno(1, "Maria"));
        cadastro.adicionarNoFinal(new Aluno(5, "Ana"));
        cadastro.adicionarNoInicio(new Aluno(2, "Carlos"));

       
        System.out.println("Alunos cadastrados:");
        cadastro.exibirAlunos();


        cadastro.removerNoInicio();
        System.out.println("Após remover do início:");
        cadastro.exibirAlunos();

        
        cadastro.ordenarVetor();
        System.out.println("Após ordenar os alunos:");
        cadastro.exibirAlunos();

       
        String removido = cadastro.removerComIndice(1);
        System.out.println("Aluno removido: " + removido);
        System.out.println("Após remover pelo índice:");
        cadastro.exibirAlunos();
    }
}
