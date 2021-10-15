package eventos;

import pessoas.Participante;
import util.Situacao;
import util.Validador;

import java.text.ParseException;
import java.util.List;

public class Evento implements Validador {
    private String nome;
    private double taxaInscricao;
    private String data;
    private List<Participante> participantes;
    private Local local;
    private Situacao situacao;

    //Construtor sem parametros
    public Evento() {}

    public Evento(String nome, double taxaInscricao, String data, List<Participante> participantes, Local local, Situacao situacao) {
        this.nome = nome;
        this.taxaInscricao = taxaInscricao;
        this.data = data;
        this.participantes = participantes;
        this.local = local;
        this.situacao = situacao;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<Participante> participantes) {
        this.participantes = participantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTaxaInscricao() {
        return taxaInscricao;
    }

    public void setTaxaInscricao(double taxaInscricao) {
        this.taxaInscricao = taxaInscricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    @Override
    public boolean validaData(String date) throws ParseException {
        return Validador.super.validaData(date);
    }

    @Override
    public String toString() {
        String aux ="";
        if(participantes != null) {
            for(Participante participante : participantes) {
                if(participante != null)
                    aux += participante +"\n";
            }
        }
        return
                "Nome do Evento = '" + nome + '\'' +
                ", Taxa de Inscricao =  R$ " + taxaInscricao +
                ", Data do Evento ='" + data + '\'' + "\n" +
                " Participantes = " + aux + '\''+
                (local!= null ? local.toString():"Local Inválido")  + '\'' +
                ", "+ "\n" + "situacao=" + situacao + "\n";
    }
}
