## RESOLUÇÃO DA PRÁTICA 03 - TRILHA BÁSICA EM JAVA
### ALUNO: Vitor Sousa Pereira
### TURMA: Turma 2


<p>
1. O que é uma exceção em Java e qual é o propósito de usá-las em programas?
</p>

Em java, uma exceção é um evento anormal que ocorre durante a execução de um programa e interrompe o fluxo normal de instruções. As exceções representam situações imprevistas ou erros que podem ocorrer durante a execução de um programa. O sistema de tratamento de exceções em Java permite lidar com essas situações de forma estruturada e controlada.

O propósito principal das exceções em Java é melhorar a robustez e a confiabilidade dos programas. Quando ocorre uma condição excepcional, uma exceção é lançada (thrown) pelo código que a detectou. Em seguida, o programa pode capturar (catch) e tratar (handle) essa exceção adequadamente.

A estrutura básica de tratamento de exceções em Java envolve três palavras-chave principais:

try: O bloco try contém o código suscetível a gerar uma exceção. Se ocorrer uma exceção dentro desse bloco, o controle é transferido para o bloco catch correspondente.

catch: O bloco catch contém o código que lida com a exceção lançada no bloco try. Cada bloco catch trata um tipo específico de exceção.

finally: O bloco finally é opcional e contém código que será executado independentemente de ocorrer ou não uma exceção. É geralmente usado para liberar recursos, como fechar arquivos ou conexões de banco de dados.

<p>
Pesquise sobre a diferença entre exceções verificadas e não verificadas em 
Java. Dê exemplos de cada uma. 
</p>
Em Java, exceções são eventos que indicam problemas durante a execução de um programa. Elas podem ser divididas em duas categorias principais: exceções verificadas (checked exceptions) e exceções não verificadas (unchecked exceptions).

Exceções Verificadas (Checked Exceptions):

Essas exceções são aquelas que o compilador exige que o programador lide explicitamente, seja através de tratamento de exceção ou pela declaração de que o método pode lançar a exceção.
Normalmente, essas exceções derivam da classe Exception (ou de suas subclasses, exceto RuntimeException e suas subclasses).
Exemplo:
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploExcecaoVerificada {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader(new File("arquivo.txt"));
            // Operações de leitura do arquivo
        } catch (IOException e) {
            e.printStackTrace();
            // Tratamento da exceção, como log, mensagem de erro, etc.
        }
    }
}

Exceções Não Verificadas (Unchecked Exceptions):

Essas exceções são aquelas que o compilador não exige tratamento ou declaração pelo programador. Elas geralmente derivam de RuntimeException (ou de suas subclasses).
Exemplos comuns incluem NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException, etc.
Exemplo:

public class ExemploExcecaoNaoVerificada {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        try {
            int valor = array[5]; // Isso lançará ArrayIndexOutOfBoundsException
            System.out.println(valor); // Nunca será alcançado devido à exceção
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            // Tratamento da exceção, como log, mensagem de erro, etc.
        }
    }
}

<p>
3. Como você pode lidar com exceções em Java? Quais são as palavras-chave e 
as práticas comuns para tratamento de exceções? 
</p>
Em Java, o tratamento de exceções é uma parte fundamental da programação, permitindo que você lide com situações imprevistas e evite que o programa termine abruptamente. O tratamento de exceções é geralmente feito usando as palavras-chave try, catch, finally e throw. Aqui estão algumas práticas comuns e palavras-chave associadas ao tratamento de exceções em Java:

try e catch:

try: Você envolve o código que pode gerar uma exceção dentro de um bloco try.
catch: Se uma exceção ocorrer dentro do bloco try, o controle é transferido para o bloco catch, onde você pode tratar a exceção.
Exemplo:
try {
    // Código que pode gerar uma exceção
} catch (TipoDeExcecao1 e) {
    // Tratamento para TipoDeExcecao1
} catch (TipoDeExcecao2 e) {
    // Tratamento para TipoDeExcecao2
} catch (Exception e) {
    // Tratamento genérico para exceções
}

finally:

O bloco finally é opcional e é usado para conter código que deve ser executado independentemente de ocorrer ou não uma exceção.
Exemplo:
try {
    // Código que pode gerar uma exceção
} catch (Exception e) {
    // Tratamento para exceções
} finally {
    // Código a ser executado independentemente de exceções
}

throw:

A palavra-chave throw é usada para explicitamente lançar uma exceção. Pode ser usada em conjunto com a palavra-chave throws na declaração de método para indicar que o método pode lançar exceções específicas.
Exemplo:

public void meuMetodo() throws MinhaExcecao {
    if (algumaCondicao) {
        throw new MinhaExcecao("Mensagem de erro");
    }
}

Cláusula throws em métodos:

Uma cláusula throws na declaração de método é usada para indicar que o método pode lançar exceções específicas. Quem chama esse método é obrigado a lidar com essas exceções.
Exemplo:

