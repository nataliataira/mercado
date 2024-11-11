package Model;

public class Produto {
    private String codigoBarras;
    private String nome;
    private double precoVenda;
    private double precoCompra;
    private String categoria;
    private Fornecedor fornecedor;
    private int quantEmEstoque;

    public Produto(String codigoBarras, String nome, double precoVenda, double precoCompra, String categoria, Fornecedor fornecedor, int quantEmEstoque) throws IllegalArgumentException {
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

    public void setCodigoBarras(String codigoBarras) throws IllegalArgumentException {
        if (codigoBarras == null)
            throw new IllegalArgumentException("O código de barras deve ser preenchido.");

        this.codigoBarras = codigoBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null)
            throw new IllegalArgumentException("O nome do produto não pode estar vazio.");

        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) throws IllegalArgumentException {
        if (precoVenda < 0)
            throw new IllegalArgumentException("O preço de venda não pode ser negativo.");
        if (precoCompra > 0 && precoVenda < precoCompra)
            throw new IllegalArgumentException("O preço de venda não pode ser menor que o preço de compra.");

        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) throws IllegalArgumentException {
        if (precoCompra < 0)
            throw new IllegalArgumentException("O preço de compra não pode ser negativo.");

        this.precoCompra = precoCompra;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws IllegalArgumentException {
        if (categoria == null)
            throw new IllegalArgumentException("A categoria do produto não pode estar vazia.");

        this.categoria = categoria;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) throws IllegalArgumentException {
        if (fornecedor == null)
            throw new IllegalArgumentException("O fornecedor deve ser informado.");

        this.fornecedor = fornecedor;
    }

    public int getQuantEmEstoque() {
        return quantEmEstoque;
    }

    public void setQuantEmEstoque(int quantEmEstoque) throws IllegalArgumentException {
        if (quantEmEstoque < 0)
            throw new IllegalArgumentException("A quantidade em estoque não pode ser negativa.");

        this.quantEmEstoque = quantEmEstoque;
    }

    public void quantidadeCompra() {
        //
    }

    public void quantidadeVenda() {
        //
    }
}
