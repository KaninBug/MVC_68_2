package Controller.Model;
public class Assignments {
    private String citizensID;
    private String shelterID;
    private String dataCome;

    public Assignments(String citizensID, String shelterID, String dataCome) {
        this.citizensID = citizensID;
        this.shelterID = shelterID;
        this.dataCome = dataCome;
    }

    public String getCitizensID() {
        return citizensID;
    }

    public void setCitizensID(String citizensID) {
        this.citizensID = citizensID;
    }

    public String getShelterID() {
        return shelterID;
    }

    public void setShelterID(String shelterID) {
        this.shelterID = shelterID;
    }

    public String getDataCome() {
        return dataCome;
    }

    public void setDataCome(String dataCome) {
        this.dataCome = dataCome;
    }

    
}
