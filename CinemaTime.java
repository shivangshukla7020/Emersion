import java.util.*;

class InvalidTimeFormatException extends Exception {
    public InvalidTimeFormatException(String msg) {
        super(msg);
    }
}

public class CinemaTime {
    List<String> titles = new ArrayList<>();
    List<String> times = new ArrayList<>();

    public void addMovie(String title, String time) throws InvalidTimeFormatException {
        if (!isValid(time)) throw new InvalidTimeFormatException("Invalid time format: " + time);
        titles.add(title);
        times.add(time);
    }

    public void searchMovie(String keyword) {
        try {
            for (int i = 0; i < titles.size(); i++) {
                if (titles.get(i).toLowerCase().contains(keyword.toLowerCase())) {
                    System.out.println(titles.get(i) + " - " + times.get(i));
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Search failed: Movie does not exists");
        }
    }

    public void displayAllMovies() {
        for (int i = 0; i < titles.size(); i++) {
            System.out.println((i + 1) + ". " + titles.get(i) + " - " + times.get(i));
        }
    }

    public void generateReport() {
        String[] titleArray = titles.toArray(new String[0]);
        String[] timeArray = times.toArray(new String[0]);

        System.out.println("=== Movie Report ===");
        for (int i = 0; i < titleArray.length; i++) {
            System.out.println(titleArray[i] + " - " + timeArray[i]);
        }
    }

    private boolean isValid(String time) {
        int hours = Integer.parseInt(time.substring(0,2));
        int min = Integer.parseInt(time.substring(3,5));

        return hours >= 0 && hours < 25 && min >= 0 && min < 60;
    }

    public static void main(String[] args) {
        CinemaTime c = new CinemaTime();

        try {
            c.addMovie("Inception", "14:30");
            c.addMovie("Avengers", "19:45");
            c.addMovie("WrongTime", "25:99"); // triggers exception
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }

        c.displayAllMovies();
        c.searchMovie("ven");
        c.generateReport();
    }

    
}
