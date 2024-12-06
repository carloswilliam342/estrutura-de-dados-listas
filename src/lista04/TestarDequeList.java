package lista04;

public class TestarDequeList {
    public static void main(String[] args) {
        DequeList deque = new DequeList();


        deque.addLast(new Aluno("João", 8.5, 7.8));
        deque.addLast(new Aluno("Maria", 7.1, 9.0));
        deque.addLast(new Aluno("Carlos", 6.0, 8.0));

        System.out.println("Deque: " + deque);


        try {
            Node alunoEncontrado = deque.search("Maria");
            System.out.println("Aluno encontrado: " + alunoEncontrado.dado);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Removendo o primeiro: " + deque.removeFirst());
        System.out.println("Deque após remover o primeiro: " + deque);


        System.out.println("Removendo o último: " + deque.removeLast());
        System.out.println("Deque após remover o último: " + deque);
    }
}
