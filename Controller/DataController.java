package Controller;
import java.util.ArrayList;
import Controller.Model.*;

public class DataController{
    private Database database = new Database();
    private ArrayList<Citizens> citizensList = new ArrayList<>(database.getCitizensList());
    private ArrayList<Shelters> sheltersList = new ArrayList<>(database.getSheltersList());
    private ArrayList<Assignments> assignmentsList = new ArrayList<>(database.getAssignmentsList());
    
    public DataController() {}

    public ArrayList<Citizens> getCitizensList() {
        return citizensList;
    }

    public ArrayList<Shelters> getSheltersList() {
        return sheltersList;
    }

    public ArrayList<Assignments> getAssignmentsList() {
        return assignmentsList;
    }

}
