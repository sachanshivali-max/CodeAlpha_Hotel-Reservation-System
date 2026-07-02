import java.io.*;
import java.util.*;

// Room class
class Room {
    int id;
    String type;
    double price;
    boolean isAvailable;

    public Room(int id, String type, double price) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.isAvailable = true; // Default room 
    }
}

// Booking class
class Booking {
    String guestName;
    int roomId;
    String bookingId;

    public Booking(String guestName, int roomId) {
        this.guestName = guestName;
        this.roomId = roomId;
        // Unique Booking ID
        this.bookingId = UUID.randomUUID().toString().substring(0, 8);
    }
}

public class HotelReservation {
    // Store room and Bookings
    private static List<Room> rooms = new ArrayList<>();
    private static List<Booking> bookings = new ArrayList<>();
    private static final String FILE_NAME = "bookings.txt";

    public static void main(String[] args) {
        // Add Initial rooms 
        rooms.add(new Room(101, "Standard", 1000));
        rooms.add(new Room(102, "Deluxe", 2000));
        rooms.add(new Room(103, "Suite", 5000));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- HOTEL RESERVATION SYSTEM ---");
            System.out.println("1. View Rooms | 2. Book Room | 3. Cancel Booking | 4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayRooms();
                    break;
                case 2:
                    System.out.print("Enter Room ID: ");
                    int rId = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Guest Name: ");
                    String name = sc.nextLine();
                    bookRoom(rId, name);
                    break;
                case 3:
                    System.out.print("Enter Booking ID to cancel: ");
                    String bId = sc.next();
                    cancelBooking(bId);
                    break;
                case 4:
                    System.out.println("Exiting System...");
                    System.exit(0);
            }
        }
    }

    // Room List
    private static void displayRooms() {
        for (Room r : rooms) {
            String status = r.isAvailable ? "Available" : "Booked";
            System.out.println("ID: " + r.id + " | Type: " + r.type + " | Price: " + r.price + " | Status: " + status);
        }
    }

    // Booking Room
    private static void bookRoom(int rId, String name) {
        for (Room r : rooms) {
            if (r.id == rId && r.isAvailable) {
                // Payment Simulation
                System.out.println("Payment of Rs." + r.price + " processed successfully!");
                r.isAvailable = false;
                Booking b = new Booking(name, rId);
                bookings.add(b);
                
                // Save in file
                saveBookingToFile(b);
                System.out.println("Booking Successful! Your ID: " + b.bookingId);
                return;
            }
        }
        System.out.println("Error: Room not available or invalid ID.");
    }

    // Booking cancel
    private static void cancelBooking(String bId) {
        Iterator<Booking> iterator = bookings.iterator();
        while (iterator.hasNext()) {
            Booking b = iterator.next();
            if (b.bookingId.equalsIgnoreCase(bId)) {
                // Again available room
                for (Room r : rooms) {
                    if (r.id == b.roomId) {
                        r.isAvailable = true;
                        break;
                    }
                }
                iterator.remove();
                System.out.println("Booking " + bId + " has been cancelled.");
                return;
            }
        }
        System.out.println("Booking ID not found!");
    }

    private static void saveBookingToFile(Booking b) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(b.bookingId + "," + b.guestName + "," + b.roomId);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving to file.");
        }
    }
}