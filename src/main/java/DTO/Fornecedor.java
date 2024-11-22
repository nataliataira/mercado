package DTO;

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
        int indexArroba;
        if (email == null)
            throw new IllegalArgumentException("O email deve ser preenchido.");

        indexArroba = email.indexOf('@');
        if (!(indexArroba > 0 && indexArroba < email.length() - 1))
            throw new IllegalArgumentException("Email inválido.");
        this.email = email;
    }

    public void registrarFornecedor(String nome, String cnpj, String endereco, String telefone, String email) {
        setNome(nome);
        setCnpj(cnpj);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    public void editarFornecedor(int codigo, String novoNome, String novoEndereco, String novoTelefone, String novoEmail) throws IllegalArgumentException
    {
        if (codigo < 0) {
            throw new IllegalArgumentException("DTO.Fornecedor não encontrado.");
        }
        setNome(novoNome);
        setEndereco(novoEndereco);
        setTelefone(novoTelefone);
        setEmail(novoEmail);
    }

    public void consultarCompras(List<String> comprasView) {
        if (comprasView == null || comprasView.isEmpty()) {
            System.out.println("Nenhuma compra registrada para este fornecedor.");
        } else {
            System.out.println("Compras registradas para este fornecedor:");
            for (String compra : comprasView) {
                System.out.println(compra);
            }
        }
    }
}