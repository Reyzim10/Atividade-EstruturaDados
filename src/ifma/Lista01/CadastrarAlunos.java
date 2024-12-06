package ifma.Lista01;

import java.util.Arrays;

public class CadastrarAlunos {
    private Aluno[] vetor;
    private int tamanhoAtual;

    // Construtor
    public CadastrarAlunos(int tamanho) {
        vetor = new Aluno[tamanho];
        tamanhoAtual = 0;
    }

    // Adicionar no final
    public void adicionarNoFinal(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            vetor[tamanhoAtual] = aluno;
            tamanhoAtual++;
        } else {
            System.out.println("Erro: Sem espaço no vetor.");
        }
    }

    // Adicionar no início
    public void adicionarNoInicio(Aluno aluno) {
        if (tamanhoAtual < vetor.length) {
            for (int i = tamanhoAtual; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[0] = aluno;
            tamanhoAtual++;
        } else {
            System.out.println("Erro: Sem espaço no vetor.");
        }
    }

    // Remover no final
    public void removerNoFinal() {
        if (tamanhoAtual > 0) {
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        } else {
            System.out.println("Erro: Vetor vazio.");
        }
    }

    // Remover no início
    public void removerNoInicio() {
        if (tamanhoAtual > 0) {
            for (int i = 0; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        } else {
            System.out.println("Erro: Vetor vazio.");
        }
    }

    // Verificar índice
    public boolean verificarIndice(int indice) {
        return indice >= 0 && indice < tamanhoAtual && vetor[indice] != null;
    }

    // Remover por índice
    public String removerComIndice(int indice) {
        if (!verificarIndice(indice)) {
            throw new IllegalArgumentException("Erro: Índice inválido ou posição vazia.");
        }
        String nomeRemovido = vetor[indice].getNome();

        if (indice == 0) {
            removerNoInicio();
        } else if (indice == tamanhoAtual - 1) {
            removerNoFinal();
        } else {
            for (int i = indice; i < tamanhoAtual - 1; i++) {
                vetor[i] = vetor[i + 1];
            }
            vetor[tamanhoAtual - 1] = null;
            tamanhoAtual--;
        }

        return nomeRemovido;
    }

    // Ordenar vetor
    public void ordenarVetor() {
        Arrays.sort(vetor, 0, tamanhoAtual, (a, b) -> Integer.compare(a.getCodigo(), b.getCodigo()));
    }

    // Exibir vetor
    public void exibirVetor() {
        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(vetor[i]);
        }
    }
}