public void meuMetodo() throws MinhaExcecao1, MinhaExcecao2 {
    // Código que pode lançar MinhaExcecao1 ou MinhaExcecao2
}

Exceções personalizadas:

É uma prática comum criar exceções personalizadas estendendo a classe Exception ou suas subclasses. Isso permite que você crie exceções específicas para o seu aplicativo.
Exemplo:

public class MinhaExcecao extends Exception {
    // Construtores e métodos específicos, se necessário
}

Ao lidar com exceções em Java, é importante escolher o nível adequado de granularidade nas cláusulas catch e fornecer mensagens de erro significativas para facilitar a depuração. Além disso, evite capturar exceções genéricas sem necessidade, pois isso pode tornar mais difícil identificar e corrigir problemas no código.

<p>
O que é o bloco "try-catch" em Java? Como ele funciona e por que é 
importante usá-lo ao lidar com exceções?

</p>
Em Java, o bloco try-catch é utilizado para lidar com exceções, que são situações imprevistas ou erros que podem ocorrer durante a execução de um programa. O bloco try envolve o código onde a exceção pode ocorrer, e o bloco catch contém o código que será executado em caso de exceção.

A estrutura básica é a seguinte:
try {
    // Código onde uma exceção pode ocorrer
} catch (TipoDeExcecao1 e1) {
    // Código a ser executado se ocorrer TipoDeExcecao1
} catch (TipoDeExcecao2 e2) {
    // Código a ser executado se ocorrer TipoDeExcecao2
} catch (TipoDeExcecao3 e3) {
    // Código a ser executado se ocorrer TipoDeExcecao3
} finally {
    // Código a ser executado independentemente de ocorrer ou não uma exceção
}

Aqui está uma breve explicação dos componentes:

O bloco try contém o código onde uma exceção pode ocorrer. Se uma exceção ocorre, o controle é transferido para o bloco catch.

Os blocos catch são utilizados para capturar exceções específicas. Cada bloco catch lida com um tipo específico de exceção. Os parâmetros (TipoDeExcecao e) capturam a exceção do tipo especificado e permitem que você acesse informações sobre a exceção (como a mensagem de erro) dentro do bloco.

O bloco finally é opcional e contém código que será executado independentemente de ocorrer ou não uma exceção. Ele é frequentemente utilizado para ações que devem ser realizadas, como fechar recursos, independentemente de ocorrerem exceções.

A utilização do bloco try-catch é importante porque permite que o programa lide de maneira mais robusta com exceções. Sem o tratamento adequado de exceções, um erro inesperado poderia levar a uma terminação abrupta do programa, tornando-o menos robusto e menos amigável para o usuário. O uso do try-catch permite que você identifique, registre e trate as exceções de forma apropriada, mantendo o controle sobre o fluxo do programa mesmo quando ocorrem problemas.

<p>
Quando é apropriado criar suas próprias exceções personalizadas em Java e 
como você pode fazer isso? Dê um exemplo de quando e por que você criaria 
uma exceção personalizada. 

</p>
Em Java, criar suas próprias exceções personalizadas pode ser apropriado em situações em que você precisa lidar com erros específicos ou situações excepcionais em seu código que não são cobertas adequadamente pelas exceções padrão fornecidas pela linguagem. Isso permite que você forneça informações mais específicas sobre o problema e capture casos que são relevantes para o contexto de sua aplicação.

Aqui está um exemplo básico de como criar uma exceção personalizada em Java:

// Definição de uma exceção personalizada
class MinhaExcecaoPersonalizada extends Exception {
    public MinhaExcecaoPersonalizada(String mensagem) {
        super(mensagem);
    }
}

// Exemplo de uso da exceção personalizada
public class ExemploExcecaoPersonalizada {
    public static void main(String[] args) {
        try {
            // Simulando uma condição excepcional
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (MinhaExcecaoPersonalizada e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    // Método que pode lançar a exceção personalizada
    private static int dividir(int numerador, int denominador) throws MinhaExcecaoPersonalizada {
        if (denominador == 0) {
            // Lançando a exceção personalizada
            throw new MinhaExcecaoPersonalizada("Divisão por zero não permitida");
        }
        return numerador / denominador;
    }
}


Neste exemplo, criamos a exceção personalizada MinhaExcecaoPersonalizada que estende a classe Exception. Ela possui um construtor que permite fornecer uma mensagem específica ao criar uma instância da exceção. No método dividir, lançamos essa exceção se a condição para a divisão por zero for encontrada.

Também é possível criar suas próprias exceções personalizadas para situações como validações específicas do domínio, erros de negócios ou qualquer outro cenário em que uma exceção específica seja mais informativa do que as exceções padrão oferecidas pelo Java. Lembre-se de que o uso de exceções personalizadas deve ser feito com moderação, e é sempre uma boa prática documentar claramente o propósito da exceção personalizada em seus comentários.





