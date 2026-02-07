import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import Controller.DataController;
import Controller.Model.TypeCitizens;

public class RegisterScreen {
    Main m;
    DataController dataController = new DataController();
    JFrame main;
    JPanel panel;
    JLabel normalHeader;
    JLabel riskHeader;
    JLabel vipHeader;
    JButton backButton;
    ArrayList<JButton> normalButtons = new ArrayList<>();
    ArrayList<JButton> riskButtons = new ArrayList<>();
    ArrayList<JButton> vipButtons = new ArrayList<>();

    RegisterScreen() {
        main = new JFrame("Register Citizens");
        main.setExtendedState(JFrame.MAXIMIZED_BOTH);
        detailSW();
        main.setLayout(null);
        main.setVisible(true);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void detailSW() {
        panel = new JPanel();
        normalHeader = new JLabel("Normal Citizens");
        riskHeader = new JLabel("Risk Citizens");
        vipHeader = new JLabel("VIP Citizens");
        
        normalHeader.setBounds(400, 100, 200, 50);
        addButtonCitizen(TypeCitizens.NORMAL, 400, 100);


        riskHeader.setBounds(900, 100, 200, 50);
        addButtonCitizen(TypeCitizens.RISK, 900, 100);

        vipHeader.setBounds(1400, 100, 200, 50);
        addButtonCitizen(TypeCitizens.VIP, 1400, 100);

        backButton = new JButton("Back");
        backButton.setBounds(1700, 50, 200, 50);

        buttonAction();

        main.add(normalHeader);
        main.add(riskHeader);
        main.add(vipHeader);
        main.add(backButton);
    }

    void addButtonCitizen(TypeCitizens typeCitizens, int posX, int posY) {
        String citizenID;
        int idx = 0;
        for(int i = 0; i < dataController.getCitizensList().size(); i++) {
            if(dataController.getCitizensList().get(i).getTypeCitizens() == typeCitizens && typeCitizens == TypeCitizens.NORMAL) {
                citizenID = dataController.getCitizensList().get(i).getCitizenID();
                normalButtons.add(new JButton(citizenID));
                normalButtons.get(idx).setBounds(posX, posY + ((idx + 1) * 50), 200, 50);
                main.add(normalButtons.get(idx));
                idx++;
            }
            else if(dataController.getCitizensList().get(i).getTypeCitizens() == typeCitizens && typeCitizens == TypeCitizens.RISK) {
                citizenID = dataController.getCitizensList().get(i).getCitizenID();
                riskButtons.add(new JButton(citizenID));
                riskButtons.get(idx).setBounds(posX, posY + ((idx + 1) * 50), 200, 50);
                main.add(riskButtons.get(idx));
                idx++;
            }
            else if(dataController.getCitizensList().get(i).getTypeCitizens() == typeCitizens && typeCitizens == TypeCitizens.VIP) {
                citizenID = dataController.getCitizensList().get(i).getCitizenID();
                vipButtons.add(new JButton(citizenID));
                vipButtons.get(idx).setBounds(posX, posY + ((idx + 1) * 50), 200, 50);
                main.add(vipButtons.get(idx));
                idx++;
            }
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
