package Model;

public class Produto {
    private String codigoBarras;
    private String nome;
    private double precoVenda;
    private double precoCompra;
    private String categoria;
    private Fornecedor fornecedor;
    private int quantEmEstoque;

    public Produto(String codigoBarras, String nome, double precoVenda, double precoCompra, String categoria, Fornecedor fornecedor, int quantEmEstoque) {
        setCodigoBarras(codigoBarras);
        setNome(nome);
        setPrecoVenda(precoVenda);
        setPrecoCompra(precoCompra);
        setCategoria(categoria);
        setFornecedor(fornecedor);
        setQuantEmEstoque(quantEmEstoque);
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) {
        this.quantEmEstoque = quantEmEstoque;
    }

    public void quantidadeCompra() {
        //
    }

    public void quantidadeVenda() {
        //
    }
}
