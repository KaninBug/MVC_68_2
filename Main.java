import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Controller.DataController;

public class Main {
    DataController dataController = new DataController();
    JFrame main;
    JPanel panel;
    JButton reportButton;
    JButton registerButton;
    JButton shelterButton;
    ArrayList<JButton> normalButtons = new ArrayList<>();
    ArrayList<JButton> riskButtons = new ArrayList<>();
    ArrayList<JButton> vipButtons = new ArrayList<>();

    Main() {
        main = new JFrame("Main Page");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailSW();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailSW() {
        panel = new JPanel();

        shelterButton = new JButton("Shelter Report");
        shelterButton.setBounds(400, 100, 200, 50);

        reportButton = new JButton("Citizens Report");
        reportButton.setBounds(800, 100, 200, 50);

        registerButton = new JButton("Register Citizens");
        registerButton.setBounds(1200, 100, 200, 50);

        buttonAction();

        main.add(shelterButton);
        main.add(reportButton);
        main.add(registerButton);
    }


    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        
    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    public static void main(String[] args) {
        Main rs = new Main();

    }
}
