import java.util.Date;
import java.util.List;

public class Venda extends Operacao {
    public Venda(List<Item> itens, Date data, String metodoPagamento) throws IllegalArgumentException {
        super(itens, data, metodoPagamento);
    }

    public void realizarVenda() {
        Produto produto;
        int quantidadeDisponivel;
        double valorTotal;
        if (getItens() == null || getItens().isEmpty()) {
            throw new IllegalArgumentException("A venda deve conter pelo menos um item.");
        }
        for (Item item : getItens()) {
            produto = item.getProduto();
            quantidadeDisponivel = produto.getQuantidadeEstoque();
            if (item.getQuantidade() > quantidadeDisponivel) {
                throw new IllegalArgumentException("Estoque insuficiente para o produto: " + produto.getNome());
            }
            produto.atualizaQuantidade(-item.getQuantidade());
        }
        valorTotal = totalOperacao();
        setValorTotal(valorTotal);

//        // Prints para mostrar pro usuario
//        System.out.println("Venda realizada com sucesso!");
//        System.out.println("Itens vendidos: ");
//        for (Item item : getItens()) {
//            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQuantidade() + " unidades.");
//        }
//        System.out.println("Valor total da venda: R$" + valorTotal);
    }
}
