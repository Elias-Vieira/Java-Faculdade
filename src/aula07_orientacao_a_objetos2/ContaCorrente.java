package aula07_orientacao_a_objetos2;

/*Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome titular.
Crie um construtor para preencher cada um dos atributos dessa classe e também implemente métodos
para depositar(double valor), sacar(double valor) e verificarSaldo(). Crie uma classe chamada
PrincipalContaCorrente e crie um objeto do tipo ContaCorrente. Simule cada uma das operações
  (sacar, depositar e verificar saldo).*/

public class ContaCorrente {

    private double saldo;
    private int numeroDaConta;
    private String nomeDoTitular;

    public ContaCorrente(double saldo, int numeroDaConta, String nomeDoTitular){

        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.nomeDoTitular = nomeDoTitular;
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Valor depositado!");
    }

    public boolean sacar(double valor){

        if (saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double verificarSaldo(){
        return saldo;
    }

    public String getNomeDoTitular(){
        return nomeDoTitular;
    }

    public int getNumeroDaConta(){
        return numeroDaConta;
    }
}
