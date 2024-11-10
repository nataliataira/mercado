package Model;

import java.util.Date;

public class LogTransacao {
    private int codigo;
    private String tipoTransacao;
    private Date data;
    private String usuario;
    private String detalhesOperacao;

    public LogTransacao(int codigo, String tipoTransacao, Date data, String usuario, String detalhesOperacao) {
        setCodigo(codigo);
        setTipoTransacao(tipoTransacao);
        setData(data);
        setUsuario(usuario);
        setDetalhesOperacao(detalhesOperacao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDetalhesOperacao() {
        return detalhesOperacao;
    }

    public void setDetalhesOperacao(String detalhesOperacao) {
        this.detalhesOperacao = detalhesOperacao;
    }

    public void registrarLog() {
        //
    }

    public void consultarLog() {
//        System.out.println("Registro da transação de " + tipoTransacao + " realizada em " + data);
//        System.out.println("Usuário responsável: " + usuario);
//        System.out.println("Detalhes da operação: " + detalhesOperacao);
    }
}
