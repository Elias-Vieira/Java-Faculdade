package aula02_funcoes_e_procedimentos2;

/*Crie um método chamado encontrarPrimosIntervalo que aceita dois números inteiros
(inicio e fim), como parâmetros e mostre na tela todos os números primos desse intervalo.
*/

public class Aula02Atv3 {
    public static void main(String[] args) {

        encontrarPrimosIntervalo(1,10);

    }

    public static void encontrarPrimosIntervalo(int num1, int num2){
        for (int i = num1; i < num2; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
