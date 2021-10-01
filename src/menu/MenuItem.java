package menu;

import java.util.Arrays;

public enum MenuItem {
    CADASTRAR_EVENTO(1),
    PESQUISA_EVENTO_NOME(2),
    PESQUISA_EVENTO_INSTITUICAO(3),
    PESQUISA_EVENTO_SITUACAO(4),
    SAIR(5);

    private final Integer valor;

    MenuItem(Integer valor) {
        this.valor = valor;
    }

    public Integer getValor() {
        return valor;
    }

    public static MenuItem getEnumFromValor(final Integer valor) {
        return Arrays.stream(MenuItem.values())
                .filter(enumItem -> enumItem.getValor().equals(valor))
                .findFirst()
                .orElse(null);
    }




}