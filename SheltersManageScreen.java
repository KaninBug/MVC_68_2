import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import Controller.DataController;

public class SheltersManageScreen {
    Main m;
    DataController dataController = new DataController();
    JFrame main;
    JPanel panel;
    JLabel shelterHeader;
    JLabel riskHeader;
    JLabel vipHeader;
    JButton backButton;
    ArrayList<JButton> shelterButtons = new ArrayList<>();

    SheltersManageScreen() {
        main = new JFrame("Report Shelters");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailSW();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailSW() {
        panel = new JPanel();
        shelterHeader = new JLabel("All Shelters");
        
        shelterHeader.setBounds(400, 100, 200, 50);
        addButtonShelter(400, 100);

        backButton = new JButton("Back");
        backButton.setBounds(1700, 50, 200, 50);

        buttonAction();

        main.add(shelterHeader);
        main.add(backButton);
    }

    void addButtonShelter(int posX, int posY) {
        String sheltersID;
        for(int i = 0; i < dataController.getSheltersList().size(); i++) {
            sheltersID = dataController.getSheltersList().get(i).getSheltersID();
            shelterButtons.add(new JButton(sheltersID));
            shelterButtons.get(i).setBounds(posX, posY + ((i + 1) * 50), 200, 50);
            main.add(shelterButtons.get(i));
        }
    }

    void buttonAction() {
        MyActionListener listener = new MyActionListener();
        backButton.addActionListener(listener);
        
    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton)e.getSource();
            if(source == backButton) {
                m = new Main();
                main.dispose();
            }
        }
    }
}