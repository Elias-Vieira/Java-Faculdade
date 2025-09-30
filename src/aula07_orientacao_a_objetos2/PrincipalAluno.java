package aula07_orientacao_a_objetos2;

/*Crie uma classe Aluno com atributos privados: nome, matrícula e notas(vetor com 3 índices).
Implemente métodos para calcular a média das notas e verificar se o aluno está aprovado ou reprovado,
considerando que a média é 7(ou seja, será aprovado com média igual ou superior à 7).
Crie os métodos para realizar a manipulação dos atributos da classe. Crie a classe chamada
PrincipalAluno que irá conter um arrayList de Alunos que irá representar uma turma. Informe valores
para cada um desses objetos, mostre suas informações na tela (nome, matrícula e cada uma das notas)
e se foi aprovado ou reprovado. Além disso, na classe PrincipalAluno mostre na tela as seguintes informações:

Quantidade de alunos  na turma;
Média das notas da turma;
Quantidade de alunos aprovados;
Quantidade de alunos reprovados;
Aluno com maior nota;
Aluno com menor nota.
*/

import java.util.ArrayList;

public class PrincipalAluno {

    public static void main(String[] args) {

        ArrayList<Aluno> turma = new ArrayList<>();

        turma.add(new Aluno("Vinicios", "7891", new double[] {9.2, 9.8, 8.5} ));
        turma.add(new Aluno("Maysa", "7892", new double[] {7.2, 8.0, 8.5} ));
        turma.add(new Aluno("Zé", "7893", new double[] {5.7, 1.0, 4.1} ));
        turma.add(new Aluno("Elias", "7894", new double[] {10, 10, 10} ));

        double mediaDaTurma = 0.0;
        double maiorMedia = 0.0;
        double menorMedia = 10.0;
        String nomeAlunoMenor = "";
        String nomeAluno = "";
        int alunosAprovados = 0;

        for (int i = 0; i < turma.size(); i++){

            turma.get(i).exibirDadosAluno();

            mediaDaTurma += turma.get(i).calcularMedia();

            if (turma.get(i).calcularMedia() >= 7){
                alunosAprovados += 1;

                if (turma.get(i).calcularMedia() > maiorMedia){
                    maiorMedia = turma.get(i).calcularMedia();
                    nomeAluno = turma.get(i).getNome();
                }
            }

            if (turma.get(i).calcularMedia() < menorMedia){
                menorMedia = turma.get(i).calcularMedia();
                nomeAlunoMenor = turma.get(i).getNome();
            }
        }

        System.out.println("Quantidade de alunos da sala: " + turma.size());
        System.out.println("Média das notas da turma: " + mediaDaTurma / turma.size());
        System.out.println("Quantidade de alunos aprovados: " + alunosAprovados);
        System.out.println("Quantidade de alunos reprovados: " + (turma.size() - alunosAprovados));
        System.out.println("Aluno com maior nota: " + nomeAluno  + " com " + maiorMedia + " de média");
        System.out.println("Aluno com menor nota: "+ nomeAlunoMenor + " com " + menorMedia + " de média");



    }
}
