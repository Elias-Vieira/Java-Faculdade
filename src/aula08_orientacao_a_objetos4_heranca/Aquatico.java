package aula08_orientacao_a_objetos4_heranca;

public class Aquatico extends Transporte{

    private String tipoMotor;
    private int tamanho;

    public void ligarSirene(){
        System.out.println("Ligando a seirene");
    }

    public void deslizarLateral(){
        System.out.println("Deslizando a lateral");
    }
}
