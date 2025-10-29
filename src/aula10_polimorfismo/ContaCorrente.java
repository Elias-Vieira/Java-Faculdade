package aula10_polimorfismo;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String numeroConta, String titular, double saldo){
        super(numeroConta, titular, saldo);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.println("Titular: " + getTitular());
        System.out.println("Saldo: " + getSaldo());
    }
}
