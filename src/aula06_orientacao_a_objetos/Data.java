package aula06_orientacao_a_objetos;

/*Escreva uma classe Data que representa uma data com dia(inteiro), mês(String) e ano(inteiro).
Forneça métodos para alterar e consultar os valores da data. No construtor deverá ser
informado os três valores (dia, mês e ano) obrigatoriamente. Informe os valores que forem
definidos no construtor na tela e após isso, o usuário deve informar os valores e exibi-los na
tela.*/

public class Data {

    private int dia;
    private String mes;
    private int ano;

    public Data(int dia, String mes, int ano){
        this.dia = dia;
        this.ano = ano;
        this.mes = mes;
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public void imprimir(){
        System.out.println(dia + "/" + mes + "/" + ano);
    }

    public int getDia(){
        return dia;
    }

    public int getAno(){
        return ano;
    }

    public String getMes(){
        return mes;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setMes(String mes){
        this.mes = mes;
    }
}
