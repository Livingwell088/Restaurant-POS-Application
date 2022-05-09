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
        this.getContentPane().setBackground(new Color(69, 96, 117));
        //    this.getContentPane().setBackground(Color.WHITE);
    }
}
