package menu;

import java.util.Arrays;

public enum MenuItem {
    CADASTRAR_EVENTO(1,"1 - Cadastra Evento"),
    PESQUISA_EVENTO_NOME(2,"2 - Pesquisa Evento Pelo Nome"),
    PESQUISA_EVENTO_INSTITUICAO(3,"3 - Pesquisa Evento Pela Instituicao"),
    PESQUISA_EVENTO_SITUACAO(4," 4- Pesquisar Evento Pela Situacao"),
    SAIR(5,"5 - Sair");

    private String nome;
    private final Integer valor;

    MenuItem(Integer valor, String nome) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {return nome;}

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