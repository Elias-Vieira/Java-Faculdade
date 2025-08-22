package aula01_funcoes_e_procedimentos;

/*Escreva uma função que retorne a mensagem Hello world!.*/

public class Aula01Atv8 {

    public static void main(String[] args) {
        String texto = mensagem();
        System.out.printf("%s%n", texto);
    }

    public static String mensagem() {
        return "Hello world!";
    }
}
