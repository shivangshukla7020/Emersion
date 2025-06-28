import java.util.*;

public class FlightBookingSystem {

    private static class Flight {
        private static int idInitializer = 1;
        private int id;
        private String source;
        private String destination;
        private String time;
        private Set<Integer> users;

        public Flight(String source, String destination, String time) {
            this.id = idInitializer++;
            this.source = source;
            this.destination = destination;
            this.time = time;
            this.users = new HashSet();
        }

        public int getId() {
            return id;
        }

        public String toString() {
            return "Flight ID: " + id + ", From: " + source + ", To: " + destination + ", Time: " + time;
        }
    }

    private static class User {
        private static int idInitializer = 1;
        private int id;
        private String name;
        private int age;

        public User(String name, int age) {
            this.id = idInitializer++;
            this.name = name;
            this.age = age;
        }

        public int getId() {
            return id;
        }

        public String toString() {
            return "User ID: " + id + ", Name: " + name + ", Age: " + age;
        }
    }

    private List<Flight> flights;
    private List<User> users;
    private Map<Integer, Integer> bookings;
    private Map<Integer, Set<Integer>> attendants;

    public FlightBookingSystem() {
        this.flights = new ArrayList<>();
        this.users = new ArrayList<>();
        this.bookings = new HashMap<>();
        this.attendants = new HashMap<>();
    }

    public void addFlight(String source, String destination, String time) {
        Flight f = new Flight(source, destination, time);
        this.attendants.put(f.id, new HashSet<>());
        flights.add(f);
    }

    public void addUser(String name, int age) {
        User u = new User(name, age);
        users.add(u);
    }

    public void bookFlight(int userId, int flightId) {
        this.bookings.put(userId, flightId);
        this.attendants.get(flightId).add(userId);
    }

    public void getFlight(int id) {
        for (Flight f : flights) {
            if (f.getId() == id) {
                System.out.println(f);
                return;
            }
        }
        System.out.println("Flight not found.");
    }

    public void getAttendantsOf(int flightId){
        System.out.println("All the attendants of flight" + flightId + " are : ");
        for(int i : attendants.get(flightId)){
            getUser(i);
        }
    }

    public void getUser(int id) {
        for (User u : users) {
            if (u.getId() == id) {
                System.out.println(u);
                return;
            }
        }
        System.out.println("User not found.");
    }

    public void getBooking(int userId) {
        if (bookings.containsKey(userId)) {
            int flightId = bookings.get(userId);
            getFlight(flightId);
        } else {
            System.out.println("No booking found for user ID: " + userId);
        }
    }

    public static void main(String[] args) {
        FlightBookingSystem system = new FlightBookingSystem();
        system.addFlight("Delhi", "Mumbai", "10:00 AM");
        system.addFlight("Bangalore", "Chennai", "2:00 PM");
        system.addUser("Alice", 30);
        system.addUser("Bob", 25);
        system.bookFlight(1, 1);
        system.getUser(1);
        system.getBooking(1);
        system.getAttendantsOf(1);

    }
}
