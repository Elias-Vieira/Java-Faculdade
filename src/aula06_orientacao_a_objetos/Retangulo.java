package aula06_orientacao_a_objetos;

/*Escreva uma classe Retangulo que representa um retângulo com altura(double),
largura(double) e área(double). Forneça métodos para calcular a área do retângulo e para
alterar e consultar os valores da altura e largura. O construtor deve estar vazio. O usuário deve
informar os valores de altura e largura e após isso, exibir o valor da área na tela. (Fórmula da
área é altura x largura)*/

public class Retangulo {

    private double altura;
    private double largura;
    private double area;

    public double calcularArea(){
        return altura * largura;
    }

    public double getAltura(){
        return altura;
    }

    public double getLargura(){
        return largura;
    }

    public double getArea() {
        return area;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public void setLargura(double largura){
        this.largura = largura;
    }

    public void setArea(double area){
        this.area = area;
    }
}
