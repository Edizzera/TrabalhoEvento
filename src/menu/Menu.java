package menu;

import eventos.Evento;
import eventos.Local;
import pessoas.Participante;
import util.Situacao;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    public static void main(String[] args) throws ParseException {
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
                    pesquisaEventoNome(eventos);
                    break;
                case PESQUISA_EVENTO_SITUACAO:
                    pesquisaEventoStatus(eventos);
                    break;
                case PESQUISA_EVENTO_INSTITUICAO:
                    pesquisaEventoInstituicao(eventos);
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
    private static  int setStatus(){
        String status = """
                Informe o Status do Evento:
                1- Em andamento
                2- Cancelado
                3- Encerrado \s
                """;
        return Integer.parseInt(JOptionPane.showInputDialog(status));
    }
    public static void cadastra(List<Evento>eventos) throws ParseException {
        //Cria Evento
        String nomeEvento = JOptionPane.showInputDialog("Informe o Nome do Evento:");
        double taxaEvento = Double.parseDouble(JOptionPane.showInputDialog("Informe a taxa de Inscricao do Evento:"));
        String dataEvento = JOptionPane.showInputDialog("Informe a data do Evento:");

        Situacao enumStatus;
        Integer resp = setStatus();
        enumStatus = Situacao.getEnumFromValor(resp);


        //cria Local
        List<Local> locais = new ArrayList();
        String inst = JOptionPane.showInputDialog("Informe a instituicao do evento:");
        String localTel = JOptionPane.showInputDialog("Informe Telefone da Instituicao:");
        String localOrg = JOptionPane.showInputDialog("Informe o Organizador do evento:");
        Local local = new Local(inst,localTel, localOrg);
        locais.add(local);

        //Cria Participante
        List<Participante>participantes = new ArrayList();
        int numeroParticipantes = Integer.parseInt(JOptionPane.showInputDialog("Qual o número de participantes?"));
        for(int cont = 0; cont < numeroParticipantes; cont++){
            String nome = JOptionPane.showInputDialog("Informe Nome do Participante:");
            String end = JOptionPane.showInputDialog(" Informe Endereço do Participante:");
            String cpf = JOptionPane.showInputDialog(" Informe CPF do Participante:");
            String tel = JOptionPane.showInputDialog(" Informe telefone do Participante:");
            String mail = JOptionPane.showInputDialog(" Informe E-mail do Participante:");
            Participante participante = new Participante(nome,end,cpf,tel,mail);
            participantes.add(participante);
        }
        Evento evento = new Evento(nomeEvento,taxaEvento,dataEvento,participantes,locais,enumStatus);
        evento.validaData(dataEvento);
        eventos.add(evento);
    }

    public static void pesquisaEventoNome(List<Evento>eventos){
        String pesquisaNome = JOptionPane.showInputDialog("Qual o Nome do Evento?");
        boolean flag = false;
        if(eventos.isEmpty())
            JOptionPane.showMessageDialog(null,"Sem Eventos Cadastrados");
        else{
            for(int i = 0; i < eventos.size(); i++) {
                if(eventos.get(i).getNome().equals(pesquisaNome)) {
                    JOptionPane.showMessageDialog(null,eventos.get(i).toString());
                    flag = true;
                }
            }
            if(flag == false ) {
                JOptionPane.showMessageDialog(null, "Não encontrou o Evento");
            }
        }
    }
    public static void pesquisaEventoStatus(List<Evento>eventos) {
        String pesquisaStatus = JOptionPane.showInputDialog("Por qual Status Procura:");
        boolean flag = false;
        if(eventos.isEmpty())
            JOptionPane.showMessageDialog(null,"Não há Eventos com esse Status!");
        else{
            for(Evento statusPesq : eventos){
                if(statusPesq.getSituacao().getNomeStatus().equals(pesquisaStatus)) {
                    JOptionPane.showMessageDialog(null, "Evento(s) Encontrado(s) :" + statusPesq);
                    flag = true;
                }
            }
            if(flag == false){

                JOptionPane.showMessageDialog(null, "Evento não encontrado!");
            }
        }
    }

    public static void pesquisaEventoInstituicao(List<Evento>eventos) {
        String localPesq = JOptionPane.showInputDialog("Qual a Instituição?");
        boolean flag = false;
        if(eventos.isEmpty())
            JOptionPane.showMessageDialog(null,"Não há eventos cadastrados!");
        else {
            for(Evento eventosPesq : eventos){
                List<Local>locais  = eventosPesq.getLocal();
                if(eventos.isEmpty())
                    JOptionPane.showMessageDialog(null,"Sem Local cadastrado");
                else {
                    for(Local local : locais){
                        if(local.getInstituicao().equals(localPesq)){
                            JOptionPane.showMessageDialog(null,"Instituição cadastrada!\n" + eventosPesq);
                            flag = true;
                        }
                    }
                }
            }
            if(flag == false) {
                JOptionPane.showMessageDialog(null,"Local Não existe");
            }
        }

    }



}
