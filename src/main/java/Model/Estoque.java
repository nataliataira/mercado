package Model;
import java.util.Date;

public class Estoque {
    private int quantidade;
//    private Produto produto;
    private Date dataModificacao;
    private String tipoModificacao;

    private static final int NIVEL_MINIMO_ESTOQUE = 10;
    public static final String TIPO_ENTRADA = "ENTRADA";
    public static final String TIPO_SAIDA = "SAIDA";
    public static final String TIPO_AJUSTE_MANUAL = "AJUSTE_MANUAL";

    public Estoque(int quantidade/*,Produto produto*/, String tipoModificacao) throws IllegalArgumentException {
        setQuantidade(quantidade);
        setProduto(produto);
        setDataModificacao(new Date());
        setTipoModificacao(tipoModificacao);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade não pode ser negativa.");
        }
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Date getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Date dataModificacao) {
        this.dataModificacao = (dataModificacao != null) ? dataModificacao : new Date();
    }

    public String getTipoModificacao() {
        return tipoModificacao;
    }

    public void setTipoModificacao(String tipoModificacao) throws IllegalArgumentException{
        if (!tipoModificacao.equals(TIPO_ENTRADA) &&
                !tipoModificacao.equals(TIPO_SAIDA) &&
                !tipoModificacao.equals(TIPO_AJUSTE_MANUAL)){
            throw new IllegalArgumentException("Tipo de modificação inválido: " + tipoModificacao);
        }
        this.tipoModificacao = tipoModificacao;
    }

    public boolean verificaEstoqueBaixo() {
        return getQuantidade() < NIVEL_MINIMO_ESTOQUE;
    }

    public void modificaEstoque(String tipoModificacao, int quantidadeModificacao) throws IllegalArgumentException {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade para modificar o estoque não pode ser negativa.");
        }

        setTipoModificacao(tipoModificacao);
        setDataModificacao(new Date());

        switch (tipoModificacao) {
            case TIPO_ENTRADA:
                setQuantidade(this.quantidade + quantidadeModificacao);
                break;
            case TIPO_SAIDA:
                setQuantidade(this.quantidade - quantidadeModificacao);
                break;
            case TIPO_AJUSTE_MANUAL:
                setQuantidade(quantidadeModificacao);
                break;
            default:
                System.out.println("Tipo de modificação inválido.");
                return;
        }
        if (verificaEstoqueBaixo()) {
            System.out.println("Alerta: Estoque baixo para o produto.");
        }
    }
}