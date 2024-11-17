import java.util.List;

public abstract class Operacao {
    private int codigo;
    private List<Item> itens;
    private double valorTotal;
    private int quantidade;

    public Operacao(List<Item> itens) throws IllegalArgumentException {
        setItens(itens);
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
}