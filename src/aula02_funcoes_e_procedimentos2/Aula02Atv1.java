package aula02_funcoes_e_procedimentos2;

/*Crie um método chamado verificarPalindromo que aceita uma string como parâmetro e retorna true
se a string for um palíndromo (ou seja, pode ser lida da mesma forma da esquerda para a direita
e vice-versa), e false caso contrário.
*/

public class Aula02Atv1
{
    public static void main(String[] args) {

        String nome = "arara";

        System.out.printf("A palavra %s retornou %s para palindromo", nome, verificarPalindromo(nome));

    }
    public static Boolean verificarPalindromo(String texto){

        String textoInvertido = new StringBuilder(texto).reverse().toString().toUpperCase();

       return textoInvertido.equals(texto.toUpperCase());


    }
}