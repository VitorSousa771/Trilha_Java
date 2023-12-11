// Exceção personalizada para divisão por zero
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

// Classe Calculadora
public class Calculadora {

    // Método para adição
    public int somar(int a, int b) {
        return a + b;
    }

    // Método para subtração
    public int subtrair(int a, int b) {
        return a - b;
    }

    // Método para multiplicação
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para divisão de inteiros
    public int dividir(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    // Método para divisão de floats
    public float dividir(float a, float b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Divisão por zero não permitida.");
        }
        return a / b;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        try {
            int resultadoDivisaoInteira = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão inteira: " + resultadoDivisaoInteira);

            float resultadoDivisaoFloat = calculadora.dividir(5.0f, 0.0f); // Isso lançará uma exceção
            System.out.println("Resultado da divisão float: " + resultadoDivisaoFloat);
        } catch (DivisionByZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
