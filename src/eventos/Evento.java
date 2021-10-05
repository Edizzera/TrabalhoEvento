package eventos;

public class Evento {
    private String nome;
    private double taxaInscricao;
    private String data;

    public Evento() {}

    public Evento(String nome, double taxaInscricao, String data) {
        this.nome = nome;
        this.taxaInscricao = taxaInscricao;
        this.data = data;
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
    public String toString() {
        return "Evento{" +
                "Nome= '" + nome + '\'' +
                ", taxa de Inscricao= " + taxaInscricao +
                ", Data='" + data + '\'' +
                '}';
    }
}
