package aula06_orientacao_a_objetos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Atividade 01

        Scanner ler = new Scanner(System.in);

        Data data = new Data(04, "08", 2000 );

        System.out.println("Digite o dia: ");
        int dia = ler.nextInt();

        System.out.println("Digite o mes: ");
        String mes = ler.next();

        System.out.println("Digite o ano: ");
        int ano = ler.nextInt();

        data.setDia(dia);
        data.setMes(mes);
        data.setAno(ano);

        data.imprimir();




        //Atividade 02

        Animal animal = new Animal();

        System.out.println("Digite o nome do animal: ");
        String nome = ler.next();

        System.out.println("Digite a especoie: ");
        String especie = ler.next();

        animal.setNome(nome);
        animal.setEspecie(especie);

        System.out.printf("%s, %s", animal.getNome(),  animal.getEspecie());




        //Atividade 03

        Retangulo retangulo = new Retangulo();

        System.out.println("\nDigite a altura: ");
        double altura = ler.nextDouble();

        System.out.println("Digite a largura: ");
        double largura = ler.nextDouble();

        retangulo.setAltura(altura);
        retangulo.setLargura(largura);

        System.out.println("A area desse retangulo eh " + retangulo.calcularArea());





        //Atividade 04

        Aluno [] alunos = new Aluno[3];

        for (int i = 0; i < 3; i++){

            System.out.println("digite o nome do aluno: 0" + (i+1) + " ");
            String nomeA = ler.next();

            System.out.println("Digite a matricula do aluno: ");
            String matricula = ler.next();

            System.out.println("Dite as notas do aluno: ");
            double[] notas = new double[3];
            for (int j = 0; j < 3; j++){
                System.out.printf("Nota %d: ", j+1);
                notas[j] = ler.nextDouble();
            }

            alunos[i] = new Aluno(nomeA, matricula, notas);

            System.out.printf("A media do aluno %s eh %.2f\n", alunos[i].getNome(), alunos[i].calcularMedia());

        }

    }
}
