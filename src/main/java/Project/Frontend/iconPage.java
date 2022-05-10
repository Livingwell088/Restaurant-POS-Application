package Project.Frontend;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.*;

public class iconPage extends JFrame {

    public iconPage() throws HeadlessException {
        //        JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setTitle("Ming House");
        this.setResizable(false);
    }

    public void logoPage() throws IOException {

        JLabel label = new JLabel();

        InputStream stream = getClass().getClassLoader().getResourceAsStream("images/building.png");
        ImageIcon building = new ImageIcon(ImageIO.read(stream));
        building =
                new ImageIcon(
                        building
                                .getImage()
                                .getScaledInstance(
                                        Toolkit.getDefaultToolkit().getScreenSize().width / 3,
                                        Toolkit.getDefaultToolkit().getScreenSize().width / 3,
                                        java.awt.Image.SCALE_SMOOTH));

        InputStream bg = getClass().getClassLoader().getResourceAsStream("images/iconBackground.jpg");
        ImageIcon background = new ImageIcon(ImageIO.read(bg));
        background =
                new ImageIcon(
                        background
                                .getImage()
                                .getScaledInstance(
                                        Toolkit.getDefaultToolkit().getScreenSize().width,
                                        Toolkit.getDefaultToolkit().getScreenSize().height,
                                        java.awt.Image.SCALE_SMOOTH));
        label.setIcon(background);
        label.setBounds(
                0,
                0,
                Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);
        this.add(label);
        this.setVisible(true);

        JButton button = new JButton();
        button.setBounds(
                0,
                0,
                Toolkit.getDefaultToolkit().getScreenSize().width,
                Toolkit.getDefaultToolkit().getScreenSize().height);
        button.setIcon(building);
        button.setText("Ming House");
        button.setVerticalTextPosition(JButton.TOP);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setFont(new Font("Helvetica Neue", Font.ITALIC, 100));
        button.setFocusable(false);
        button.setBorder(BorderFactory.createEmptyBorder());
        button.setForeground(Color.WHITE);
        button.setBackground(Color.GRAY);
        button.addActionListener(e -> toMainPage());
        //        button.setOpaque(false);
        this.add(button);
    }

    private void toMainPage() {
        this.setVisible(false);
        new MainPage().setVisible(true);
    }
}
