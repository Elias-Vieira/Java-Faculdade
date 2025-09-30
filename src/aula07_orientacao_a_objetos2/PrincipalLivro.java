package aula07_orientacao_a_objetos2;

/*Crie uma classe Livro com atributos privados: título, autor, ano e número de páginas. Adicione métodos
 para realizar a manipulação desses atributos (exibição(get) e definição(set)) e também crie um método
  para exibir informações sobre o livro chamado exibirDadosLivro(). Crie uma classe chamada
  PrincipalLivro e um arrayList do tipo Livro, defina valores para esses objetos e mostre na
  tela os valores desses objetos utilizando o método exibirDadosLivro().*/

import java.util.ArrayList;

public class PrincipalLivro {

    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();

        livros.add(new Livro("Harry_Potter", "J.K.Rowling", 2000, 223));
        livros.add(new Livro("Suicide_Squad", "Maysa", 2025, 753));
        livros.add(new Livro("Zé_Da_Manga", "Elias", 2007, 3));


        for (int i = 0; i < livros.size(); i++){
            System.out.println("\nLivro " + (i+1) + ":" + "\n");
            livros.get(i).exibirDadosDoLivro();
        }
    }

}
