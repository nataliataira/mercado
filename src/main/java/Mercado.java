import GUI.RegistroFornecedor;
import DTO.Fornecedor;

import java.util.Arrays;
import java.util.List;

public class Mercado {
    public static void main(String[] args) {
        try {
//            new RegistroFornecedor();

            // Fornecedor
            Fornecedor fornecedorA = new Fornecedor("CEAGESP",
                    "62.463.005/0001-08",
                    "Av. Dr. Gastão Vidigal, 1946",
                    "(11) 3643-3700",
                    "comunicacao@ceagesp.gov.br");

            Fornecedor fornecedorB = new Fornecedor("Atacadão",
                    "75.315.333/0001-09",
                    "Av. Hilário Pereira de Souza, 588",
                    "(11) 2829-5790",
                    "faleconosco@atacadao.com.br");

            // Produto
            Produto produtoA = new Produto("10001",
                    "Morango",
                    "Frutas",
                    "Bandeja 300g Morango",
                    fornecedorA);
            produtoA.setNivelMinEstoque(5);
            produtoA.setNivelMaxEstoque(10);

            Produto produtoB = new Produto("10002",
                    "Desodorante Antitranspirante",
                    "Produtos de Higiene",
                    "Proporciona proteção desodorante por 48 horas e evita manchas em roupas claras e escuras.",
                    fornecedorB);
            produtoB.setNivelMinEstoque(10);
            produtoB.setNivelMaxEstoque(30);

            // Gestor
            Gestor gst = new Gestor(1,
                    "Paula de Souza Klein",
                    "125.645.712-85",
                    "Rua Monsenhor Vinhedo Queirós, 1344",
                    "(11) 98864-1231",
                    "p_souzak@ig.com.br");

            gst.atualizarDados("Rua Monsenhor Vinhedo Queirós, 1345",
                    "(11) 98864-1231",
                    "p_souzak@ig.com.br");

            gst.consultarDados();

            // Compra 1
            // Lista de Compras
            Item itemC11 = new Item(produtoA, 10, 5.0);
            Item itemC12 = new Item(produtoB, 5, 10.0);
            List<Item> itensCompra1 = Arrays.asList(itemC11, itemC12);
            // Nova Compra
            gst.realizarCompra(fornecedorA, itensCompra1, "cartão");

            // Compra 2
            // Lista de Compras
            Item itemC21 = new Item(produtoA, 10, 5.0);
            Item item22 = new Item(produtoB, 5, 10.0);
            List<Item> itensCompra2 = Arrays.asList(itemC21, item22);
            // Nova Compra
            gst.realizarCompra(fornecedorA, itensCompra2, "Cartão");

            // Op. Caixa
            OperadorDeCaixa op = new OperadorDeCaixa(1,
                    "Angelica Mendes Moura",
                    "446.254.648-76",
                    "Alameda Juripis, 543",
                    "(11) 99623-4352",
                    "angel_mmoura12@gmail.com");

            op.atualizarDados("Alameda Juripis, 543",
                    "(11) 98864-1231",
                    "paula22_souzak@ig.com.br");

            op.consultarDados();

            // Lista de Venda
            Item vendaItem1 = new Item(produtoA, 2, 5.0);
            Item vendaItem2 = new Item(produtoB, 1, 14.50);
            List<Item> itensVenda = Arrays.asList(vendaItem1, vendaItem2);
            // Nova Venda
            op.realizarVenda(itensVenda, "pix");
        }
        catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }
}
