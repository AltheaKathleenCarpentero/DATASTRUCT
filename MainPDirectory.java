import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MainPDirectory{
    public static void main(String[] args) {
        PDirectory phoneDirectory = new PDirectory(30);

        phoneDirectory.addCont("Jasmin", "09612822092");
        phoneDirectory.addCont("Jojo", "09202627090");
        phoneDirectory.addCont("Jazelle", "09205703793");
        phoneDirectory.addCont("James", "444-555-6666");
        phoneDirectory.addCont("Daniel", "777-888-9999");
        phoneDirectory.addCont("Andy", "100-200-3000");
        phoneDirectory.addCont("Enrique", "400-500-6000");
        phoneDirectory.addCont("Donny", "700-800-9000");
        phoneDirectory.addCont("Richard", "123-567-8901");
        phoneDirectory.addCont("Ace", "987-654-3211");

        Scanner scanner = new Scanner(System.in);
        String name;

        while (true) {
            System.out.print("Enter a name (or 'quit' to exit): ");
            name = scanner.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            String phoneNumber = phoneDirectory.getPNum(name);
            if (phoneNumber != null) {
                System.out.println("Phone number: " + phoneNumber);
            } else {
                if (phoneDirectory.isFull()) {
                    System.out.println("Phone directory is full. Cannot add new contact.");
                    break;
                } else {
                    System.out.print("Name not found. Enter phone number for " + name + ": ");
                    String newPhoneNumber = scanner.nextLine();
                    phoneDirectory.addCont(name, newPhoneNumber);
                    System.out.println("Contact added.");
                }
            }
        }

        scanner.close();
    }
}