package aula03_funcoes_e_procedimentos3_matriz_vetor;

/*Crie um método chamado preencherVetor que recebe como parâmetro um vetor de inteiro de
tamanho qualquer. O método deverá retornar o vetor preenchido com valores aleatórios
entre 1 e 100.
*/

public class Aula03Atv1 {
    public static void main(String[] args) {

        int[] vetor = new int[10];
        vetor = preencherVetor(vetor);

    }

    public static int[] preencherVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++){

            vetor[i] = (int)(Math.random() * 100) + 1;
        }

        return vetor;
    }
}