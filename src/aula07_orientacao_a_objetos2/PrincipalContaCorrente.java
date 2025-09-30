package aula07_orientacao_a_objetos2;

/*Crie uma classe ContaCorrente com atributos privados: saldo, número da conta e nome titular.
Crie um construtor para preencher cada um dos atributos dessa classe e também implemente métodos
para depositar(double valor), sacar(double valor) e verificarSaldo(). Crie uma classe chamada
PrincipalContaCorrente e crie um objeto do tipo ContaCorrente. Simule cada uma das operações
  (sacar, depositar e verificar saldo).*/

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalContaCorrente {

    public static void main(String[] args) {

        ArrayList<ContaCorrente> contas = new ArrayList<>();
        contas.add(new ContaCorrente(1500, 789654, "Elias"));
        contas.add(new ContaCorrente(0, 964636, "Maysa"));
        contas.add(new ContaCorrente(200000, 123456, "Vinicios"));//Professor é rico!

        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número da conta bancária: ");
        int contaBancaria = ler.nextInt();

        boolean achouConta = false;
        String exibirTexto = "";

        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNumeroDaConta() == contaBancaria) {
                achouConta = true;
                int opcao = 0;
                while (opcao != 4) {
                    if (opcao == 0){
                        System.out.println(
                                "\nOlá " + contas.get(i).getNomeDoTitular() +
                                        "\nO que gostaria de fazer hoje" +
                                        "\n1 - Depositar" +
                                        "\n2 - Sacar" +
                                        "\n3 - Consultar Saldo" +
                                        "\n4 - Sair"
                        );
                    } else {
                        System.out.println(
                                "\nOlá " + contas.get(i).getNomeDoTitular() +
                                        "\n" + exibirTexto +
                                        "\n1 - Depositar" +
                                        "\n2 - Sacar" +
                                        "\n3 - Consultar Saldo" +
                                        "\n4 - Sair"
                        );
                    }

                    opcao = ler.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("Digite o valor a ser depositado: ");
                            double valorDeposito = ler.nextDouble();
                            contas.get(i).depositar(valorDeposito);
                            exibirTexto = "Você depositou R$ " + valorDeposito + " Reais";
                            break;

                        case 2:
                            System.out.print("Digite o valor a ser sacado: ");
                            double valorSaque = ler.nextDouble();

                            if (contas.get(i).sacar(valorSaque) == true){
                                exibirTexto = "Você sacou R$ " + valorSaque + " Reais";
                            } else {
                                exibirTexto = "Infelismente você não tem saldo!";
                            }
                            contas.get(i).sacar(valorSaque);

                            break;

                        case 3:
                            exibirTexto = "Seu saldo em conta e de R$ " + contas.get(i).verificarSaldo() + " Reais";
                            break;

                        case 4:
                            System.out.println("Seção finalizada!");
                            break;

                        default:
                            System.out.println("Opção inválida!");
                            break;
                    }
                }
                break;
            }
        }

        if (!achouConta) {
            System.out.println("Conta inválida!");
        }

    }
}


