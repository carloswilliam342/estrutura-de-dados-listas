package lista03;

public class TestarSimpleList {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarFim(5);
        lista.adicionarFim(15);

        System.out.println("Lista: " + lista);

        System.out.println("Maior valor: " + lista.maiorValor());
        System.out.println("Menor valor: " + lista.menorValor());
        System.out.println("Média dos valores: " + lista.mediaValores());

        System.out.println("Removendo do início: " + lista.removerComeco());
        System.out.println("Lista após remoção: " + lista);

        System.out.println("Removendo do final: " + lista.removerFinal());
        System.out.println("Lista após remoção: " + lista);
    }
}
