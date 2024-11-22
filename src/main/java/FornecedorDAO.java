import DTO.Fornecedor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FornecedorDAO {

    public void inserirFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "inser into fornecedor (codigo, nome, cnpj, endereco, telefone, email) values (?, ?, ?, ?, ?, ?)";
        try (Connection conexao = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

        }
    }

    public void buscarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "select * from fornecedor where codigo = ?";
        try (Connection conexao = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

        }
    }

    public void atualizarFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "update fornecedor set nome = ?, cnpj = ?, endereco = ?, telefone = ?, email = ? where codigo = ?";
        try (Connection conexao = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

        }
    }

    public void excluirFornecedor(Fornecedor fornecedor) throws SQLException {
        String sql = "delete from fornecedor where codigo = ?";
        try (Connection conexao = ConexaoMySQL.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql)) {

        }
    }
}
