package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gestor extends Funcionario {
    private Relatorio relatorio;

    public Gestor(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) {
        super(codigo, nome, CNPJ, endereco, telefone, email);
    }

    public void geraRelatorio()
    {
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o relatório");
        System.out.println("1.RelatorioVendas");
        System.out.println("2.RelatorioEstoque");
        System.out.println("3.RelatorioCompras");
        System.out.println("4.RelatorioDesempenhoProdutos");
        System.out.println("5.RelatorioFluxoCaixa");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                relatorio.gerarRelatorioVendas();
            case 2:
                relatorio.gerarRelatorioEstoque();
            case 3:
                relatorio.gerarRelatorioCompras();
            case 4:
                relatorio.gerarRelatorioDesempenhoProdutos();
            case 5:
                relatorio.gerarRelatorioFluxoCaixa();
        }
        sc.close();
    }

    public void realizarCompra(List<Item> itensCompra)
    {
        Compra compra = new Compra();
    }
}
