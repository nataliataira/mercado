package Model;

public class Produto {
    private String codigoBarras;
    private String nome;
    private String categoria;

    public Produto(String codigoBarras, String nome, String categoria) throws IllegalArgumentException {
        setCodigoBarras(codigoBarras);
        setNome(nome);
        setCategoria(categoria);
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

    public void quantidadeCompra() {
        //
    }

    public void quantidadeVenda() {
        //
    }
}
