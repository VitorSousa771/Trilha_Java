import java.util.Scanner;

public class ConversorDeMoeda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário a taxa de câmbio
        System.out.print("Digite a taxa de câmbio (por exemplo, de dólares para euros): ");
        double taxaCambio = scanner.nextDouble();

        // Solicitar ao usuário a quantidade em dólares
        System.out.print("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        // Calcular o valor convertido
        double valorConvertido = quantidadeDolares * taxaCambio;

        // Exibir o resultado
        System.out.println("O valor convertido é: " + valorConvertido);
    }
}
