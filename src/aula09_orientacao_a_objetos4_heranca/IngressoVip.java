package aula09_orientacao_a_objetos4_heranca;

public class IngressoVip extends Ingresso{

    double valorAdicional;

    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double exibirValorIngressoVip(){

        return exibirValorIngresso() + valorAdicional;

    }



}
