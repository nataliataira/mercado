public class Produto {
    private int codigo;
    private String codigoBarras;
    private String nome;
    private String categoria;
    private String descricao;
    private Fornecedor fornecedor;
    private int quantidadeEstoque;
    private int nivelMinEstoque;
    private int nivelMaxEstoque;

    public Produto(String codigoBarras, String nome, String categoria, String descricao, Fornecedor fornecedor) throws IllegalArgumentException {
        setCodigoBarras(codigoBarras);
        setNome(nome);
        setCategoria(categoria);
        setDescricao(descricao);
        setFornecedor(fornecedor);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) throws IllegalArgumentException {
        if (categoria == null)
            throw new IllegalArgumentException("A categoria do produto não pode estar vazia.");
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) throws IllegalArgumentException {
        if (descricao == null)
            throw new IllegalArgumentException("A descricao do produto não pode estar vazia.");
        this.descricao = descricao;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) throws IllegalArgumentException {
        if (fornecedor == null)
            throw new IllegalArgumentException("O fornecedor do produto deve ser preechido.");
        this.fornecedor = fornecedor;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) throws IllegalArgumentException{
        if (quantidadeEstoque < 0)
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getNivelMinEstoque() {
        return nivelMinEstoque;
    }

    public void setNivelMinEstoque(int nivelMinEstoque) {
        if (nivelMinEstoque < 1)
            throw new IllegalArgumentException("O nível mínimo deve ser maior que 1");
        this.nivelMinEstoque = nivelMinEstoque;
    }

    public int getNivelMaxEstoque() {
        return nivelMaxEstoque;
    }

    public void setNivelMaxEstoque(int nivelMaxEstoque) {
        if (nivelMaxEstoque < 0)
            throw new IllegalArgumentException("O nível máximo não pode ser negativo");
        this.nivelMaxEstoque = nivelMaxEstoque;
    }

    public void atualizaQuantidade(int quantidadeAlteracao) throws Exception
    {
        int novaQuantidade = getQuantidadeEstoque() + quantidadeAlteracao;
        if (novaQuantidade < 1)
            throw new Exception("Não é possível reduzir a quantidade abaixo de zero.");
        setQuantidadeEstoque(novaQuantidade);
        System.out.println("Quantidade atualizada! Nova quantidade: " + getQuantidadeEstoque());
    }
}
