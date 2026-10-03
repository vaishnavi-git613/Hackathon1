import java.util.Scanner;
public class WasteCollectionVehicle {
    public static void main(String[] args) {
        // Variable declarations and storing details
        int vehicleNumber = 402;
        double wasteCollectedKg = 1250.75;
        int collectionPoints = 18;
        char vehicleStatus = 'A'; // 'A' for Active, 'M' for Maintenance, 'I' for Idle

        // Displaying the vehicle details
        System.out.println("=================================");
        System.out.println("  WASTE COLLECTION VEHICLE DETAILS");
        System.out.println("=================================");
        System.out.println("Vehicle Number           : " + vehicleNumber);
        System.out.println("Waste Collected (in kg)  : " + wasteCollectedKg + " kg");
        System.out.println("Collection Points        : " + collectionPoints);
        System.out.println("Vehicle Status           : " + vehicleStatus);
        System.out.println("=================================");
    }
}