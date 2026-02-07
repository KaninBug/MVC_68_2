import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Controller.DataController;


public class ReportScreen {
    DataController dataController = new DataController();
    JFrame main;
    JPanel panel;
    JLabel shelterHeader1;
    JLabel shelterHeader2;

    ArrayList<JButton> haveShelterButtons = new ArrayList<>();
    ArrayList<JButton> noShelterButtons = new ArrayList<>();
    ArrayList<JButton> vipButtons = new ArrayList<>();

    ReportScreen() {
        main = new JFrame("Report Citizens");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailSW();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailSW() {
        panel = new JPanel();

        shelterHeader1 = new JLabel("Have Shelter");
        shelterHeader1.setBounds(400, 100, 200, 50);
        addButtonReport(true, 400, 100);

        shelterHeader2 = new JLabel("Don't Have Shelters");
        shelterHeader2.setBounds(1000, 100, 200, 50);
        addButtonReport(false, 1000, 100);

        buttonAction();

        main.add(shelterHeader1);
        main.add(shelterHeader2);
    }

    void addButtonReport(boolean haveShelter, int posX, int posY) {
        String citizenID;
        int idx = 0;
        if(haveShelter) {
            for(int i = 0; i < dataController.getAssignmentsList().size(); i++) {
                citizenID = dataController.getAssignmentsList().get(i).getCitizensID();
                haveShelterButtons.add(new JButton(citizenID));
                haveShelterButtons.get(idx).setBounds(posX, posY + ((i + 1) * 50), 200, 50);
                main.add(haveShelterButtons.get(idx));
                idx++;
            }
        }
        else {
            for(int i = 0; i < dataController.getCitizensList().size(); i++) {
                citizenID = dataController.getCitizensList().get(i).getCitizenID();
                for(int j = 0; j < dataController.getAssignmentsList().size(); j++) {
                    if(citizenID != dataController.getAssignmentsList().get(j).getCitizensID()) {
                        noShelterButtons.add(new JButton(citizenID));
                        noShelterButtons.get(idx).setBounds(posX, posY + ((i + 1) * 50), 200, 50);
                        main.add(noShelterButtons.get(idx));
                        idx++;
                    }
                }
            }
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
        ReportScreen rs = new ReportScreen();

    }
}

