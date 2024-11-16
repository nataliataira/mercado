package Model;

public class Produto {
    private String codigoBarras;
    private String nome;
    private String categoria;
    private String descricao;
    private Fornecedor fornecedor;
    private int nivelMinEstoque;
    private int nivelMaxEstoque;

    public Produto(String codigoBarras, String nome, String categoria, String descricao, Fornecedor fornecedor) throws IllegalArgumentException {
        setCodigoBarras(codigoBarras);
        setNome(nome);
        setCategoria(categoria);
        setDescricao(descricao);
        setFornecedor(fornecedor);
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

    public void verificarNivelEstoque() {
        //
    }
}
