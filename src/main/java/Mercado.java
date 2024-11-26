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
            Produto prodMorango = new Produto("10001",
                    "Morango",
                    "Frutas",
                    "Bandeja 300g Morango",
                    fornecedorA);
            prodMorango.setNivelMinEstoque(5);
            prodMorango.setNivelMaxEstoque(10);
            prodMorango.setQuantidadeEstoque(0);

            Produto prodMaca = new Produto("10002",
                    "Maça Fuji",
                    "Frutas",
                    "0,600gr / aprox: 5 unidades",
                    fornecedorA);
            prodMaca.setNivelMinEstoque(5);
            prodMaca.setNivelMaxEstoque(30);
            prodMaca.setQuantidadeEstoque(0);

            Produto prodDeso = new Produto("10003",
                    "Desodorante Antitranspirante",
                    "Produtos de Higiene",
                    "Proporciona proteção desodorante por 48 horas e evita manchas em roupas claras e escuras.",
                    fornecedorB);
            prodDeso.setNivelMinEstoque(10);
            prodDeso.setNivelMaxEstoque(50);
            prodDeso.setQuantidadeEstoque(0);

            Produto prodSabonete = new Produto("10004",
                    "Sabonete Líquido Hidratante",
                    "Produtos de Higiene",
                    "Desfrute de uma limpeza suave, fragrância luxuosa e um ritual de cuidados que eleva sua rotina de beleza a um novo patamar",
                    fornecedorB);
            prodSabonete.setNivelMinEstoque(10);
            prodSabonete.setNivelMaxEstoque(20);
            prodSabonete.setQuantidadeEstoque(0);

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

//            gst.consultarDados();

            //Teste estoque
            System.out.println("Antes da Compra");
            System.out.println("Estoque Morango: "+prodMorango.getQuantidadeEstoque());
            System.out.println("Estoque Maça: "+prodMaca.getQuantidadeEstoque());

            // Compra 1
            // Lista de Compras
            Item itemComp01 = new Item(prodMorango, 10, 5.0);
            Item itemComp02 = new Item(prodMaca, 10, 3.5);
            List<Item> itensCompra1 = Arrays.asList(itemComp01, itemComp02);
            // Nova Compra
            gst.realizarCompra(fornecedorA, itensCompra1, "cartão");

            //Teste estoque
            System.out.println("Depois da Compra");
            System.out.println("Estoque Morango: "+prodMorango.getQuantidadeEstoque());
            System.out.println("Estoque Maça: "+prodMaca.getQuantidadeEstoque());


            // Compra 2
            // Lista de Compras
            Item itemComp03 = new Item(prodDeso, 20, 5.0);
            Item itemComp04 = new Item(prodSabonete, 5, 10.0);
            List<Item> itensCompra2 = Arrays.asList(itemComp03, itemComp04);
            // Nova Compra
            gst.realizarCompra(fornecedorB, itensCompra2, "Cartão");

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

//            op.consultarDados();

            // Venda com sucesso
            Item vendaItem1 = new Item(prodMorango, 1, 9.5);
            Item vendaItem2 = new Item(prodDeso, 1, 14.50);
            List<Item> itensVenda1 = Arrays.asList(vendaItem1, vendaItem2);
            // Nova Venda
            op.realizarVenda(itensVenda1, "pix");

            // Venda com mais produtos que o estoque tem
            Item vendaItem3 = new Item(prodMorango, 400, 9.5);
            Item vendaItem4 = new Item(prodDeso, 1, 14.50);
            List<Item> itensVenda2 = Arrays.asList(vendaItem3, vendaItem4);
            // Nova Venda
            op.realizarVenda(itensVenda2, "pix");

        }
        catch (Exception err) {
            System.err.println(err.getMessage());
        }
    }
}
