package Model;

import java.util.Date;
import java.util.List;

public class Venda {
    private int codigo;
    private List<Produto> produtos;
    private String metodoPagamento;
    private int quantidade;
    private Date dataVenda;
    private double valorTotal;

    public Venda(int codigo, List<Produto> produtos, String metodoPagamento, int quantidade, Date dataVenda, double valorTotal) {
        setCodigo(codigo);
        setProdutos(produtos);
        setMetodoPagamento(metodoPagamento);
        setQuantidade(quantidade);
        setDataVenda(dataVenda);
        setValorTotal(valorTotal);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void realizarVenda() {
        //
    }
}
