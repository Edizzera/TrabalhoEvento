package util;
import java.util.Arrays;

public enum Situacao {
    EM_ANDAMENTO(1,"em andamento"),
    CANCELADO(2,"cancelado"),
    ENCERRADO(3,"encerrado");

    private  String nome;
    private final Integer valor;

    Situacao(Integer valor,String nome) {
        this.valor = valor;
        this.nome = nome;
    }
    public String getNomeStatus() {
        return nome;
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
