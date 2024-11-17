import java.util.Date;
import java.util.List;

public class Venda extends Operacao {
    private String metodoPagamento;
    private Date dataVenda;

    public Venda(List<Item> itens, String metodoPagamento, Date dataVenda) throws IllegalArgumentException {
        super(itens);
        setMetodoPagamento(metodoPagamento);
        setDataVenda(dataVenda);
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

    public Date getDataVenda() {
        return new Date(dataVenda.getTime());
    }

    public void setDataVenda(Date dataVenda) throws IllegalArgumentException {
        if (dataVenda == null)
            throw new IllegalArgumentException("A data da venda não pode ser nula.");

        if (dataVenda.after(new Date()))
            throw new IllegalArgumentException("A data da venda não pode ser no futuro.");

        this.dataVenda = dataVenda;
    }

    public void realizarVenda() {
        //
    }
}
