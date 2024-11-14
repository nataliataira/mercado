package Model;

public class Item {
    private Produto produto;
    private int quantidade;
    private double valorPraticado;

    public Item(Produto produto, int quantidade, double valorPraticado) {
        setProduto(produto);
        setQuantidade(quantidade);
        setValorPraticado(valorPraticado);
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorPraticado() {
        return valorPraticado;
    }

    public void setValorPraticado(double valorPraticado) {
        this.valorPraticado = valorPraticado;
    }
}