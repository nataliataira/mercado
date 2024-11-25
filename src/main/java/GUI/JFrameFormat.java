package GUI;

import javax.swing.*;
import java.awt.*;

public class JFrameFormat extends JFrame {

    public JPanel margemPanel() {
        JPanel margem = new JPanel();
        margem.setBackground(new Color(0xf1f5f9));
        margem.setPreferredSize(new Dimension(60, 60));

        return margem;
    }

    public void formatarItemRegistro(JPanel item, int width) {
        item.setBackground(new Color(0xffffff));
        item.setLayout(new GridLayout(2, 1));
        item.setPreferredSize(new Dimension(width, 80));
    }

    public void formatarLabel(JLabel label, String texto, String icone) {
        ImageIcon iconLabel = new ImageIcon("src/main/java/GUI/imagens/" + icone + ".png");

        label.setText(texto);
        label.setForeground(new Color(0x164e63));
        label.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        label.setIcon(iconLabel);
        label.setVerticalTextPosition(JLabel.CENTER);
    }

    public void formatarTextField(JTextField textField) {
        textField.setBorder(BorderFactory.createLineBorder(new Color(0xf1f5f9)));
        textField.setBorder(BorderFactory.createCompoundBorder(
                textField.getBorder(),
                BorderFactory.createEmptyBorder(5, 10, 5, 10)));

        textField.setFont(new Font("Comic Sans", Font.PLAIN, 15));
        textField.setForeground(new Color(0x083344));
        textField.setBackground(new Color(0xf1f5f9));
    }
}