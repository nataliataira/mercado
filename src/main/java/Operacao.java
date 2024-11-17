import java.util.List;
import java.util.Date;

public abstract class Operacao {
    private int codigo;
    private List<Item> itens;
    private double valorTotal;
    private int quantidade;
    private Date data;
    private String metodoPagamento;

    public Operacao(List<Item> itens, Date data) throws IllegalArgumentException {
        setItens(itens);
        setData(data);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        if (codigo < 0)
            throw new IllegalArgumentException("O código não pode ter valor negativo.");

        this.codigo = codigo;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) throws IllegalArgumentException {
        if (itens == null)
            throw new IllegalArgumentException("A lista de itens não pode estar vazia.");

        this.itens = itens;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) throws IllegalArgumentException {
        if (valorTotal < 0)
            throw new IllegalArgumentException("O valor total não pode ser negativo.");

        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade < 1)
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");

        this.quantidade = quantidade;
    }

    public Date getData() {
        return new Date(data.getTime());
    }

    public void setData(Date data) {
        this.data = new Date();
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) throws IllegalArgumentException {
        if (metodoPagamento == null)
            throw new IllegalArgumentException("O método de pagamento não pode estar vazio.");

        if (!metodoPagamento.equalsIgnoreCase("dinheiro") &&
                !metodoPagamento.equalsIgnoreCase("cartão") &&
                !metodoPagamento.equalsIgnoreCase("pix"))
            throw new IllegalArgumentException("Método de pagamento inválido. Use dinheiro, cartão ou pix.");

        this.metodoPagamento = metodoPagamento;
    }
}