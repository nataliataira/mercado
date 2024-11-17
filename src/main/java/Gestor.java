import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Gestor extends Funcionario {
    private List<Compra> compras;

    public Gestor(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) {
        super(codigo, nome, CNPJ, endereco, telefone, email);
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) throws IllegalArgumentException {
        if (compras == null)
            throw new IllegalArgumentException("A lista de compras não pode estar vazia.");

        this.compras = compras;
    }

    public void gerarRelatorioVendas() {

    }

    public void gerarRelatorioEstoque() {

    }

    public void gerargerarRelatorioCompras() {

    }

    public void gerarRelatorioDesempenhoProdutos() {

    }

    public void gerarRelatorioFluxoCaixa() {

    }

    public void realizarCompra(List<Item> itensCompra)
    {
        Compra compra = new Compra(itensCompra, new Date());
    }
}
