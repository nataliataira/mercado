import DTO.Fornecedor;

import java.util.Date;
import java.util.List;

public class Gestor extends Funcionario {
    private List<Compra> historicoCompras;

    public Gestor(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) {
        super(codigo, nome, CNPJ, endereco, telefone, email);
    }

    public List<Compra> getHistoricoCompras() {
        return historicoCompras;
    }

    public void setHistoricoCompras(List<Compra> compras) throws IllegalArgumentException {
        if (compras == null)
            throw new IllegalArgumentException("A lista de compras não pode estar vazia.");
        this.historicoCompras = compras;
    }

    public void realizarCompra(Fornecedor fornecedor, List<Item> itens, String metodoPagamento)
    {
        double valorTotal;
        Compra compra = new Compra(fornecedor, itens, new Date(), metodoPagamento);

        valorTotal = compra.totalOperacao();
        System.out.println("Compra realizada com sucesso!");
        System.out.println("Fornecedor: " + fornecedor.getNome());
        System.out.println("Itens comprados: ");
        for (Item item : itens) {
            System.out.println("- " + item.getProduto().getNome() + ": " + item.getQuantidade() + " unidades.");
        }
        System.out.println("Valor total da compra: R$" + valorTotal);
    }

    public void gerarRelatorioVendas(List<String> vendasView) {
        System.out.println("=== Relatório de Vendas ===");
        if (vendasView == null || vendasView.isEmpty())
            System.out.println("Nenhum dado encontrado para o relatório de estoque.");
        else {
            System.out.println("Vendas registradas:");
            for (String venda : vendasView)
                System.out.println(venda);
        }
    }

    public void gerarRelatorioEstoque(List<String> estoqueView) {
        System.out.println("=== Relatório de Estoque ===");
        if (estoqueView == null || estoqueView.isEmpty())
            System.out.println("Nenhum dado encontrado para o relatório de estoque.");
        else {
            System.out.println("Estoque:");
            for (String produtoEstoque : estoqueView)
                System.out.println(produtoEstoque);
        }
    }

    public void gerarRelatorioCompras(List<String> comprasView) {
        System.out.println("=== Relatório de Compras ===");
        if (comprasView == null || comprasView.isEmpty())
            System.out.println("Nenhum dado encontrado para o relatório de compras.");
        else {
            System.out.println("Compras registradas:");
            for (String compras : comprasView)
                System.out.println(compras);
        }
    }

    public void gerarRelatorioDesempenhoProdutos(List<String> desempenhoView) {
        System.out.println("=== Relatório de Desempenho ===");
        if (desempenhoView == null || desempenhoView.isEmpty())
            System.out.println("Nenhum dado encontrado para o relatório de desempenho de produtos.");
        else {
            System.out.println("Desempenho:");
            for (String prodDesempenho : desempenhoView)
                System.out.println(prodDesempenho);
        }
    }

    public void gerarRelatorioFluxoCaixa(List<String> fluxoCaixaView) {
        System.out.println("=== Relatório de Fluxo de Caixa ===");
        if (fluxoCaixaView == null || fluxoCaixaView.isEmpty())
            System.out.println("Nenhum dado encontrado para o relatório de fluxo de caixa.");
        else {
            System.out.println("Fluxo de Caixa:");
            for (String fluxoCaixa : fluxoCaixaView)
                System.out.println(fluxoCaixa);
        }
    }
}
