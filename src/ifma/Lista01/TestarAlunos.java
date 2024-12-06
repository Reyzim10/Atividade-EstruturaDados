package ifma.Lista01;

public class TestarAlunos {
    public static void main(String[] args) {
        // Criar instância da classe CadastrarAlunos
        CadastrarAlunos cadastro = new CadastrarAlunos(5);

        // Criar alunos
        Aluno aluno1 = new Aluno(1, "MAT123", "João");
        Aluno aluno2 = new Aluno(3, "MAT456", "Maria");
        Aluno aluno3 = new Aluno(2, "MAT789", "José");

        // Testar métodos
        cadastro.adicionarNoFinal(aluno1);
        cadastro.adicionarNoInicio(aluno2);
        cadastro.adicionarNoFinal(aluno3);

        System.out.println("Vetor após adições:");
        cadastro.exibirVetor();

        System.out.println("\nRemovendo no final:");
        cadastro.removerNoFinal();
        cadastro.exibirVetor();

        System.out.println("\nRemovendo no início:");
        cadastro.removerNoInicio();
        cadastro.exibirVetor();

        System.out.println("\nAdicionando novamente:");
        cadastro.adicionarNoFinal(aluno3);
        cadastro.adicionarNoInicio(aluno1);

        System.out.println("\nVetor antes de ordenar:");
        cadastro.exibirVetor();

        System.out.println("\nVetor após ordenar:");
        cadastro.ordenarVetor();
        cadastro.exibirVetor();

        System.out.println("\nRemovendo aluno no índice 0:");
        System.out.println("Nome removido: " + cadastro.removerComIndice(0));
        cadastro.exibirVetor();
    }
}
