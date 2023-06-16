public class ticketBookingSystem {
    public static void main(String[] args) {
        TicketBookingService bookingService = new TicketBookingService();

        Thread thread1 = new BookingThread(bookingService, "User1");
        Thread thread2 = new BookingThread(bookingService, "User2");

        thread1.start();
        thread2.start();
    }

    private static class BookingThread extends Thread {
        private final TicketBookingService bookingService;
        private final String username;

        public BookingThread(TicketBookingService bookingService, String username) {
            this.bookingService = bookingService;
            this.username = username;
        }

        @Override
        public void run() {
            bookingService.bookTicket(username);
        }
    }

    private static class TicketBookingService {
        public synchronized void bookTicket(String username) {
            System.out.println(username + " is trying to book a ticket...........");
            try {
                // Simulating ticket booking process
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(username + " has booked a ticket.");
        }
    }
}
