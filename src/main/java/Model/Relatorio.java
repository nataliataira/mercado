package Model;

import java.util.Date;
import java.util.List;

public class Relatorio
{
    private int codigo;
    private Date dataInicio;
    private Date dataFim;

    public Relatorio(int codigo, Date dataInicio, Date dataFim) {
        setDataInicio(dataInicio);
        setDataFim(dataFim);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void gerarRelatorioVendas(/*List<Venda> vendas*/) {
//        int totalVendas = 0;
//        System.out.println("Relatório de Vendas de " + dataInicio + " a " + dataFim);
//
//        System.out.println("Total das Vendas: " + totalVendas);
    }

    public void gerarRelatorioEstoque(/*List<Produto> produtos*/) {
//        System.out.println("Relatório de Estoque Atual:";
//
    }

    public void gerarRelatorioCompras(/*List<Compra> compras*/) {
//        int totalCompras = 0;
//        System.out.println("Relatório de Compras de " + dataInicio + " a " + dataFim);
//
//        System.out.println("Total das Compras: " + totalCompras);
    }

    public void gerarRelatorioDesempenhoProdutos(/*List<Venda> vendas*/) {
//        System.out.println("Relatório de Desempenho de Produtos:");
//
    }

    public void gerarRelatorioFluxoCaixa(/*List<Venda> vendas, List<Compra> compras*/) {
//        double totalVendas;
//        double totalCompras;
//        double lucro;
//        System.out.println("Relatório de Fluxo de Caixa de " + dataInicio + " a " + dataFim);
//        System.out.println("Total de Vendas: " + totalVendas);
//        System.out.println("Total de Compras: " + totalCompras);
//        System.out.println("Lucro Líquido: " + lucro);
    }
}
