import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        Lease lease1 = new Lease();
        Lease lease2 = new Lease();
        Lease lease3 = new Lease();
        Lease lease4 = new Lease(); 
        
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();

        showValues(lease1);

        lease1.addPetFee();
        showValues(lease1);
        
        showValues(lease2);
        showValues(lease3);
        showValues(lease4); 
    }

    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        Lease lease = new Lease();

        System.out.print("Enter tenant name: ");
        lease.setTenantName(scanner.nextLine());

        System.out.print("Enter apartment number: ");
        lease.setAptNum(scanner.nextInt());

        System.out.print("Enter monthly rent: ");
        lease.setMosRent(scanner.nextDouble());

        System.out.print("Enter term in months: ");
        lease.setTermMos(scanner.nextInt());

        scanner.nextLine(); 
        return lease;
    }

    public static void showValues(Lease lease) {
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getAptNum());
        System.out.println("Monthly Rent: $" + lease.getMosRent());
        System.out.println("Term in Months: " + lease.getTermMos());
        System.out.println("--------------------");
    }
}