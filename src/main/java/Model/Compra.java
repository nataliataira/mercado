package Model;

import java.util.Date;

public class Compra {
    private int codigo;
    private Produto produto;
    private double valorTotal;
    private int quantidade;
    private Date dataCompra;

    public Compra(int codigo, Produto produto, double valorTotal, int quantidade, Date dataCompra) throws IllegalArgumentException {
        setCodigo(codigo);
        setProduto(produto);
        setValorTotal(valorTotal);
        setQuantidade(quantidade);
        setDataCompra(dataCompra);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        if (codigo < 0)
            throw new IllegalArgumentException("O código não pode ter valor negativo.");

        this.codigo = codigo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) throws IllegalArgumentException {
        if (produto == null)
            throw new IllegalArgumentException("O produto deve ser informado.");

        this.produto = produto;
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

    public Date getDataCompra() {
        return new Date(dataCompra.getTime());
    }

    public void setDataCompra(Date dataCompra) throws IllegalArgumentException {
        if (dataCompra == null)
            throw new IllegalArgumentException("A data da compra deve ser informada e não pode estar vazia.");
        if (dataCompra.after(new Date()))
            throw new IllegalArgumentException("A data da compra não pode ser futura.");

        this.dataCompra = new Date(dataCompra.getTime());
    }

    public void realizarCompra() {
        //
    }
}
