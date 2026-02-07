import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Controller.DataController;
import Controller.Model.TypeCitizens;

public class SheltersManageScreen {
    DataController dataController = new DataController();
    JFrame main;
    JPanel panel;
    JLabel shelterHeader;
    JLabel riskHeader;
    JLabel vipHeader;
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

        buttonAction();

        main.add(shelterHeader);
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
        
    }
    private class MyActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    }

    public static void main(String[] args) {
        SheltersManageScreen rs = new SheltersManageScreen();

    }
}