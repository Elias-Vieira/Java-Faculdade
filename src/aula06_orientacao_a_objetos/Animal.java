package aula06_orientacao_a_objetos;

/*Escreva uma classe Animal que representa um animal com nome e espécie. Forneça métodos
para alterar e consultar os dados do animal. O construtor dessa classe deve estar vazio. Após o
usuário informar os dados, deve-se exibi-los na tela.*/

public class Animal {

    private String nome;
    private String especie;

    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEspecie(String especie){
        this.especie = especie;
    }


}
