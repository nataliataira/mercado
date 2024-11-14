package Model;

import java.util.Date;

public class Compra {
    private int codigo;
    //    private List<item> itens;
    private double valorTotal;
    private int quantidade;
    private Date dataCompra;
    private Fornecedor fornecedor;

    public Compra(int codigo /*, List<Item> itens*/, double valorTotal, int quantidade, Date dataCompra, Fornecedor fornecedor) throws IllegalArgumentException {
        setCodigo(codigo);
//        setItens(itens);
        setValorTotal(valorTotal);
        setQuantidade(quantidade);
        setDataCompra(dataCompra);
        setFornecedor(fornecedor);
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

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) throws IllegalArgumentException {
        if (fornecedor == null)
            throw new IllegalArgumentException("O fornecedor deve ser informado.");

        this.fornecedor = fornecedor;
    }

    public void realizarCompra() {
        //
    }
}
