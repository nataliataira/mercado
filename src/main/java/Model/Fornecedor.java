package Model;

import java.util.List;

public class Fornecedor {
    private int codigo;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String email;

    public Fornecedor(int codigo, String nome, String cnpj, String endereco, String telefone, String email) throws IllegalArgumentException {
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

    public void setCodigo(int codigo) throws IllegalArgumentException {
        if (codigo < 0)
            throw new IllegalArgumentException("O código não pode ter valor negativo.");

        this.codigo = codigo;
    }

    public String getNome()  {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null)
            throw new IllegalArgumentException("O nome não pode estar vazio.");

        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) throws IllegalArgumentException {
        int TAM_CNPJ = 14;

        if (cnpj == null)
            throw new IllegalArgumentException("CNPJ não pode ser vazio.");
        else if (cnpj.length() < TAM_CNPJ)
            throw new IllegalArgumentException("CNPJ muito curto.");

        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco == null)
            throw new IllegalArgumentException("O endereço do fornecedor não pode estar vazio.");

        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws IllegalArgumentException {
        if (telefone == null)
            throw new IllegalArgumentException("O telefone não pode estar vazio.");

        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email == null)
            throw new IllegalArgumentException("O email deve ser preenchido.");

        int indexArroba = email.indexOf('@');

        if (!(indexArroba > 0 && indexArroba < email.length() - 1))
            throw new IllegalArgumentException("Email inválido.");

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
