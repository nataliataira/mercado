package Model;

public class Cliente {
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private String email;

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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public void atualizarDados(String endereco, String telefone, String email) throws IllegalArgumentException {
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    public void consultarDados()
    {
        System.out.println("Consulta ao funcionário");
        System.out.println("nome: "+getNome());
        System.out.println("cnpj: "+getCPF());
        System.out.println("endereço : "+getEndereco());
        System.out.println("telefone : "+getTelefone());
        System.out.println("email : "+getEmail());
    }
}
