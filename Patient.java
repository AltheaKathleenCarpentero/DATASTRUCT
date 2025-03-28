
public class Patient {
    private String idNumber;
    private int age;
    private BloodData bloodData;

    public Patient() {
        this.idNumber = "12345678";
        this.age = 0;
        this.bloodData = new BloodData();     }

    public Patient(String idNumber, int age, String bloodType, char rhFactor) {
        this.idNumber = idNumber;
        this.age = age;
        this.bloodData = new BloodData(bloodType, rhFactor);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }

    public void display() {
        System.out.println("ID: " + idNumber + ", Age: " + age + ", ");
        bloodData.display();
    }
}