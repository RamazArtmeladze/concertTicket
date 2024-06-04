import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TicketService {
    public static void main(String[] args) {
        try {

            Ticket emptyTicket = new Ticket();
            Ticket fullTicket = new Ticket("1w34", "mainHall", 123, LocalDateTime.now(), true, 'A', 5.75, new BigDecimal("63.13"));
            Ticket limitedTicket = new Ticket("mainHall", 124, LocalDateTime.now());

            printTicket(emptyTicket);
            printTicket(fullTicket);
            printTicket(limitedTicket);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printTicket(Ticket ticket) {
        System.out.println("Created Ticket Details:");
        System.out.println("ID: " + ticket.getId());
        System.out.println("Concert Hall: " + ticket.getConcertHall());
        System.out.println("Event Code: " + ticket.getEventCode());
        System.out.println("Time: " + ticket.getTime());
        System.out.println("Is Promo: " + ticket.isPromo());
        System.out.println("Stadium Sector: " + ticket.getStadiumSector());
        System.out.println("Max Backpack Weight: " + ticket.getMaxBackpackWeight());
        System.out.println("Price: " + ticket.getPrice());
        System.out.println();
    }
}
