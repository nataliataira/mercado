import java.util.Date;
import java.util.List;

public class Compra extends Operacao {
    private Fornecedor fornecedor;

    public Compra(Fornecedor fornecedor, List<Item> itens, Date data, String metodoPagamento) throws IllegalArgumentException {
        super(itens, data, metodoPagamento);
        setFornecedor(fornecedor);
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void realizarCompra() throws IllegalArgumentException {
        Produto produto;
        if (fornecedor == null)
            throw new IllegalArgumentException("Fornecedor inválido.");
        else if (getItens() == null || getItens().isEmpty())
            throw new IllegalArgumentException("Lista de itens da compra está vazia!");
        for (Item item : getItens()) {
            produto = item.getProduto();
            if (item.getQuantidade() <= 0) {
                throw new IllegalArgumentException("A quantidade de cada item deve ser maior que zero.");
            }
            produto.atualizaQuantidade(item.getQuantidade());
        }
//        // Prints para mostrar pro usuário
//        System.out.println("Compra realizada com sucesso!");
//        System.out.println("Fornecedor: " + fornecedor.getNome());
//        System.out.println("Itens comprados: ");
//        for (Item item : getItens()) {
//            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQuantidade() + " unidades.");
//        }
//        System.out.println("Valor total da compra: R$" + getValorTotal());
    }
}
