package Controller.Model;
import java.util.ArrayList;

public class Database {
    private ArrayList<Shelters> shelters = new ArrayList<>();
    private ArrayList<Citizens> citizens = new ArrayList<>();
    private ArrayList<Assignments> assignments = new ArrayList<>();

    public Database() {
        // ข้อมูลศูนย์พักพิง
        shelters.add(new Shelters("10000001", "50", "High"));
        shelters.add(new Shelters("10000002", "40", "Low"));
        shelters.add(new Shelters("10000003", "30", "Medium"));
        shelters.add(new Shelters("10000004", "30", "Low"));
        shelters.add(new Shelters("10000005", "40", "Medium"));

        // ข้อมูประชาชน
        citizens.add(new Citizens("2000000000001", "25", "Healthy", "2023-01-15", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000002", "40", "Sick", "2023-02-20", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000003", "30", "Healthy", "2023-03-10", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000004", "55", "Sick", "2023-04-05", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000005", "20", "Healthy", "2023-05-12", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000006", "25", "Healthy", "2023-01-13", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000007", "40", "Sick", "2023-02-14", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000008", "30", "Sick", "2023-03-22", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000009", "55", "Sick", "2023-04-05", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000010", "20", "Sick", "2023-05-12", TypeCitizens.NORMAL));
        citizens.add(new Citizens("2000000000011", "45", "Healthy", "2023-01-15", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000012", "40", "Sick", "2023-02-20", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000013", "50", "Healthy", "2023-03-10", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000014", "65", "Sick", "2023-04-05", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000015", "40", "Healthy", "2023-05-12", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000016", "25", "Sick", "2023-01-13", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000017", "10", "Sick", "2023-02-14", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000018", "80", "Sick", "2023-03-22", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000019", "55", "Sick", "2023-04-05", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000020", "20", "Sick", "2023-05-12", TypeCitizens.RISK));
        citizens.add(new Citizens("2000000000021", "35", "Healthy", "2023-01-15", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000022", "30", "Healthy", "2023-02-20", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000023", "30", "Healthy", "2023-03-10", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000024", "35", "Heilthy", "2023-04-05", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000025", "30", "Healthy", "2023-05-12", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000026", "35", "Healthy", "2023-01-13", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000027", "33", "Sick", "2023-02-14", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000028", "30", "Sick", "2023-03-22", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000029", "35", "Sick", "2023-04-05", TypeCitizens.VIP));
        citizens.add(new Citizens("2000000000030", "30", "Sick", "2023-05-12", TypeCitizens.VIP));

        // ข้อมูลการจัดสรร
        assignments.add(new Assignments("2000000000001", "10000001", "2025-06-01"));
        assignments.add(new Assignments("2000000000012", "10000002", "2025-06-02"));
        assignments.add(new Assignments("2000000000023", "10000003", "2025-06-03"));
        assignments.add(new Assignments("2000000000004", "10000001", "2025-06-04"));
        assignments.add(new Assignments("2000000000015", "10000002", "2025-06-05"));
        assignments.add(new Assignments("2000000000026", "10000003", "2025-06-06"));
    }

    public ArrayList<Shelters> getSheltersList() {
        return shelters;
    }

    public ArrayList<Citizens> getCitizensList() {
        return citizens;
    }

    public ArrayList<Assignments> getAssignmentsList() {
        return assignments;
    }
}
