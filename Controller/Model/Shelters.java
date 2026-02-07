package Controller.Model;
public class Shelters {
    private String sheltersID;
    private String max;
    private String riskLevel;

    public Shelters(String sheltersID, String max, String riskLevel) {
        this.sheltersID = sheltersID;
        this.max = max;
        this.riskLevel = riskLevel;
    }
    
    public String getSheltersID() {
        return sheltersID;
    }
    public void setSheltersID(String sheltersID) {
        this.sheltersID = sheltersID;
    }
    public String getMax() {
        return max;
    }
    public void setMax(String max) {
        this.max = max;
    }
    public String getRiskLevel() {
        return riskLevel;
    }
    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    
}
