import java.util.ArrayList;
import java.util.List;

public class SeatSelection {

    private List<Seat> seats;

    public SeatSelection() {

        seats = new ArrayList<>();

        for (char row = 'A'; row <= 'C'; row++) {

            for (int number = 1; number <= 5; number++) {

                seats.add(
                    new Seat(row + String.valueOf(number))
                );
            }
        }
    }

    public void displaySeats() {

        for (Seat seat : seats) {

            if (seat.isBooked()) {
                System.out.print("[X] ");
            } else {
                System.out.print(
                    "[" + seat.getSeatNumber() + "] "
                );
            }

            if (seat.getSeatNumber().endsWith("5")) {
                System.out.println();
            }
        }
    }

    public boolean selectSeat(String seatNumber) {

        for (Seat seat : seats) {

            if (seat.getSeatNumber()
                    .equalsIgnoreCase(seatNumber)) {

                if (seat.isBooked()) {

                    System.out.println(
                        "Seat " + seatNumber +
                        " is already booked."
                    );

                    return false;
                }

                seat.book();

                System.out.println(
                    "Seat " + seatNumber +
                    " booked successfully."
                );

                return true;
            }
        }

        System.out.println("Invalid seat number.");

        return false;
    }
}