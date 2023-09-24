import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDeTentativas = 0;

        System.out.println("Seja bem vindo ao AdvinhaQui!");
        System.out.println("Você tem 5 chances para advinhar o número aleatório entre 0 e 100.");
        System.out.println("Informaremos se a sua alternativa está excedendo ou não o número escolhido pelo sistema.");
        System.out.println("BOA SORTE!");

        while (numeroDeTentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            int numeroDigitado = leitor.nextInt();
            numeroDeTentativas++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabéns, você acertou o número em " + numeroDeTentativas + " tentativas!");
            } else if (numeroDigitado < numeroGerado) {
                System.out.println("Quase lá! O número digitado é menor que o número gerado, tente mais uma vez!");
            } else {
                System.out.println("Quase lá! O número digitado é maior que o número gerado, tente mais uma vez!");
            }
        }

        if (numeroDeTentativas == 5) {
            System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era: " + numeroGerado);
        }

    }
}
