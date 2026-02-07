package Controller;
import Controller.Model.*;
import java.util.ArrayList;

public class SheltersController {
    DataController dataController = new DataController();
    private ArrayList<Shelters> sheltersList = new ArrayList<>(dataController.getSheltersList());

    public ArrayList<Shelters> getSheltersList() {
        return sheltersList;
    }
}
