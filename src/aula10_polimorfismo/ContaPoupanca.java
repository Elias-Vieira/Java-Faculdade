package aula10_polimorfismo;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String numeroConta, String titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    @Override
    public void mostrarInfo(){

        double rendimento = getSaldo() * 0.05;
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + (getSaldo() + rendimento));
    }
}
