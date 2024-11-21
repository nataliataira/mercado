import java.util.Date;
import java.util.List;

public class OperadorDeCaixa extends Funcionario {
    private List<Venda> historicoVendas;

    public OperadorDeCaixa(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) {
        super(codigo, nome, CNPJ, endereco, telefone, email);
    }

    public List<Venda> getHistoricoVendas() {
        return historicoVendas;
    }

    public void setHistoricoVendas(List<Venda> historicoVendas) {
        this.historicoVendas = historicoVendas;
    }

    public void realizarVenda(List<Item> itens, String metodoPagamento)
    {
        double valorTotal;
        Venda venda = new Venda(itens, new Date(), metodoPagamento);
        valorTotal = venda.totalOperacao();
        System.out.println("Venda realizada com sucesso!");
        System.out.println("Itens comprados: ");
        for (Item item : itens) {
            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQuantidade() + " unidades.");
        }
        System.out.println("Valor total da compra: R$" + valorTotal);
    }
}
