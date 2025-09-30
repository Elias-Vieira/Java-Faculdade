package aula06_orientacao_a_objetos;

/*Escreva uma classe Aluno que represente um aluno com nome, matrícula e notas(array).
Forneça métodos para alterar e consultar os dados do aluno e para calcular a média das notas.
No construtor deve constar o nome, a matrícula e a nota. Crie um array do tipo aluno com três
posições, e informe valores para cada um dos alunos.*/

public class Aluno {

    private String nome;
    private String matricula;
    private double[] notas =  new double[3];

    public Aluno(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;

        for (int i = 0; i < notas.length; i++){
            this.notas[i] = notas[i];
        }
    }

    public double calcularMedia(){
        return (notas[0] + notas[1] + notas[2]) / 3;
    }


    public String getNome(){
        return nome;
    }

    public String getMatricula(){
        return matricula;
    }

    public double[] notas (){
        return notas;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setNotas(double[] notas){
        this.notas = notas;
    }
}


