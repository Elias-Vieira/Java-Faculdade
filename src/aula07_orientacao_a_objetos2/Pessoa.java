package aula07_orientacao_a_objetos2;

/*Crie uma classe Pessoa com atributos privados: nome, idade e altura. Adicione métodos para realizar
a manipulação desses atributos (exibição(get) e definição(set)). Crie uma classe chamada PrincipalPessoa,
e nesta classe crie pelo menos duas instâncias da classe Pessoa. Defina valores para essas instâncias
e mostre suas informações na tela.*/

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
