package aula07_orientacao_a_objetos2;

/*Crie uma classe Pessoa com atributos privados: nome, idade e altura. Adicione métodos para realizar
a manipulação desses atributos (exibição(get) e definição(set)). Crie uma classe chamada PrincipalPessoa,
e nesta classe crie pelo menos duas instâncias da classe Pessoa. Defina valores para essas instâncias
e mostre suas informações na tela.*/

import aula07_orientacao_a_objetos2.Pessoa;

public class PrincipalPessoa {

    public static void main(String[] args) {

        Pessoa elias = new Pessoa();
        Pessoa vinicios = new Pessoa();

        elias.setNome("Elias");
        elias.setIdade(25);
        elias.setAltura(180);


        vinicios.setNome("Vinicios");
        vinicios.setIdade(30);//talvez?
        vinicios.setAltura(175); ////talvez?

        System.out.println(elias.getNome() + "\n" + elias.getIdade() + "\n" + elias.getAltura());

        System.out.println();

        System.out.println(vinicios.getNome() + "\n" + vinicios.getIdade() + "\n" + vinicios.getAltura());


    }
}
