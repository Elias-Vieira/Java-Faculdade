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

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas = new double[3];

    public Aluno(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia(){
        return (notas[0] + notas[1] + notas[2]) / 3;
    }

    public String verificarAprovado(){
        if (calcularMedia() >= 7.0){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public void exibirDadosAluno(){
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        for (int i = 0; i < notas.length; i++){
            System.out.println("Nota " + (i+1) + " = " + notas[i]);
        }
        System.out.println("Situação: " + verificarAprovado());
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
