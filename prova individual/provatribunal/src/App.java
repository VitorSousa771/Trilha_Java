import java.util.List;

// Classe que representa uma Pessoa (física ou jurídica)
class Pessoa {
    // Atributos e métodos relevantes para uma Pessoa
}

// Classe que representa um Advogado
class Advogado {
    // Atributos e métodos relevantes para um Advogado
}

// Classe que representa um Defensor Público
class DefensorPublico extends Advogado {
    // Atributos e métodos específicos para um Defensor Público
}

// Classe que representa uma Parte em um processo
class Parte {
    Pessoa pessoa;
    List<Advogado> advogados;

    // Métodos relevantes para uma Parte
}

// Enumeração para os diferentes Setores do Tribunal
enum Setor {
    SECRETARIA,
    DISTRIBUICAO,
    GABINETE_RELATOR,
    GABINETE_REVISOR,
    PLENARIO,
    GABINETE_PROLATOR,
    EXECUCAO,
    ARQUIVAMENTO
}

// Classe que representa um Processo
class Processo {
    int numeroProcesso;
    Parte parteAutora;
    Parte parteRequerida;
    List<Advogado> advogados;

    // Outros atributos e métodos relevantes para um Processo

    // Método para mover o processo para o próximo Setor
    void moverParaSetor(Setor setor) {
        // Lógica para mover o processo para o próximo setor
    }
}

// Classe que representa um Juiz
class Juiz {
    // Atributos e métodos relevantes para um Juiz
}

// Classe que representa um Julgamento
class Julgamento {
    Processo processo;
    Juiz relator;
    Juiz revisor;
    Juiz prolator;

    // Outros atributos e métodos relevantes para um Julgamento
}

// Classe principal que representa o Tribunal de Justiça
class TribunalDeJustica {
    List<Processo> processos;

    // Outros atributos e métodos relevantes para o Tribunal de Justiça
}
