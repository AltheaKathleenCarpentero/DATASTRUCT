public class Lease {
    private String tenantName;
    private int aptNum;
    private double mosRent;
    private int termMos;

    public Lease() {
        tenantName = "XXX";
        aptNum = 0;
        mosRent = 1000;
        termMos = 12;
    }

    public String getTenantName() {
        return tenantName;
    }
    public void setTenantName(String name) {
        tenantName = name;
    }

    public int getAptNum() {
        return aptNum;
    }
    public void setAptNum(int num) {
        aptNum = num;
    }

    public double getMosRent() {
        return mosRent;
    }
    public void setMosRent(double mRent) {
        mosRent = mRent;
    }

    public int getTermMos() {
        return termMos;
    }
    public void setTermMos(int tMos) {
        termMos = tMos;
    }


    public void addPetFee() {
        this.mosRent += 10;
        explainPetPolicy();
    }

    public static void explainPetPolicy() {
        System.out.println("Pet policy: An additional $10 per month will be deducted for the pets.");
    }
}