public class Bus {
    private String busNumber;
    private Seat[][] seats;
 
    public Bus() {
        this("DEFAULT", 2);
    }
 
    public Bus(String busNumber, int rows) {
        this.busNumber = busNumber;
        seats = new Seat[rows][4];
 
        int number = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 4; j++) {
                seats[i][j] = new Seat(number);
                number++;
            }
        }
    }
 
    public void displaySeats() {
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ":");
            for (int j = 0; j < seats[i].length; j++) {
                if (j == 2) {
                    System.out.print(" ||");
                }
                Seat s = seats[i][j];
                String status = s.isReserved() ? "X" : "O";
                System.out.print(String.format(" %02d:%s", s.getSeatNumber(), status));
            }
            System.out.println();
        }
    }
 
    public void reserveSeat(int seatNumber) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j].getSeatNumber() == seatNumber) {
                    if (seats[i][j].reserve()) {
                        System.out.println("Reserving Seat " + seatNumber + ": Successful");
                    } else {
                        System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
                    }
                    return;
                }
            }
        }
        System.out.println("Reserving Seat " + seatNumber + ": Seat does not exist");
    }


    public int countAvailableSeats() {
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (!seats[i][j].isReserved()) {
                    count++;
                }
            }
        }
        return count;
    }
}