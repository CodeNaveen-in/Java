// Covariant Arrays in Java (Problematic)
class Ticket {}
class ETicket extends Ticket {}

public class Eg6 {
    public static void main(String[] args) {
        ETicket[] eTickets = new ETicket[10];
        Ticket[] tickets = eTickets; // Allowed (covariant)

        tickets[0] = new ETicket();
        tickets[1] = new Ticket(); //runtime error
    }
}
