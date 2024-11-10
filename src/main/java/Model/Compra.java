package Model;

import java.util.Date;

public class Compra {
    private int codigo;
    private Produto produto;
    private double valorTotal;
    private int quantidade;
    private Date dataCompra;

    public Compra(int codigo, Produto produto, double valorTotal, int quantidade, Date dataCompra) {
        setCodigo(codigo);
        setProduto(produto);
        setValorTotal(valorTotal);
        setQuantidade(quantidade);
        setDataCompra(dataCompra);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void realizarCompra() {
        //
    }
}
