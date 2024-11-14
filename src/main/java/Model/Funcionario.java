package Model;

public abstract class Funcionario {
    private int codigo;
    private String nome;
    private String CPF;
    private String endereco;
    private String telefone;
    private String email;

    public Funcionario(int codigo, String nome, String CNPJ, String endereco, String telefone, String email) throws IllegalArgumentException {
        setCodigo(codigo);
        setNome(nome);
        setCNPJ(CNPJ);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null)
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) throws IllegalArgumentException {
        int TAM_CPF = 11;
        if (CNPJ == null) {
            throw new IllegalArgumentException("CPF não pode ser vazio.");
        }
        else if (CPF.length() < TAM_CPF)
        {
            throw new IllegalArgumentException("CPF muito curto.");
        }
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) throws IllegalArgumentException {
        if (endereco == null) {
            throw new IllegalArgumentException("Endereço não pode ser vazio.");
        }
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) throws IllegalArgumentException {
        int TAM_MIN_TEL = 9;
        if (telefone == null) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }
        else if (telefone.length() < TAM_MIN_TEL)
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) throws IllegalArgumentException {
        int posArroba = email.indexOf('@');
        if (!(posArroba > 0 && posArroba < email.length() - 1)) {
            throw new IllegalArgumentException("Email inválido.");
        }
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
        System.out.println("cnpj: "+getCNPJ());
        System.out.println("endereço : "+getEndereco());
        System.out.println("telefone : "+getTelefone());
        System.out.println("email : "+getEmail());
    }
}
