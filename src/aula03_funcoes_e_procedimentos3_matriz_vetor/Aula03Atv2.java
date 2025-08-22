package aula03_funcoes_e_procedimentos3_matriz_vetor;

/*Crie um método chamado preencherMatriz que recebe como parâmetro uma matriz de inteiro
 de tamanho qualquer. O método deverá retornar a matriz preenchido com valores aleatórios
  entre 1 e 100.
  */

public class Aula03Atv2 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        matriz = preencherMatriz(matriz);
    }

    public static int[][] preencherMatriz (int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int)(Math.random() * 100) + 1;
            }
        }

        return matriz;
    }
}
