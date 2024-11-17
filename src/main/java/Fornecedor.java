import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

    public void consultarCompras(String nomeFornecedor) {
        String consultaSQL = """
        SELECT c.data, p.nome AS produto, c.valor_total
        FROM compras c
        JOIN produtos p ON c.produto_id = p.id
        JOIN fornecedores f ON p.fornecedor_id = f.id
        WHERE f.nome = ?
    """;

        try (Connection conexao = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(consultaSQL)) {

            stmt.setString(1, nomeFornecedor);

            try (ResultSet resultado = stmt.executeQuery()) {
                System.out.println("Compras realizadas de " + nomeFornecedor);

                int totalCompras = 0;
                while (resultado.next()) {
                    String dataCompra = resultado.getString("data");
                    String nomeProduto = resultado.getString("produto");
                    double valorTotal = resultado.getDouble("valor_total");

                    System.out.println("Compra feita em: " + dataCompra);
                    System.out.println("Produto: " + nomeProduto);
                    System.out.println("Valor total: R$" + valorTotal);
                    System.out.println("-----------------------------");

                    totalCompras++;
                }

                System.out.println("Total de compras: " + totalCompras);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao consultar as compras: " + e.getMessage());
        }
    }
}