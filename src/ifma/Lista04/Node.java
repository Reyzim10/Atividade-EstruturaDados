package ifma.Lista04;

public class Node {
    private Aluno data;
    private Node next;

    public Node(Aluno data) {
        this.data = data;
        this.next = null;
    }

    public Aluno getData() {
        return data;
    }

    public void setData(Aluno data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

