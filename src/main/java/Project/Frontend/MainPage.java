package Project.Frontend;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MainPage extends JFrame {

    public MainPage() {

        this.setTitle("Restaurant POS Application");
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setExtendedState(this.MAXIMIZED_BOTH);
        this.setResizable(false);
        //        this.setSize(500, 500);

        //        this.setVisible(true);

        //        this.setVisible(true);
        this.getContentPane().setBackground(new Color(69, 96, 117));
        //        this.add(dineIn);
        try {
            mainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void mainMenu() throws IOException {

        JLabel name = new JLabel();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        name.setText(dtf.format(now));

        //        this.add(name);

        JPanel orderPanel = new JPanel();
        orderPanel.setBackground(Color.DARK_GRAY);
        orderPanel.setBounds(75, 150, 400, 700);

        JPanel configPanel = new JPanel();
        configPanel.setBackground(Color.DARK_GRAY);
        configPanel.setBounds(Toolkit.getDefaultToolkit().getScreenSize().width - 475, 150, 400, 700);

        JPanel menuPanel = new JPanel();
        menuPanel.setBackground(Color.DARK_GRAY);
        menuPanel.setBounds(((configPanel.getX() + orderPanel.getX()) / 2), 500, 400, 350);

        JButton orderButton = new JButton();
        orderButton.setBackground(Color.white);
        orderButton.setBounds(10, 10, orderPanel.getWidth() - 20, orderPanel.getHeight() - 20);
        orderButton.setText("<html>Place<br/>Order");
        InputStream orderInput = getClass().getClassLoader().getResourceAsStream("images/order.png");
        ImageIcon order = new ImageIcon(ImageIO.read(orderInput));
        order =
                new ImageIcon(
                        order
                                .getImage()
                                .getScaledInstance(
                                        orderPanel.getWidth() - 40,
                                        orderPanel.getWidth() - 40,
                                        java.awt.Image.SCALE_SMOOTH));
        orderButton.setIcon(order);
        orderButton.setVerticalTextPosition(JButton.TOP);
        orderButton.setHorizontalTextPosition(JButton.CENTER);
        orderButton.setFocusable(false);
        orderButton.setFont(new Font("Helvetica Neue", Font.ITALIC, 72));
        orderButton.setBorder(BorderFactory.createEtchedBorder());
        orderButton.addActionListener(e -> onOrderButton());
        orderPanel.add(orderButton);

        JButton menuButton = new JButton();
        menuButton.setBackground(Color.WHITE);
        menuButton.setBounds(10, 10, menuPanel.getWidth() - 20, menuPanel.getHeight() - 20);
        menuButton.setText("Edit Orders");
        menuButton.setFont(new Font("Helvetica Neue", Font.ITALIC, 72));
        menuButton.setBorder(BorderFactory.createEtchedBorder());
        menuButton.setFocusable(false);
        InputStream menuInput = getClass().getClassLoader().getResourceAsStream("images/edit.jpg");
        ImageIcon menu = new ImageIcon(ImageIO.read(menuInput));
        menu =
                new ImageIcon(
                        menu.getImage()
                                .getScaledInstance(
                                        menuPanel.getWidth() / 2,
                                        menuPanel.getWidth() / 2,
                                        java.awt.Image.SCALE_SMOOTH));
        menuButton.setIcon(menu);
        menuButton.setVerticalTextPosition(JButton.TOP);
        menuButton.setHorizontalTextPosition(JButton.CENTER);

        JButton configButton = new JButton();
        configButton.setBackground(Color.WHITE);
        configButton.setBounds(10, 10, configPanel.getWidth() - 20, configPanel.getHeight() - 20);
        configButton.setText("Configurations");
        configButton.setFont(new Font("Helvetica Neue", Font.ITALIC, 45));
        configButton.setBorder(BorderFactory.createEtchedBorder());
        configButton.setFocusable(false);
        InputStream configInput =
                getClass().getClassLoader().getResourceAsStream("images/configure.png");
        ImageIcon config = new ImageIcon(ImageIO.read(configInput));
        config =
                new ImageIcon(
                        config
                                .getImage()
                                .getScaledInstance(
                                        orderPanel.getWidth() - 40,
                                        orderPanel.getWidth() - 40,
                                        java.awt.Image.SCALE_SMOOTH));
        configButton.setIcon(config);
        configButton.setVerticalTextPosition(JButton.TOP);
        configButton.setHorizontalTextPosition(JButton.CENTER);

        configPanel.setLayout(null);
        configPanel.add(configButton);

        menuPanel.setLayout(null);
        menuPanel.add(menuButton);

        orderPanel.setLayout(null);
        this.add(orderPanel);
        this.add(configPanel);
        this.add(menuPanel);
        this.setVisible(true);
    }

    private void onOrderButton() {

        int width = Toolkit.getDefaultToolkit().getScreenSize().width - 200;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height - 200;

        JPanel walkInPanel = new JPanel();
        JPanel dineInPanel = new JPanel();
        JPanel deliveryPanel = new JPanel();
        JPanel pickUpPanel = new JPanel();

        walkInPanel.setBackground(new Color(83, 72, 89));
        dineInPanel.setBackground(new Color(83, 72, 89));
        deliveryPanel.setBackground(new Color(83, 72, 89));
        pickUpPanel.setBackground(new Color(83, 72, 89));

        walkInPanel.setBounds(50, 150, (width / 4) - 100, (height) - 350);
        dineInPanel.setBounds((width / 4) + 50, 150, (width / 4) - 100, (height) - 350);
        deliveryPanel.setBounds((width / 2) + 50, 150, (width / 4) - 100, (height) - 350);
        pickUpPanel.setBounds(3 * (width / 4) + 50, 150, (width / 4) - 100, (height) - 350);

        JButton walkIn = new JButton();
        JButton dineIn = new JButton();
        JButton delivery = new JButton();
        JButton pickUp = new JButton();

        walkIn.setBounds(15, 15, walkInPanel.getWidth() - 30, walkInPanel.getHeight() - 30);
        walkIn.setText("WALK IN");
        walkIn.setHorizontalTextPosition(JButton.CENTER);
        walkIn.setBackground(new Color(251, 208, 208));
        walkIn.setVisible(true);

        dineIn.setBounds(15, 15, dineInPanel.getWidth() - 30, dineInPanel.getHeight() - 30);
        dineIn.setText("DINE IN ");
        dineIn.setHorizontalTextPosition(JButton.CENTER);
        dineIn.setBackground(new Color(251, 208, 208));
        dineIn.setVisible(true);

        delivery.setBounds(15, 15, deliveryPanel.getWidth() - 30, deliveryPanel.getHeight() - 30);
        delivery.setText("DELIVERY");
        delivery.setHorizontalTextPosition(JButton.CENTER);
        delivery.setBackground(new Color(251, 208, 208));
        delivery.setVisible(true);

        pickUp.setBounds(15, 15, pickUpPanel.getWidth() - 30, pickUpPanel.getHeight() - 30);
        pickUp.setText("PICK UP");
        pickUp.setHorizontalTextPosition(JButton.CENTER);
        pickUp.setBackground(new Color(251, 208, 208));
        pickUp.setVisible(true);

        walkInPanel.setLayout(null);
        walkInPanel.add(walkIn);

        dineInPanel.setLayout(null);
        dineInPanel.add(dineIn);

        deliveryPanel.setLayout(null);
        deliveryPanel.add(delivery);

        pickUpPanel.setLayout(null);
        pickUpPanel.add(pickUp);

        JFrame orderFrame = new JFrame();
        orderFrame.setTitle("Place Order");
        orderFrame.setDefaultCloseOperation(orderFrame.DISPOSE_ON_CLOSE);

        orderFrame.setSize(width, height);
        orderFrame.setResizable(false);
        orderFrame.setLocationRelativeTo(null);
        orderFrame.setLayout(null);
        orderFrame.setBackground(new Color(251, 240, 232));
        orderFrame.add(walkInPanel);
        orderFrame.add(dineInPanel);
        orderFrame.add(deliveryPanel);
        orderFrame.add(pickUpPanel);
        orderFrame.setVisible(true);
    }
}
