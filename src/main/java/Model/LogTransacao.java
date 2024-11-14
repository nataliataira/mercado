package Model;

import java.util.Date;

public class LogTransacao {
    private int codigo;
    private String tipoTransacao;
    private Date data;
    private String usuario;
    private String detalhesOperacao;

    public LogTransacao(int codigo, String tipoTransacao, Date data, String usuario, String detalhesOperacao) throws IllegalArgumentException {
        setCodigo(codigo);
        setTipoTransacao(tipoTransacao);
        setData(data);
        setUsuario(usuario);
        setDetalhesOperacao(detalhesOperacao);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) throws IllegalArgumentException {
        if (codigo < 0)
            throw new IllegalArgumentException("O código não pode ter valor negativo.");

        this.codigo = codigo;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) throws IllegalArgumentException {
        if (tipoTransacao == null)
            throw new IllegalArgumentException("O tipo de transação não pode estar vazio.");

        this.tipoTransacao = tipoTransacao;
    }

    public Date getData() {
        return new Date(data.getTime());    }

    public void setData(Date data) throws IllegalArgumentException {
        if (data == null)
            throw new IllegalArgumentException("A data da transação não pode estar vazia.");
        if (data.after(new Date()))
            throw new IllegalArgumentException("A data da transação não pode ser no futuro.");

        this.data = data;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws IllegalArgumentException {
        if (usuario == null)
            throw new IllegalArgumentException("O nome do responsável pela transação não pode estar vazio.");

        this.usuario = usuario;
    }

    public String getDetalhesOperacao() {
        return detalhesOperacao;
    }

    public void setDetalhesOperacao(String detalhesOperacao) throws IllegalArgumentException {
        if (detalhesOperacao == null)
            throw new IllegalArgumentException("Os detalhes da operação não podem estar vazios.");

        this.detalhesOperacao = detalhesOperacao;
    }

    public void registrarLog() {
        //
    }

    public void consultarLog(String tipoTransacao, Date data) {
        System.out.println("Registro da transação de " + tipoTransacao + " realizada em " + data);
        System.out.println("Usuário responsável: " + usuario);
        System.out.println("Detalhes da operação: " + detalhesOperacao);
    }
}
