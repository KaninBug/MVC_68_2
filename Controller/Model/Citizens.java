package Controller.Model;
public class Citizens {
    private String citizenID;
    private String age;
    private String health;
    private String registerDate;
    private TypeCitizens typeCitizens;

    public Citizens(String citizenID, String age, String health, String registerDate, TypeCitizens typeCitizens) {
        this.citizenID = citizenID;
        this.age = age;
        this.health = health;
        this.registerDate = registerDate;
        this.typeCitizens = typeCitizens;
    }

    public String getCitizenID() {
        return citizenID;
    }

    public void setCitizenID(String citizenID) {
        this.citizenID = citizenID;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public TypeCitizens getTypeCitizens() {
        return typeCitizens;
    }

    public void setTypeCitizens(TypeCitizens typeCitizens) {
        this.typeCitizens = typeCitizens;
    }
}
