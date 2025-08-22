package aula02_funcoes_e_procedimentos2;

/*Crie um método que calcule a tetração de um número. O método deverá receber dois valores
 como argumentos do tipo inteiro, sendo eles base(entre 1 e 7) e altura(entre 2 e 4).
 A tetração é dada da seguinte forma:	ab , onde b é a base e a sendo a altura.
  */

public class Aula02Atv5 {
    public static void main(String[] args) {
        System.out.println(calcularTetracao(7, 4));
    }

    public static long calcularTetracao(int base, int altura) {

        long resultado = base;
        for (int i = 1; i < altura; i++) {
            resultado = (long) Math.pow(base, resultado);
        }

        return resultado;
    }
}
