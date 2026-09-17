import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        SeatSelection seatSelection =
                new SeatSelection();

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== MOVIE BOOKING SYSTEM =====");

        seatSelection.displaySeats();

        System.out.print("Enter seat number: ");

        String seatNumber = scanner.nextLine();

        seatSelection.selectSeat(seatNumber);

        System.out.println("\nUpdated Seats:");

        seatSelection.displaySeats();

        scanner.close();
    }
}