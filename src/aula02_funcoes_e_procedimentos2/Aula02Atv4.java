package aula02_funcoes_e_procedimentos2;

/*Crie um método chamado calcularPotencia que aceita dois números inteiros, base e expoente,
como parâmetros e retorna a potência de base elevada a expoente.
*/

public class Aula02Atv4 {
    public static void main(String[] args) {

        System.out.println((int)calcularPotencia (2,3));

    }

    public static double calcularPotencia (int num1, int num2){
        return Math.pow(num1, num2);
    }
}

