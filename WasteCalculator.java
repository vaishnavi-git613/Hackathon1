import java.util.Scanner;

public class WasteCalculator {

    // Method to calculate and return total waste collected
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading waste collected at two points
        System.out.print("Enter waste collected at Collection Point 1 (in kg): ");
        double point1Waste = scanner.nextDouble();

        System.out.print("Enter waste collected at Collection Point 2 (in kg): ");
        double point2Waste = scanner.nextDouble();

        // Calling the method to calculate total waste
        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        // Displaying the result
        System.out.printf("Total Waste Collected: %.2f kg%n", totalWaste);

        scanner.close();
    }
}