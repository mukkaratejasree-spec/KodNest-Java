package track.class_Practice;

class Conductor {

    void collect(Money m) {
        System.out.println("Money collected by Conductor");
    }

    Ticket give() {
        Ticket t = new Ticket();
        System.out.println("Ticket issued");
        return t;
    }
}

class Money {
}

class Ticket {
}

public class Passenger {

    public static void main(String[] args) {

        Conductor c = new Conductor();

        Money m = new Money();

        Ticket t = c.give();

        c.collect(m);

        System.out.println(t);

        if (t != null) {
            System.out.println("Ticket collected.");
        } else {
            System.out.println("Ticket not collected");
        }
    }
}