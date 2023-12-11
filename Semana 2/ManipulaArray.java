import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipulaArray {

    public static int[] criarArrayDoUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();

        int[] array = new int[tamanho];
        System.out.println("Digite os elementos do array:");

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int[] criarArrayAleatorio(int tamanho, int limiteSuperior) {
        Random random = new Random();
        int[] array = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(limiteSuperior);
        }

        return array;
    }

    public static int calcularSoma(int[] array) {
        int soma = 0;
        for (int num : array) {
            soma += num;
        }
        return soma;
    }

    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int num : array) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }

    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int num : array) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        int[] arrayUsuario = criarArrayDoUsuario();
        System.out.println("Array do usuário: " + Arrays.toString(arrayUsuario));

        int tamanhoAleatorio = 5;
        int limiteSuperior = 100;
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoAleatorio, limiteSuperior);
        System.out.println("Array aleatório: " + Arrays.toString(arrayAleatorio));

        int soma = calcularSoma(arrayUsuario);
        System.out.println("Soma do array do usuário: " + soma);

        int maiorValor = encontrarMaiorValor(arrayAleatorio);
        System.out.println("Maior valor do array aleatório: " + maiorValor);

        int menorValor = encontrarMenorValor(arrayAleatorio);
        System.out.println("Menor valor do array aleatório: " + menorValor);
    }
}

