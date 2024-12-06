package ifma.Lista04;

public class DequeList {
    private Node head;

    public DequeList() {
        this.head = null;
    }

    // Verifica se a lista está vazia
    public boolean isEmpty() {
        return head == null;
    }

    // Adiciona no início
    public void addFirst(Aluno aluno) {
        Node newNode = new Node(aluno);
        newNode.setNext(head);
        head = newNode;
    }

    // Adiciona no final
    public void addLast(Aluno aluno) {
        if (isEmpty()) {
            addFirst(aluno);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(aluno));
        }
    }

    // Retorna o primeiro nó
    public Node getFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        return head;
    }

    // Retorna o último nó
    public Node getLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current;
    }

    // Remove o primeiro nó
    public Aluno removeFirst() {
        Node firstNode = getFirst();
        head = head.getNext();
        return firstNode.getData();
    }

    // Remove o último nó
    public Aluno removeLast() {
        if (isEmpty()) {
            throw new RuntimeException("Lista vazia");
        }
        if (head.getNext() == null) {
            return removeFirst();
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        Aluno lastData = current.getNext().getData();
        current.setNext(null);
        return lastData;
    }

    // Procura por um aluno pelo nome
    public Node search(String nome) {
        Node current = head;
        while (current != null) {
            if (current.getData().getNome().equalsIgnoreCase(nome)) {
                return current;
            }
            current = current.getNext();
        }
        throw new RuntimeException("Aluno " + nome + " não encontrado.");
    }

    // Representação da lista
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node current = head;
        while (current != null) {
            sb.append(current.getData());
            if (current.getNext() != null) {
                sb.append(", ");
            }
            current = current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }
}
