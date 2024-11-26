import java.sql.*;
import DTO.Fornecedor;

public class FornecedorDAO {
    private final ConexaoMySQL conexao = new ConexaoMySQL();

    public FornecedorDAO() throws SQLException {
        String sql = "create table if not exists fornecedor(codigo int auto_increment primary key, "
                + "nome varchar(255) not null,"
                + "cnpj varchar(14) not null unique,"
                + "telefone varchar(20),"
                + "email varchar(255),"
                + "endereco varchar(255))";
        try {
            if (this.conexao.conectar()) {
                Statement stmt = this.conexao.criarStatement();
                stmt.execute(sql);
                System.out.println("Tabela \"Fornecedor\" Criada.");
            }
        }
        catch(SQLException err) {
            System.err.println(err.getMessage());
        }
        finally {
            conexao.desconectar();
        }
    }

    public int inserirFornecedor(Fornecedor fornecedor) throws SQLException {
        int linhasInseridas = 0;
        String sql = "insert into fornecedor (nome, cnpj, telefone, email, endereco) " +
                "values (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        try {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getEmail());
            stmt.setString(5, fornecedor.getEndereco());
            linhasInseridas = stmt.executeUpdate();
            if (linhasInseridas > 0) {
                ResultSet generatedKeys = stmt.getGeneratedKeys();
                if (generatedKeys.next()) {
                    fornecedor.setCodigo(generatedKeys.getInt(1));
                }
            }
            return linhasInseridas;
        }
        catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        }
    }

    public Fornecedor buscarFornecedor(int codigo) throws SQLException {
        conexao.conectar();
        String sql = "select * from fornecedor where codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setInt(1, codigo);
            ResultSet retorno = stmt.executeQuery();
            if (retorno.next()) {
                Fornecedor aux = new Fornecedor();
                aux.setCodigo(retorno.getInt("codigo"));
                aux.setNome(retorno.getString("nome"));
                aux.setCnpj(retorno.getString("cnpj"));
                aux.setTelefone(retorno.getString("telefone"));
                aux.setEmail(retorno.getString("email"));
                aux.setEndereco(retorno.getString("endereco"));
                return aux;
            } else {
                return null;
            }
        }
        catch (SQLException err) {
            System.err.println(err.getMessage());
            return null;
        }
        finally {
            conexao.desconectar();
        }
    }

    public int atualizarFornecedor(Fornecedor fornecedor) throws SQLException {
        conexao.conectar();
        String sql = "update fornecedor set nome = ?, cnpj = ?, endereco = ?, telefone = ?, email = ? where codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getEndereco());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setInt(6, fornecedor.getCodigo());
            return stmt.executeUpdate();
        }
        catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        }
        finally {
            conexao.desconectar();
        }
    }

    public int excluirFornecedor(Fornecedor fornecedor) throws SQLException {
        conexao.conectar();
        String sql = "delete from fornecedor where codigo = ?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        try {
            stmt.setInt(1, fornecedor.getCodigo());
            return stmt.executeUpdate();
        }
        catch (SQLException err) {
            System.err.println(err.getMessage());
            return 0;
        }
        finally {
            conexao.desconectar();
        }
    }
}
