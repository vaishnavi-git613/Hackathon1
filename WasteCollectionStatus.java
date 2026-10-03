import java.util.Scanner;

public class WasteCollectionStatus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read waste collected in kilograms
        System.out.print("Enter waste collected (in kg): ");
        double wasteCollected = scanner.nextDouble();

        // Check status based on the threshold
        if (wasteCollected >= 100) {
            System.out.println("Collection Target Achieved");
        } else {
            System.out.println("More Waste Collection Required");
        }

        scanner.close();
    }
}
