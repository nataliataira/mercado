package GUI;
import DAO.FornecedorDAO;
import DTO.Fornecedor;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class CadastroFornecedor extends JFrameFormat {
    private JTextField txtNome;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextField txtCnpj;
    private JTextField txtEndereco;
    private JButton btnConfirmar;
    private JButton btnGestionar;

    public CadastroFornecedor() {
        setTitle("Cadastro de Fornecedores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(960, 895);
        setLayout(new BorderLayout());

        JPanel header = new JPanel();
        JPanel footer = new JPanel();
        JPanel main = new JPanel();

        header.setBackground(new Color(0xf1f5f9));
        footer.setBackground(new Color(0xffffff));
        main.setBackground(new Color(0xf1f5f9));

        header.setPreferredSize(new Dimension(this.getWidth(), 90));
        footer.setPreferredSize(new Dimension(this.getWidth(), 95));
        main.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));

        ////////////// HEADER //////////////
        JLabel h1 = new JLabel();

        header.setLayout(new BorderLayout());

        h1.setText("Novo Fornecedor");
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setVerticalAlignment(JLabel.CENTER);

        h1.setForeground(new Color(0x164e63));
        h1.setFont(new Font("Comic Sans", Font.BOLD, 32));

        header.add(h1);
        ////////////// MAIN COMPONENTS //////////////
        main.setLayout(new BorderLayout());

        JPanel container = new JPanel();
        container.setBackground(new Color(0xffffff));
        container.setPreferredSize(new Dimension(800, 500));

        JPanel margemBottom = this.margemPanel();
        JPanel margemLeft = this.margemPanel();
        JPanel margemRight = this.margemPanel();

        main.add(container, BorderLayout.CENTER);
        main.add(margemBottom, BorderLayout.SOUTH);
        main.add(margemLeft, BorderLayout.EAST);
        main.add(margemRight, BorderLayout.WEST);

        ////////////// CONTAINER COMPONENTS //////////////
        container.setLayout(new BorderLayout());

        JPanel gestaoFornecedor = new JPanel();

        gestaoFornecedor.setBackground(new Color(0x0891b2));
        gestaoFornecedor.setPreferredSize(new Dimension(360, container.getPreferredSize().height));
        gestaoFornecedor.setLayout(null);

        JLabel h3 = new JLabel();

        h3.setText("Nossos Fornecedores");
        h3.setBounds(40, 150, 300, 55);
        h3.setForeground(new Color(0xffffff));
        h3.setFont(new Font("Comic Sans", Font.BOLD, 24));

        JLabel texto = new JLabel();

        texto.setText("Consulte informações");
        texto.setBounds(40, 220, 300, 55);
        texto.setForeground(new Color(0xffffff));
        texto.setFont(new Font("Comic Sans", Font.PLAIN, 18));

        JLabel texto2 = new JLabel();

        texto2.setText("Atualize e remova");
        texto2.setBounds(40, 250, 300, 55);
        texto2.setForeground(new Color(0xffffff));
        texto2.setFont(new Font("Comic Sans", Font.PLAIN, 18));

        JLabel texto3 = new JLabel();

        texto3.setText("Fornecedores cadastrados.");
        texto3.setBounds(40, 280, 300, 55);
        texto3.setForeground(new Color(0xffffff));
        texto3.setFont(new Font("Comic Sans", Font.PLAIN, 18));

        gestaoFornecedor.add(h3);
        gestaoFornecedor.add(texto);
        gestaoFornecedor.add(texto2);
        gestaoFornecedor.add(texto3);

        btnGestionar = new JButton();
        btnGestionar.setBackground(new Color(0x155e75));
        btnGestionar.setForeground(new Color(0xfffffff));
        btnGestionar.setBounds(40, container.getPreferredSize().height - 150, 280, 55);

        btnGestionar.setText("Gestionar Fornecedores");
        btnGestionar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnGestionar.setFocusable(false);

        btnGestionar.addActionListener(this::gestionarClick);

        gestaoFornecedor.add(btnGestionar);

        JPanel registroContainer = new JPanel();

        registroContainer.setBackground(new Color(0xffffff));
        registroContainer.setPreferredSize(new Dimension(410, container.getHeight()));
        registroContainer.setLayout(new FlowLayout(FlowLayout.LEADING, 8, 6));

        registroContainer.setBorder(BorderFactory.createCompoundBorder(
                registroContainer.getBorder(),
                BorderFactory.createEmptyBorder(0, 0, 0, 70)));

        JLabel h2 = new JLabel();

        h2.setText("Cadastrar");
        h2.setVerticalAlignment(JLabel.CENTER);
        h2.setHorizontalAlignment(JLabel.CENTER);
        h2.setBorder(BorderFactory.createCompoundBorder(
                h2.getBorder(),
                BorderFactory.createEmptyBorder(40, 0, 10, 0)));

        int registroWidth = registroContainer.getPreferredSize().width;
        h2.setPreferredSize(new Dimension(registroWidth - 70, 100));

        h2.setForeground(new Color(0x164e63));
        h2.setFont(new Font("Comic Sans", Font.BOLD, 24));

        JPanel item1 = new JPanel();
        this.formatarItemRegistro(item1, registroWidth - 70);

        JLabel labelNome = new JLabel();
        this.formatarLabel(labelNome, "Nome", "usuario");

        txtNome = new JTextField();
        this.formatarTextField(txtNome);

        JPanel item2 = new JPanel();
        this.formatarItemRegistro(item2, registroWidth - 70);

        JLabel labelEmail = new JLabel();
        this.formatarLabel(labelEmail, "Email", "envelope");

        txtEmail = new JTextField();
        this.formatarTextField(txtEmail);

        JPanel item3 = new JPanel();
        this.formatarItemRegistro(item3, registroWidth - 70);

        JLabel labelTelefone = new JLabel();
        this.formatarLabel(labelTelefone, "Telefone", "telefone");

        txtTelefone = new JTextField();
        this.formatarTextField(txtTelefone);

        JPanel item4 = new JPanel();
        this.formatarItemRegistro(item4, registroWidth - 70);

        JLabel labelCnpj = new JLabel();
        this.formatarLabel(labelCnpj, "CNPJ", "empresa");

        txtCnpj = new JTextField();
        this.formatarTextField(txtCnpj);

        JPanel item5 = new JPanel();
        this.formatarItemRegistro(item5, registroWidth - 70);

        JLabel labelEndereco = new JLabel();
        this.formatarLabel(labelEndereco, "Endereço", "mapa");

        txtEndereco = new JTextField();
        this.formatarTextField(txtEndereco);

        JPanel itemGrid = new JPanel();
        itemGrid.setBackground(new Color(0xffffff));
        itemGrid.setLayout(new GridLayout(1, 2, 8, 0));
        itemGrid.setPreferredSize(new Dimension(registroWidth - 70, 70));

        item1.add(labelNome);
        item1.add(txtNome);
        item2.add(labelEmail);
        item2.add(txtEmail);
        item3.add(labelTelefone);
        item3.add(txtTelefone);
        item4.add(labelCnpj);
        item4.add(txtCnpj);
        item5.add(labelEndereco);
        item5.add(txtEndereco);
        itemGrid.add(item3);
        itemGrid.add(item4);

        btnConfirmar = new JButton();
        btnConfirmar.setBackground(new Color(0x172554));
        btnConfirmar.setForeground(new Color(0xffffff));
        btnConfirmar.setPreferredSize(new Dimension(registroWidth - 70, 55));

        btnConfirmar.setText("Adicionar Fornecedor");
        btnConfirmar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnConfirmar.setFocusable(false);

        btnConfirmar.addActionListener(this::confirmarClick);

        JPanel espaco = new JPanel();
        espaco.setBackground(new Color(0xffffff));
        espaco.setPreferredSize(new Dimension(registroWidth - 70, 10));

        registroContainer.add(h2);
        registroContainer.add(item1);
        registroContainer.add(item2);
        registroContainer.add(itemGrid);
        registroContainer.add(item5);
        registroContainer.add(espaco);
        registroContainer.add(btnConfirmar);

        container.add(gestaoFornecedor, BorderLayout.WEST);
        container.add(registroContainer, BorderLayout.EAST);

        ////////////////// FOOTER ///////////////////
        JLabel github = new JLabel();

        ImageIcon iconeGithub = new ImageIcon("src/main/java/GUI/imagens/github.png");

        github.setIcon(iconeGithub);
        github.setText("GitHub");
        github.setForeground(new Color(0x164e63));
        github.setFont(new Font("Comic Sans", Font.BOLD, 16));
        github.setHorizontalAlignment(JLabel.CENTER);
        github.setVerticalTextPosition(JLabel.CENTER);
        github.setPreferredSize(new Dimension(main.getPreferredSize().width, footer.getPreferredSize().height - 8));

        footer.add(github);

        /////////////////////////////////////////////
        this.add(header, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
        this.add(main, BorderLayout.CENTER);

        setVisible(true);
    }

    public void confirmarClick(ActionEvent e) {
        Fornecedor novoFornecedor = new Fornecedor();

        novoFornecedor.setNome(txtNome.getText());
        novoFornecedor.setCnpj(txtCnpj.getText());
        novoFornecedor.setEmail(txtEmail.getText());
        novoFornecedor.setTelefone(txtTelefone.getText());
        novoFornecedor.setEndereco(txtEndereco.getText());

        try {
            FornecedorDAO dao = new FornecedorDAO();

            if (dao.inserirFornecedor(novoFornecedor) == 1)
                this.limparTextFields();

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }
    }

    public void gestionarClick(ActionEvent e) {
        new GestaoFornecedor();

        this.setVisible(false);
    }

    public void limparTextFields() {
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCnpj.setText("");
        txtEndereco.setText("");
    }
}
