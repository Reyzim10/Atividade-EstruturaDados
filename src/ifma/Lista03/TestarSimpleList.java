package ifma.Lista03;

public class TestarSimpleList {
    public static void main(String[] args) {
        SimpleList lista = new SimpleList();

        // Testando adição no início
        lista.adicionarInicio(10);
        lista.adicionarInicio(20);
        lista.adicionarInicio(30);
        System.out.println("Após adicionar no início: " + lista);

        // Testando adição no final
        lista.adicionarFim(40);
        lista.adicionarFim(50);
        System.out.println("Após adicionar no final: " + lista);

        // Testando remoção do início
        int removidoInicio = lista.removerComeco();
        System.out.println("Removido do início: " + removidoInicio);
        System.out.println("Lista após remover do início: " + lista);

        // Testando remoção do final
        int removidoFim = lista.removerFinal();
        System.out.println("Removido do final: " + removidoFim);
        System.out.println("Lista após remover do final: " + lista);

        // Testando maior valor
        int maior = lista.encontrarMaior();
        System.out.println("Maior valor: " + maior);

        // Testando menor valor
        int menor = lista.encontrarMenor();
        System.out.println("Menor valor: " + menor);

        // Testando cálculo da média
        double media = lista.calcularMedia();
        System.out.println("Média dos valores: " + media);

        // Testando representação em string
        System.out.println("Lista final: " + lista);
    }
}

