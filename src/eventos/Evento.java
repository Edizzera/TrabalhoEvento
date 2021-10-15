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
    private List<Participante> participante;
    private Local local;
    private Situacao situacao;

    //Construtor sem parametros
    public Evento() {}

    public Evento(String nome, double taxaInscricao, String data, List<Participante> participante, Local local, Situacao situacao) {
        this.nome = nome;
        this.taxaInscricao = taxaInscricao;
        this.data = data;
        this.participante = participante;
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

    public List<Participante> getParticipante() {
        return participante;
    }

    public void setParticipante(List<Participante> participante) {
        this.participante = participante;
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
        return
                "Nome do Evento = '" + nome + '\'' +
                ", Taxa de Inscricao =  R$ " + taxaInscricao +
                ", Data do Evento ='" + data + '\'' + "\n" +
                " Participante = " + participante + '\''+
                (local!= null ? local.toString():"Local Inválido")  + '\'' +
                ", "+ "\n" + "situacao=" + situacao + "\n";
    }
}
