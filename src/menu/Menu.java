package menu;

import eventos.Evento;
import util.Situacao;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) {
        List<Evento> eventos = new ArrayList();
        MenuItem enumMenu;
        do {
            Integer resposta = montaMenu();
            enumMenu = MenuItem.getEnumFromValor(resposta);
            switch (enumMenu) {
                case CADASTRAR_EVENTO :
                    cadastra(eventos);
                break;
                case PESQUISA_EVENTO_NOME:
                    String pesquisaNome = JOptionPane.showInputDialog("Qual o Nome do Evento?");
                    boolean flag = false;
                    for(int i = 0; i < eventos.size(); i++) {
                        if(eventos.get(i).getNome().equals(pesquisaNome)) {
                            JOptionPane.showMessageDialog(null,eventos.get(i).toString());
                            flag = true;
                        }
                        if(flag == false) {
                            JOptionPane.showMessageDialog(null, "Não encontrou o Evento");
                        }
                    }
                    break;
                case PESQUISA_EVENTO_SITUACAO:
                    break;
                case PESQUISA_EVENTO_INSTITUICAO:
                    break;
                case SAIR:
                    System.exit(0);
                    break;
            }
        } while(enumMenu != MenuItem.SAIR);

    }
    private static int montaMenu(){
        String mnu = """
                1- Cadastrar Evento
                2- Pesquisar Evento Pelo Nome
                3- Pesquisar Evento Pela Instituicao
                4- Pesquisar Evento Pela Situacao
                5- Sair \s
                """;
        return  Integer.parseInt(JOptionPane.showInputDialog(mnu));
    }
    public static void cadastra(List<Evento>eventos) {
        String nomeEvento = JOptionPane.showInputDialog("Informe o Nome do Evento:");
        double taxaEvento = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de Inscricao do Evento:"));
        String dataEvento = JOptionPane.showInputDialog("Informe a data do Evento:");



    }

}
