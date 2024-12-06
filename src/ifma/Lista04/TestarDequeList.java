package ifma.Lista04;

public class TestarDequeList {
    public static void main(String[] args) {
        DequeList deque = new DequeList();

        // Adicionando alunos
        Aluno aluno1 = new Aluno("João", 8.5, 7.8);
        Aluno aluno2 = new Aluno("Maria", 7.1, 9.0);
        Aluno aluno3 = new Aluno("Carlos", 6.8, 8.4);

        deque.addFirst(aluno1);
        deque.addLast(aluno2);
        deque.addLast(aluno3);

        System.out.println("Lista após adições: " + deque);

        // Obtendo o primeiro e o último
        System.out.println("Primeiro aluno: " + deque.getFirst().getData());
        System.out.println("Último aluno: " + deque.getLast().getData());

        // Removendo do início
        Aluno removidoInicio = deque.removeFirst();
        System.out.println("Removido do início: " + removidoInicio);
        System.out.println("Lista após remover do início: " + deque);

        // Removendo do final
        Aluno removidoFim = deque.removeLast();
        System.out.println("Removido do final: " + removidoFim);
        System.out.println("Lista após remover do final: " + deque);

        // Buscando aluno
        try {
            Node encontrado = deque.search("Maria");
            System.out.println("Aluno encontrado: " + encontrado.getData());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Buscando aluno inexistente
        try {
            deque.search("Pedro");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
