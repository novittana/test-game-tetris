
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String args[]){
        JFrame frame = new JFrame("Tetris");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 800);

        JPanel panel = new JPanel(new FlowLayout());
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton startButton = new JButton("Play");
        JButton exitButton = new JButton("Exit");

        startButton.setPreferredSize(new Dimension(100, 50));
        exitButton.setPreferredSize(new Dimension(100, 50));

        Border roundedBorder = new LineBorder(Color.WHITE, 2, true);
        startButton.setBorder(roundedBorder);
        exitButton.setBorder(roundedBorder);

        startButton.setBackground(Color.ORANGE);
        startButton.setForeground(Color.WHITE);

        Font font = startButton.getFont().deriveFont(Font.BOLD, 26);
        startButton.setFont(font);
        exitButton.setFont(font);

//            Insets insets = new Insets(10, 30, 10, 30); // встановлюємо відступи для всіх сторін
        startButton.setMargin(new Insets(10, 30, 10, 30));
//            exitButton.setMargin(insets);


        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Цей код буде виконаний при натисканні кнопки button1
                System.out.println("Button 1 clicked");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        panel.add(startButton);
        panel.add(exitButton);

        frame.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.getContentPane().add(panel, gbc);

        frame.setVisible(true);
    }

}