package aula03_funcoes_e_procedimentos3_matriz_vetor;

/*Crie um método chamado imprimirMatriz que recebe como parâmetro uma matriz de tamanho
qualquer. O método deverá imprimir todos os elementos dessa matriz na tela.
(Tente utilizar a função do exercício 3 para complementar a implementação desse método).
*/

public class Aula03Atv4 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        imprimirMatriz(preencherMatriz(matriz));
    }

    public static void imprimirMatriz  (int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print("\t" + matriz[i][j]);
            }
            System.out.println();
        }
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