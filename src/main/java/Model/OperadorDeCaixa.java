package Model;

public class OperadorDeCaixa extends Funcionario {
    private Venda venda;

    public OperadorDeCaixa(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) {
        super(codigo, nome, CNPJ, endereco, telefone, email);
    }

    public void realizarVenda(Venda venda)
    {
        //
    }
}
