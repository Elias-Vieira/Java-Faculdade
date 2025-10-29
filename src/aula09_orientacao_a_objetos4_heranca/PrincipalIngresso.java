package aula09_orientacao_a_objetos4_heranca;

public class PrincipalIngresso {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(10.00);
        IngressoVip adicional = new IngressoVip(ingresso.exibirValorIngresso(), 5);

        System.out.println("O valor do ingresso comum eh: " + ingresso.exibirValorIngresso());

        System.out.println("O valor do ingressso com adicional eh: " + adicional.exibirValorIngressoVip());
    }
}
