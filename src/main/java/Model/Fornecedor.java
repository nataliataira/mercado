package Model;

import java.util.List;

public class Fornecedor {
    private int codigo;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    public Fornecedor(int codigo, String nome, String cnpj, String endereco, String telefone, String email) {
        setCodigo(codigo);
        setNome(nome);
        setCnpj(cnpj);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void registrarFornecedor() {
        //
    }

    public void consultarCompras(/*List<Compra> compras*/) {
//        int totalCompras = 0;
//        Verificar nos produtos de compras o fornecedor igual ao registrado
//        System.out.println("Compras realizadas de " + nome);
//
//        Fazer Loop de compras feitas pelo fornecedor
//        System.out.println("Compra feita em " + compra.data);
//        System.out.println("Produto: " + compra.produto);
//        System.out.println("Valor total: " + compra.valorTotal);

//        System.out.println("Total de compras: " + totalCompras);
    }
}
