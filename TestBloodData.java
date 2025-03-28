
import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BloodData blood1 = new BloodData(); 
        BloodData blood2 = new BloodData(); 

        System.out.println("Enter Blood Type(O, A, B, AB): ");
        String bt = input.next();
        System.out.println("Enter Rh Factor(+, -): ");
        char rh = input.next().charAt(0);
        blood2 = new BloodData(bt, rh);

        System.out.println("\nDetails of BloodData Objects:");
        System.out.print("Object 1: "); blood1.display();
        System.out.print("Object 2: "); blood2.display();

        blood1.setBloodType(bt);
        blood1.setRhFactor(rh);

        System.out.println("\nDetails of BloodData Objects after change:");
        System.out.print("Object 1: "); blood1.display();
        System.out.print("Object 2: "); blood2.display();

        input.close();

    }
}