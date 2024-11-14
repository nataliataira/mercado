package Model;

import java.util.Date;
import java.util.List;

public class Venda {
    private int codigo;
//    private List<item> itens;
    private String metodoPagamento;
    private int quantidade;
    private Date dataVenda;
    private double valorTotal;

    public Venda(int codigo/*, List<Item> itens*/, String metodoPagamento, int quantidade, Date dataVenda, double valorTotal) throws IllegalArgumentException {
        setCodigo(codigo);
//        setItens(itens);
        setMetodoPagamento(metodoPagamento);
        setQuantidade(quantidade);
        setDataVenda(dataVenda);
        setValorTotal(valorTotal);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        if (codigo < 0)
            throw new IllegalArgumentException("O código não pode ter valor negativo.");

        this.codigo = codigo;
    }

//    public List<Item> getItens() {
//        return itens;
//    }
//
//    public void setItens(List<Item> itens) throws IllegalArgumentException {
//        if (itens == null)
//            throw new IllegalArgumentException("A lista de itens não pode estar vazia.");
//
//        this.itens = itens;
//    }

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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade <= 0)
            throw new IllegalArgumentException("A quantidade deve ser maior que zero.");

        this.quantidade = quantidade;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) throws IllegalArgumentException {
        if (valorTotal < 0)
            throw new IllegalArgumentException("O valor total não pode ser negativo.");

        this.valorTotal = valorTotal;
    }

    public void realizarVenda() {
        //
    }
}
