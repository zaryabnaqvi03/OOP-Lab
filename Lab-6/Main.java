public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("BUS-101", 3);
        System.out.println("Bus Number: BUS-101");
        System.out.println("Initial Seating Arrangement:");
        bus.displaySeats();
        System.out.println("Available Seats: " + bus.countAvailableSeats());
 
        bus.reserveSeat(2);
        bus.reserveSeat(6);
        bus.reserveSeat(11);
        bus.reserveSeat(6);
 
        System.out.println("Updated Seating Arrangement:");
        bus.displaySeats();
        System.out.println("Available Seats: " + bus.countAvailableSeats());
 
        Bus defaultBus = new Bus();
        System.out.println("Default Bus:");
        defaultBus.displaySeats();
        System.out.println("Available Seats: " + defaultBus.countAvailableSeats());
    }
}