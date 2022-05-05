package Project.Frontend;

import java.awt.*;
import javax.swing.*;

public class MainPage extends JFrame {

  public MainPage() {
    this.setVisible(true);
    this.setTitle("Restaurant POS Application");
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setExtendedState(this.MAXIMIZED_BOTH);
    this.setResizable(false);
    this.setVisible(true);
    //    this.getContentPane().setBackground(new Color(69, 96, 117));
    //    this.getContentPane().setBackground(Color.WHITE);
  }

  public void logoPage() {
    ImageIcon building = new ImageIcon("Project/Building.png");
    JLabel label = new JLabel();
    //    label.setText("Ming House");
    label.setIcon(building);
    //    label.setIconTextGap(-25);
    //    label.setForeground(Color.WHITE);
    //    label.setBackground(Color.BLACK);
    //    label.setHorizontalTextPosition(JLabel.CENTER);
    //    label.setVerticalTextPosition(JLabel.TOP);
    //    label.setOpaque(true);
    //    label.setFont(new Font("Serif Bold Italic", Font.ITALIC, 72));
    this.add(label);
  }
}
