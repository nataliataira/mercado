public class Item {
    private Produto produto;
    private int quantidade;
    private double valorPraticado;

    public Item(Produto produto, int quantidade, double valorPraticado) throws IllegalArgumentException {
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

    public void setQuantidade(int quantidade) throws IllegalArgumentException {
        if (quantidade < 0) {
            throw new IllegalArgumentException("Quantidade deve ser positiva.");
        }
        this.quantidade = quantidade;
    }

    public double getValorPraticado() {
        return valorPraticado;
    }

    public void setValorPraticado(double valorPraticado) throws IllegalArgumentException {
        if (valorPraticado < 0) {
            throw new IllegalArgumentException("Valor praticado deve ser positivo.");
        }
        this.valorPraticado = valorPraticado;
    }

    public Double calcularValorTotal()
    {
        return quantidade * valorPraticado;
    }
}