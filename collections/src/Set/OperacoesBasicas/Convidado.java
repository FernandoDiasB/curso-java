package Set.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvidado) {
        this.nome = nome;
        this.codigoConvite = codigoConvidado;
    }
    public String getNome() {
        return nome;
    }
    public int getCodigoConvite() {
        return codigoConvite;
    }
    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvidado=" + codigoConvite + "]";
    }

    
}
