package aula07_orientacao_a_objetos2;

/*Crie uma classe Livro com atributos privados: título, autor, ano e número de páginas. Adicione métodos
 para realizar a manipulação desses atributos (exibição(get) e definição(set)) e também crie um método
 para exibir informações sobre o livro chamado exibirDadosLivro(). Crie uma classe chamada
 PrincipalLivro e um arrayList do tipo Livro, defina valores para esses objetos e mostre na
 tela os valores desses objetos utilizando o método exibirDadosLivro().*/

public class Livro {

    private String titulo;
    private String autor;
    private int ano;
    private int numeroDePaginas;

    public Livro (String titulo, String autor, int ano, int numeroDePaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numeroDePaginas = numeroDePaginas;
    }

    public void exibirDadosDoLivro(){

        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Páginas: " + numeroDePaginas);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
