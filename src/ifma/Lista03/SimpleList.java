package ifma.Lista03;

public class SimpleList {
    private Node head;

    public SimpleList() {
        this.head = null;
    }

    // Adicionar no início
    public void adicionarInicio(int value) {
        Node newNode = new Node(value);
        newNode.setNext(head);
        head = newNode;
    }

    // Adicionar no final
    public void adicionarFim(int value) {
        if (head == null) {
            adicionarInicio(value);
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node(value));
        }
    }

    // Remover do começo
    public int removerComeco() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int removedData = head.getData();
        head = head.getNext();
        return removedData;
    }

    // Remover do final
    public int removerFinal() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        if (head.getNext() == null) {
            return removerComeco();
        }
        Node current = head;
        while (current.getNext().getNext() != null) {
            current = current.getNext();
        }
        int removedData = current.getNext().getData();
        current.setNext(null);
        return removedData;
    }

    // Encontrar o maior valor
    public int encontrarMaior() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int max = head.getData();
        while (current != null) {
            if (current.getData() > max) {
                max = current.getData();
            }
            current = current.getNext();
        }
        return max;
    }

    // Encontrar o menor valor
    public int encontrarMenor() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int min = head.getData();
        while (current != null) {
            if (current.getData() < min) {
                min = current.getData();
            }
            current = current.getNext();
        }
        return min;
    }

    // Calcular a média
    public double calcularMedia() {
        if (head == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = head;
        int sum = 0;
        int count = 0;
        while (current != null) {
            sum += current.getData();
            count++;
            current = current.getNext();
        }
        return (double) sum / count;
    }

    // Representação em string
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

