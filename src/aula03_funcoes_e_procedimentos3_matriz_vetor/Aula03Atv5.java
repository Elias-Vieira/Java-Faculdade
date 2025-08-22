package aula03_funcoes_e_procedimentos3_matriz_vetor;

/*Crie um método chamador verificarQuadradoMagico que recebe uma matriz e
retorna true se for um quadrado mágico (somas de linhas, colunas e
diagonais são iguais).

*/

public class Aula03Atv5 {
    public static void main(String[] args) {
        int[][] matriz = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };

        System.out.println(verificarQuadradoMagico(matriz));
    }

    public static boolean verificarQuadradoMagico(int[][] matriz) {
        int tamanho = matriz.length;
        int somaRef = 0;
        for (int j = 0; j < tamanho; j++) somaRef += matriz[0][j];

        for (int i = 0; i < tamanho; i++) {
            int somaLinha = 0, somaCol = 0;
            for (int j = 0; j < tamanho; j++) {
                somaLinha += matriz[i][j];
                somaCol += matriz[j][i];
            }
            if (somaLinha != somaRef || somaCol != somaRef) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < tamanho; i++) {
            diag1 += matriz[i][i];
            diag2 += matriz[i][tamanho - 1 - i];
        }

        return diag1 == somaRef && diag2 == somaRef;
    }
}

