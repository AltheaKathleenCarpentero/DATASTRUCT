
import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Patient patient1 = new Patient(); 

        System.out.println("Enter details for Patient 2:");
        System.out.print("ID: ");
        String id2 = input.next();
        System.out.print("Age: ");
        int age2 = input.nextInt();
        System.out.print("Blood Type: ");
        String bt2 = input.next();
        System.out.println("Rh Factor: ");
        char rh2 = input.next().charAt(0);
        Patient patient2 = new Patient(id2, age2, bt2, rh2);


        System.out.println("Enter details for Patient 3:");
        System.out.print("ID: ");
        String id3 = input.next();
        System.out.print("Age: ");
        int age3 = input.nextInt();
        Patient patient3 = new Patient(id3, age3, "O", '+');


        System.out.println("\nPatient Details:");
        System.out.print("Patient 1: "); patient1.display();
        System.out.print("Patient 2: "); patient2.display();
        System.out.print("Patient 3: "); patient3.display();

        input.close();
    }
}