package util;
import java.util.Arrays;

public enum Situacao {
    EM_ANDAMENTO(1),
    CANCELADO(2),
    ENCERRADO(3);

    private  String nome;
    private final Integer valor;

    Situacao(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static Situacao getEnumFromValor(final Integer valor) {
        return Arrays.stream(Situacao.values())
                .filter(enumItem -> enumItem.getValor().equals(valor))
                .findFirst()
                .orElse(null);
    }
}
