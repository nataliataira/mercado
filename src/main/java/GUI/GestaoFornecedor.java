package GUI;

import DAO.FornecedorDAO;
import DTO.Fornecedor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.SQLException;

public class GestaoFornecedor extends JFrameFormat {
    private JTextField txtCodigo;
    private JTextField txtNome;
    private JTextField txtEmail;
    private JTextField txtTelefone;
    private JTextField txtCnpj;
    private JTextField txtEndereco;
    private JButton btnConsultar;
    private JButton btnDeletar;
    private JButton btnAlterar;
    private JButton btnVoltar;

    public GestaoFornecedor() {
        setTitle("Gestão de Fornecedores");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(960, 895);
        setLayout(new BorderLayout());

        JPanel header = new JPanel();
        JPanel footer = new JPanel();
        JPanel main = new JPanel();

        JLabel h1 = new JLabel();

        header.setLayout(new BorderLayout());
        h1.setText("Gestionar Fornecedores");
        h1.setHorizontalAlignment(JLabel.CENTER);
        h1.setVerticalAlignment(JLabel.CENTER);

        h1.setForeground(new Color(0x164e63));
        h1.setFont(new Font("Comic Sans", Font.BOLD, 32));

        header.add(h1);

        header.setBackground(new Color(0xf1f5f9));
        footer.setBackground(new Color(0xffffff));
        main.setBackground(new Color(0xf1f5f9));

        header.setPreferredSize(new Dimension(this.getWidth(), 140));
        footer.setPreferredSize(new Dimension(this.getWidth(), 95));
        main.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));

        ////////////// MAIN COMPONENTS //////////////
        main.setLayout(new BorderLayout());

        JPanel container = new JPanel();
        container.setBackground(new Color(0xffffff));
        container.setPreferredSize(new Dimension(800, 450));

        JPanel margemBottom = this.margemPanel();
        JPanel margemLeft = this.margemPanel();
        JPanel margemRight = this.margemPanel();

        main.add(container, BorderLayout.CENTER);
        main.add(margemBottom, BorderLayout.SOUTH);
        main.add(margemLeft, BorderLayout.EAST);
        main.add(margemRight, BorderLayout.WEST);

        ////////////// CONTAINER COMPONENTS //////////////
        container.setLayout(new BorderLayout());

        JPanel codigoContainer = new JPanel();

        codigoContainer.setBackground(new Color(0xffffff));
        codigoContainer.setPreferredSize(new Dimension(container.getPreferredSize().width, 120));
        codigoContainer.setLayout(new FlowLayout(FlowLayout.CENTER, 8, 6));
        codigoContainer.setBorder(BorderFactory.createCompoundBorder(
                codigoContainer.getBorder(),
                BorderFactory.createEmptyBorder(30, 0, 10, 0)));

        JPanel itemCod = new JPanel();
        itemCod.setBackground(new Color(0xffffff));
        itemCod.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 6));
        itemCod.setPreferredSize(new Dimension(400, 55));

        JLabel labelCodigo = new JLabel();
        ImageIcon iconLabel = new ImageIcon("src/main/java/Interface/imagens/codigo.png");

        labelCodigo.setText("Código");
        labelCodigo.setForeground(new Color(0x164e63));
        labelCodigo.setFont(new Font("Comic Sans", Font.BOLD, 16));
        labelCodigo.setIcon(iconLabel);
        labelCodigo.setVerticalTextPosition(JLabel.CENTER);

        txtCodigo = new JTextField();
        txtCodigo.setBorder(BorderFactory.createLineBorder(new Color(0xf1f5f9)));
        txtCodigo.setBorder(BorderFactory.createCompoundBorder(
                txtCodigo.getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        txtCodigo.setFont(new Font("Comic Sans", Font.PLAIN, 16));
        txtCodigo.setForeground(new Color(0x083344));
        txtCodigo.setBackground(new Color(0xf1f5f9));
        txtCodigo.setPreferredSize(new Dimension(300, 45));

        itemCod.add(labelCodigo);
        itemCod.add(txtCodigo);

        btnConsultar = new JButton();

        btnConsultar.setBackground(new Color(0x155e75));
        btnConsultar.setForeground(new Color(0xffffff));
        btnConsultar.setPreferredSize(new Dimension(150, 45));

        btnConsultar.setText("Consultar");
        btnConsultar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnConsultar.setFocusable(false);
        btnConsultar.addActionListener(this::consultarClick);

        btnDeletar = new JButton();

        btnDeletar.setBackground(new Color(0x991b1b));
        btnDeletar.setForeground(new Color(0xffffff));
        btnDeletar.setPreferredSize(new Dimension(150, 45));

        btnDeletar.setText("Deletar");
        btnDeletar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnDeletar.setFocusable(false);
        btnDeletar.addActionListener(this::deletarClick);

        codigoContainer.add(itemCod);
        codigoContainer.add(btnConsultar);
        codigoContainer.add(btnDeletar);

        JPanel espaco = new JPanel();
        espaco.setBackground(new Color(0xf1f5f9));
        espaco.setPreferredSize(new Dimension(container.getPreferredSize().width, 20));

        JPanel alterarContainer = new JPanel();

        alterarContainer.setBackground(new Color(0xffffff));
        alterarContainer.setPreferredSize(new Dimension(container.getPreferredSize().width, container.getPreferredSize().height - 20));
        alterarContainer.setBorder(BorderFactory.createCompoundBorder(
                alterarContainer.getBorder(),
                BorderFactory.createEmptyBorder(30, 0, 10, 0)));

        JPanel item1 = new JPanel();
        this.formatarItemRegistro(item1, container.getPreferredSize().width - 70);

        JLabel labelNome = new JLabel();
        this.formatarLabel(labelNome, "Nome", "usuario");

        txtNome = new JTextField();
        this.formatarTextField(txtNome);

        JPanel item2 = new JPanel();
        this.formatarItemRegistro(item2, container.getPreferredSize().width - 70);

        JLabel labelEmail = new JLabel();
        this.formatarLabel(labelEmail, "Email", "envelope");

        txtEmail = new JTextField();
        this.formatarTextField(txtEmail);

        JPanel item3 = new JPanel();
        this.formatarItemRegistro(item3, container.getPreferredSize().width - 70);

        JLabel labelTelefone = new JLabel();
        this.formatarLabel(labelTelefone, "Telefone", "telefone");

        txtTelefone = new JTextField();
        this.formatarTextField(txtTelefone);

        JPanel item4 = new JPanel();
        this.formatarItemRegistro(item4, container.getPreferredSize().width - 70);

        JLabel labelCnpj = new JLabel();
        this.formatarLabel(labelCnpj, "CNPJ", "empresa");

        txtCnpj = new JTextField();
        this.formatarTextField(txtCnpj);

        JPanel item5 = new JPanel();
        this.formatarItemRegistro(item5, container.getPreferredSize().width - 70);

        JLabel labelEndereco = new JLabel();
        this.formatarLabel(labelEndereco, "Endereço", "mapa");

        txtEndereco = new JTextField();
        this.formatarTextField(txtEndereco);

        btnAlterar = new JButton();

        btnAlterar.setBackground(new Color(0x115e59));
        btnAlterar.setForeground(new Color(0xffffff));
        btnAlterar.setPreferredSize(new Dimension(360, 45));

        btnAlterar.setText("Alterar Dados");
        btnAlterar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnAlterar.setFocusable(false);
        btnAlterar.addActionListener(this::atualizarClick);

        btnVoltar = new JButton();

        btnVoltar.setBackground(new Color(0x172554));
        btnVoltar.setForeground(new Color(0xffffff));

        btnVoltar.setBounds(530, 70, 200, 45);

        btnVoltar.setText("Voltar");
        btnVoltar.setFont(new Font("Comic Sans", Font.BOLD, 18));
        btnVoltar.setFocusable(false);
        btnVoltar.addActionListener(this::voltarClick);

        JPanel btnEspaco = new JPanel();
        btnEspaco.setBackground(new Color(0xffffff));
        btnEspaco.setLayout(null);
        btnEspaco.setPreferredSize( new Dimension(container.getPreferredSize().width - 70, 120));
        btnEspaco.add(btnAlterar);
        btnEspaco.setBorder(BorderFactory.createCompoundBorder(
                btnEspaco.getBorder(),
                BorderFactory.createEmptyBorder(60, 0, 0, 0)));

        btnEspaco.add(btnVoltar);

        JPanel itemExtra = new JPanel();
        itemExtra.setBackground(new Color(0xffffff));
        itemExtra.setLayout(new BorderLayout());
        itemExtra.add(btnAlterar, BorderLayout.EAST);
        itemExtra.setBorder(BorderFactory.createCompoundBorder(
                itemExtra.getBorder(),
                BorderFactory.createEmptyBorder(20, 0, 0, 0)));

        JPanel itemGrid1 = new JPanel();
        itemGrid1.setBackground(new Color(0xffffff));
        itemGrid1.setLayout(new GridLayout(1, 2, 14, 0));
        itemGrid1.setPreferredSize(new Dimension(container.getPreferredSize().width - 70, 70));

        JPanel itemGrid2 = new JPanel();
        itemGrid2.setBackground(new Color(0xffffff));
        itemGrid2.setLayout(new GridLayout(1, 2, 14, 0));
        itemGrid2.setPreferredSize(new Dimension(container.getPreferredSize().width - 70, 70));

        JPanel itemGrid3 = new JPanel();
        itemGrid3.setBackground(new Color(0xffffff));
        itemGrid3.setLayout(new GridLayout(1, 2, 14, 0));
        itemGrid3.setPreferredSize(new Dimension(container.getPreferredSize().width - 70, 70));

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
        itemGrid1.add(item1);
        itemGrid1.add(item2);
        itemGrid2.add(item3);
        itemGrid2.add(item4);
        itemGrid3.add(item5);
        itemGrid3.add(itemExtra);

        alterarContainer.add(itemGrid1);
        alterarContainer.add(itemGrid2);
        alterarContainer.add(itemGrid3);
        alterarContainer.add(btnEspaco);

        container.add(codigoContainer, BorderLayout.NORTH);
        container.add(espaco, BorderLayout.CENTER);
        container.add(alterarContainer, BorderLayout.SOUTH);

        ////////////////// FOOTER ///////////////////
        JLabel github = new JLabel();

        ImageIcon iconeGithub = new ImageIcon("src/main/java/GUI/imagens/github.png");

        github.setIcon(iconeGithub);
        github.setText("GitHub");
        github.setForeground(new Color(0x164e63));
        github.setFont(new Font("Comic Sans", Font.BOLD, 16));
        github.setHorizontalAlignment(JLabel.CENTER);
        github.setPreferredSize(new Dimension(main.getPreferredSize().width, footer.getPreferredSize().height - 8));

        footer.add(github);

        this.add(header, BorderLayout.NORTH);
        this.add(footer, BorderLayout.SOUTH);
        this.add(main, BorderLayout.CENTER);

        setVisible(true);
    }

    public void voltarClick(ActionEvent e) {
        new CadastroFornecedor();

        this.setVisible(false);
    }

    public void consultarClick(ActionEvent e) {
        String intCodigo = txtCodigo.getText();
        int codigo = Integer.parseInt(intCodigo);

        try {
            FornecedorDAO dao = new FornecedorDAO();
            Fornecedor fornecedor = dao.buscarFornecedor(codigo);

            if (fornecedor != null) {
                txtNome.setText(fornecedor.getNome());
                txtEmail.setText(fornecedor.getEmail());
                txtCnpj.setText(fornecedor.getCnpj());
                txtTelefone.setText(fornecedor.getTelefone());
                txtEndereco.setText(fornecedor.getEndereco());
            }

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }
    }

    public void deletarClick(ActionEvent e) {
        Fornecedor fornecedor = new Fornecedor();

        String intCodigo = txtCodigo.getText();
        int codigo = Integer.parseInt(intCodigo);

        fornecedor.setCodigo(codigo);

        try {
            FornecedorDAO dao = new FornecedorDAO();

            if (dao.excluirFornecedor(fornecedor) == 1){

//              jLabel1.setText("Cliente removido com sucesso");
            } else {
//                jLabel1.setText("Ocorreu um erro");
            }

            this.limparTextFields();

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }
    }

    public void atualizarClick(ActionEvent e) {
        Fornecedor fornecedor = new Fornecedor();

        String intCodigo = txtCodigo.getText();
        int codigo = Integer.parseInt(intCodigo);

        fornecedor.setCodigo(codigo);
        fornecedor.setNome(txtNome.getText());
        fornecedor.setCnpj(txtCnpj.getText());
        fornecedor.setEmail(txtEmail.getText());
        fornecedor.setTelefone(txtTelefone.getText());
        fornecedor.setEndereco(txtEndereco.getText());

        try {
            FornecedorDAO dao = new FornecedorDAO();

            if (dao.atualizarFornecedor(fornecedor) == 1){
                this.limparTextFields();

//                jLabel1.setText("Cliente alterado com sucesso");
            } else {
//                jLabel1.setText("Ocorreu um erro");
            }

            this.limparTextFields();

        } catch (SQLException err) {
            System.err.println(err.getMessage());
        }
    }

    public void limparTextFields() {
        txtCodigo.setText("");
        txtNome.setText("");
        txtEmail.setText("");
        txtTelefone.setText("");
        txtCnpj.setText("");
        txtEndereco.setText("");
    }
}