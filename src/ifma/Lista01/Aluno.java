package ifma.Lista01;

public class Aluno {
    private int codigo;
    private String matricula;
    private String nome;

    // Construtor
    public Aluno(int codigo, String matricula, String nome) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.nome = nome;
    }

    // Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Aluno [codigo=" + codigo + ", matricula=" + matricula + ", nome=" + nome + "]";
    }
}

