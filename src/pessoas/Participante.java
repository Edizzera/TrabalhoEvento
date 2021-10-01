package pessoas;

public class Participante extends Pessoa {
    private String endereco;
    private String telefone;
    private String cpf;
    private String email;

    public Participante() {}

    public Participante(String nome, String endereco, String telefone, String cpf, String email) {
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    //Adicionar to string do Super também
    public String toString() {
        return "Participante{" +
                "endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
