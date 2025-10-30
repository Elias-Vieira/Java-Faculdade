package aula09_polimorfismo;

import java.util.ArrayList;

public class Banco {

    public static void main(String[] args) {

        ArrayList<ContaBancaria> contas = new ArrayList<>();

        contas.add(new ContaCorrente("789654", "Elias", 23.00));
        contas.add(new ContaPoupanca("123654", "Elias", 1500.00));


        for (int i = 0; i < contas.size(); i++){
            contas.get(i).mostrarInfo();
            System.out.println("------------------------------");
        }

    }
}
