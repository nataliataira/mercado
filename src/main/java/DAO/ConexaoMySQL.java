package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class ConexaoMySQL {
    private Connection conexao;
    private static final String URL = "jdbc:mysql://localhost/mercado";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public boolean conectar() {
        try {
            this.conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            return true;
        }
        catch(SQLException err) {
            System.err.println(err.getMessage());
            return false;
        }
    }

    public boolean desconectar() {
        try {
            if (this.conexao == null)
                this.conexao.close();
            return true;
        }
        catch (SQLException err) {
            System.err.println("Erro ao desconectar do banco de dados: " + err.getMessage());
            return false;
        }
    }

    public Statement criarStatement() {
        if (this.conexao == null) {
            System.err.println("Conexão não estabelecida. Chame o método conectar() primeiro.");
            return null;
        }
        try {
            return this.conexao.createStatement();
        }
        catch(SQLException err) {
            System.err.println("Erro ao criar Statement: " + err.getMessage());
            return null;
        }
    }

    public Connection getConnection() {
        return this.conexao;
    }

    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) {
        if (this.conexao == null) {
            System.err.println("Conexão não estabelecida. Chame o método conectar() primeiro.");
            return null;
        }
        try {
            return this.conexao.prepareStatement(sql, autoGeneratedKeys);
        } catch (SQLException err) {
            System.err.println("Erro ao criar PreparedStatement: " + err.getMessage());
            return null;
        }
    }

    public PreparedStatement prepareStatement(String sql) {
        if (this.conexao == null) {
            System.err.println("Conexão não estabelecida. Chame o método conectar() primeiro.");
            return null;
        }
        try {
            return this.conexao.prepareStatement(sql);
        } catch (SQLException err) {
            System.err.println("Erro ao criar PreparedStatement: " + err.getMessage());
            return null;
        }
    }
}

