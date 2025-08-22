package aula03_funcoes_e_procedimentos3_matriz_vetor;

/*Crie um método chamado imprimirVetor que recebe como parâmetro um vetor de
tamanho qualquer. O método deverá imprimir todos os elementos desse vetor na
 tela.
 */

public class Aula03Atv3 {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        imprimirVetor(preencherVetor(vetor));

    }

    public static void imprimirVetor(int[] vetor){

        for (int i = 0; i < vetor.length; i++){

            System.out.print(" " + vetor[i]);
        }

    }

    public static int[] preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){

            vetor[i] = (int)(Math.random() * 100) + 1;
        }

        return vetor;
    }
}
