package unidade7.POO;

public class Turma {
    Aluno[] alunos;
    int qtdAlunos;

    public Turma() {
        qtdAlunos = 0;
    }

    public Turma(int capacidade) {
        qtdAlunos = 0;
        alunos = new Aluno[capacidade];
    }

    boolean castrarAluno(int matricula, double nota, int frequencia) {
        if (qtdAlunos < alunos.length) {

            if (nota < 0.0 || nota > 10.0) {
                return false;
            }

            if (frequencia < 0 || frequencia > 20) {
                return false;
            }

            for (int i = 0; i < qtdAlunos; i ++) { // Se a matrícula existir vai retornar falso e o aluno não vai ser cadastrado.
                if (alunos[i].matricula == matricula) {
                    return false;
                }
            }

            Aluno novoAluno = new Aluno(matricula, nota, frequencia);
            alunos[qtdAlunos] = novoAluno;
            qtdAlunos++;
            return true;
        }
        return false;
    }

    void exibirDadosAlunos() {
        for (int i = 0; i < qtdAlunos; i ++) {
            Aluno aluno = alunos[i];
            aluno.imprimeAluno();;
        }
    }
}
